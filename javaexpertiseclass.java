package javaexpertisepackage;

import java.io.*;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
public class javaexpertiseclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://jon.swelter.net/f92bf26eba53cf04a.json");
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(new InputStreamReader(url.openStream()));
		JSONObject feed=(JSONObject) json.get("feed");
		//JSONObject entries = (JSONObject) feed.get("entry");
		
		System.out.println(json.toString()+"\n");
		System.out.println(feed.toString());
		//System.out.println(entries.toString());
	}

}
