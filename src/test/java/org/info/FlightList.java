package org.info;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FlightList {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\ListFlight.json");

		JSONParser jsonParser = new JSONParser();

		Object obj = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) obj;

		Object object = jsonObject.get("data");

		JSONArray array = (JSONArray) object;
		System.out.println(array);

		for (int i = 0; i < array.size(); i++) {
			Object object2 = array.get(i);
			JSONObject jsonObject2 = (JSONObject) object2;
			Object id = jsonObject2.get("id");
			System.out.println(id);

			Object fName = jsonObject2.get("flightName");
			System.out.println(fName);

			Object cntry = jsonObject2.get("Country");
			System.out.println(cntry);

			Object dstn = jsonObject2.get("Destinations");
			System.out.println(dstn);

			Object url = jsonObject2.get("URL");
			System.out.println(url);

		}
		Object object1 = jsonObject.get("support");

		JSONObject jsonObject3 = (JSONObject) object1;
		Object url1 = jsonObject3.get("url");
		System.out.println(url1);

		Object txt = jsonObject3.get("text");
		System.out.println(txt);

	}
}