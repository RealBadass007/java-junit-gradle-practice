package connectToRestAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public class connectToRestAPI {

	public static void main(String[] args) {
		
		
		
//		try {
//			URL url = new URL("https://api.rawg.io/api/games/4291?key=81ff0dcdea194c05bfb40f019f25a4cd");
//			
//			HttpURLConnection con = (HttpURLConnection) url.openConnection();
//			con.setRequestMethod("GET");
//
//			if(con.getResponseCode() == 200) {
//				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
////				System.out.println(br.readLine());
//				
//				JSONObject jsonObj = (JSONObject) new JSONParser().parse(br.readLine());
//				
//				System.out.println(jsonObj);
//				
//				JSONArray arr = (JSONArray) jsonObj.getOrDefault("developers", "-1");
//				
//				System.out.println(arr.get(0));
//				
//				jsonObj = (JSONObject) arr.get(0);
//				
//				System.out.println(jsonObj.getOrDefault("games_count", "0"));
//				
//			} else {
//				System.out.println("Error in Response");
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
}
