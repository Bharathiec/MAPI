package org.info;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Student {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fileReader=new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Sample.json");
	
		JSONParser	jsonParser=new JSONParser();
	
	Object obj = jsonParser.parse(fileReader);
	
JSONObject jsonObject=(JSONObject)obj;
System.out.println(jsonObject);

Object object = jsonObject.get("data");


	JSONObject jsonObject2=(JSONObject)object;
	
	Object object2 = jsonObject2.get("Country");
	String stateName=(String)object2;
	System.out.println(stateName);
	
	
    Object object3 = jsonObject2.get("flightName");
	String flightName=(String)object3;
	System.out.println(flightName);
	
    Object object4 = jsonObject2.get("Destinations");
	String Destinations=(String)object4;
	System.out.println(Destinations);
	
    Object object5 = jsonObject2.get("URL");
	String URL=(String)object5;
	System.out.println(URL);
	
    Object object6 = jsonObject2.get("Created_Date");
	String Created_Date=(String)object6;
	System.out.println(Created_Date);
	
    Object object7 = jsonObject2.get("Updated_Date");
	String Updated_Date=(String)object7;
	System.out.println(Updated_Date);
	
	 Object object8 = jsonObject2.get("id");
	 String id = String.valueOf(object8);
	 System.out.println(id);
		
		
Object supportData = jsonObject.get("support");


JSONObject obje=(JSONObject)supportData;

Object object9 = obje.get("url");
String url=(String)object9;
System.out.println(url);

Object object10 = obje.get("text");
String text=(String)object10;
System.out.println(text);

	}

}
