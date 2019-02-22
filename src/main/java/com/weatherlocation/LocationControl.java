package com.weatherlocation;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationControl {
	
	private String url_search="https://api.seniverse.com/v3/location/search.json?key=8xpdyjgfcizdqyuc&q=LOCATION"; 

	@GetMapping("/search/{location}")
	public String search(@PathVariable("location") String location) {
		try {
			location=URLEncoder.encode(location, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String url = url_search.replace("LOCATION", location);
		String resp = HttpUtil2.getRequest(url, "utf-8");
		return resp;
	}
	
}
