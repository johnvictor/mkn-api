package com.achilles.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetablesController {

	@RequestMapping(value = "/get-vegetables")
	public @ResponseBody String getVegetables() {

		String vegetablesList = readFileFromClasspath("static/json/get-vegetables.json");

		return vegetablesList;
	}

	public String readFileFromClasspath(final String fileName) {

		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		InputStream inputStream = ClassLoader
				.getSystemResourceAsStream(fileName);
		StringWriter writer = new StringWriter();
		String encoding = "UTF-8";
		try {
			IOUtils.copy(inputStream, writer, encoding);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String theString = writer.toString();

		return theString;

	}
}
