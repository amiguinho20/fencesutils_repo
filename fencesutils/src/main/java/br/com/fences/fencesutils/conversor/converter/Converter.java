package br.com.fences.fencesutils.conversor.converter;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;

import org.bson.Document;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * Conversao para o documento do MongoDB
 * @param <T> Tipo de Objeto para conversao.
 */
public abstract class Converter<T> {

	protected Gson gson = new GsonBuilder()
			.registerTypeHierarchyAdapter(Collection.class, new ColecaoJsonAdapter())
			.create();
	
	protected Gson gsonComTransient = new GsonBuilder()
		    .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.VOLATILE)
		    .registerTypeHierarchyAdapter(Collection.class, new ColecaoJsonAdapter())
		    .create();
	
//	public abstract Document paraDocumento(T obj);
//	public abstract T paraObjeto(Document doc);
//	public abstract String paraJson(T obj);
//	public abstract String paraJson(Collection<T> obj);
//	public abstract T paraObjeto(String json);
	
	public Document paraDocumento(T obj) 
	{
    	String json = gson.toJson(obj);
    	String jsonMongoDB = transformarIdParaJsonDb(json);
    	Document documento = Document.parse(jsonMongoDB);
		return documento;
	}

	public T paraObjeto(Document doc, Class<T> clazz) 
	{
		String jsonMongoDB = doc.toJson();
    	String json = transformarIdParaJsonObj(jsonMongoDB);
    	T obj = (T) gson.fromJson(json, clazz);
    	return obj;
	}
	
	public Collection<T> paraObjeto(String json, Type tipo)
	{
		Collection<T> ret = gsonComTransient.fromJson(json, tipo);
		return ret;
	}
	
	public String paraJson(T obj)
	{
		String json = gsonComTransient.toJson(obj);
		return json;
	}

	public String paraJson(Collection<T> obj) {
		String json = gsonComTransient.toJson(obj);
		return json;
	}

	public T paraObjeto(String json, Class<T> clazz)
	{
		T ret = (T) gsonComTransient.fromJson(json, clazz);
		return ret;
	}

	public T paraObjetoTratantoId(String json, Class<T> clazz)
	{
		json = transformarIdParaJsonObj(json);
		T obj = (T) gson.fromJson(json, clazz);
		return obj;
	}
	
	public String paraJsonTratandoId(T obj)
	{
		String json = gson.toJson(obj);
		String jsonMongoDB = transformarIdParaJsonDb(json);
		return jsonMongoDB;
	}
	
	/**
	 * Quando for recuperar o JSON do MongoDB para obj...
	 * De : "_id" : { "$oid" : "55805588bf836defd8ac32ec" }
	 * Para : "_id" : "55805588bf836defd8ac32ec"
	 */
	protected String transformarIdParaJsonObj(String json)
	{
		int indice = 0;
		while (json.indexOf("_id", indice) > 1)
		{
			indice = json.indexOf("_id", indice);
			
			int indiceAbreParenteses = json.indexOf("{", indice);
			int indiceFechaParenteses = json.indexOf("}", indice);
			indiceFechaParenteses++; //-- incluir o parenteses
			String conteudoOriginalId = json.substring(indiceAbreParenteses, indiceFechaParenteses);
			int indiceFechaAspasId = conteudoOriginalId.lastIndexOf("\"");
			int indiceAbreAspasId = conteudoOriginalId.lastIndexOf("\"", indiceFechaAspasId - 1);
			indiceFechaAspasId++; //-- incluir a aspas
			String conteudoNovoId = conteudoOriginalId.substring(indiceAbreAspasId, indiceFechaAspasId);

			json = json.replace(conteudoOriginalId, conteudoNovoId);
			
			indice = indiceFechaParenteses + 1;
		}
		
		//-- (associacao transiente) transformar id da ocorrencias COMPLEMENTARES
		while (json.contains("$oid"))
		{
			json = json.replace("$oid", "_id");
		}
		
		return json;
	}
	
	/**
	 * Quando for passar o JSON para o MongoDB...
	 * De : "_id" : "55805588bf836defd8ac32ec"
	 * Para : "_id" : { "$oid" : "55805588bf836defd8ac32ec" }
	 */
	protected String transformarIdParaJsonDb(String json)
	{
		int indice = 0;
		//-- transformar id da ocorrencia principal
		while (json.indexOf("_id", indice) > 1)
		{
			indice = json.indexOf("_id", indice);
			indice = json.indexOf(":", indice);
			
			int indiceAbreAspas = json.indexOf("\"", indice);
			int indiceFechaAspas = json.indexOf("\"", indiceAbreAspas + 1);
			indiceFechaAspas++; //-- incluir a aspas do fechamento
			
			String conteudoOriginalId = json.substring(indiceAbreAspas, indiceFechaAspas);
			String conteudoNovoId = "{ \"$oid\" :" + conteudoOriginalId + " }";

			json = json.replace(conteudoOriginalId, conteudoNovoId);
			
			indice = indiceFechaAspas + 1;
		}
		return json;
	}
	

}
