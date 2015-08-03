package pl.maciejoleksa.excercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetJSONFromURL {
	
	
	StringBuilder urlContent = new StringBuilder();
	private String line = null;
	
	public GetJSONFromURL() {
		String queryUrl = "http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7";
		try {
			URL url = new URL(queryUrl);
			URLConnection connection = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
						
			while ((line = br.readLine()) != null) {
				urlContent.append(line);
				
			}
			br.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public GetJSONFromURL(String str) {
		
		try {
			URL url = new URL(str);
			URLConnection connection = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
						
			while ((line = br.readLine()) != null) {
				urlContent.append(line);
				
			}
			br.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
