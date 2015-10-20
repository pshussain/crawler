package com.fabdy.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.fabdy.bean.flipkart.category.Api;
import com.fabdy.bean.flipkart.category.ApiGroup;
import com.fabdy.bean.flipkart.product.ProductInfoList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlipkartParser {
	private final ObjectMapper objectMapper = new ObjectMapper();

	public ProductInfoList parse(String obj) throws JsonParseException, JsonMappingException, IOException {
		ProductInfoList myObjects = objectMapper.readValue(obj, ProductInfoList.class);
		return myObjects;

	}
	
	public ProductInfoList parse(File obj) throws JsonParseException, JsonMappingException, IOException {
		ProductInfoList myObjects = objectMapper.readValue(obj, ProductInfoList.class);
		return myObjects;

	}
	
	public ProductInfoList parse(InputStream is) throws JsonParseException, JsonMappingException, IOException {
		ProductInfoList myObjects = objectMapper.readValue(is, ProductInfoList.class);
		return myObjects;

	}
	public Api parseApi(String obj) throws JsonParseException, JsonMappingException, IOException {
		Api myObjects = objectMapper.readValue(obj, Api.class);
		return myObjects;

	}
	
	public Api parseApi(File obj) throws JsonParseException, JsonMappingException, IOException {
		Api myObjects = objectMapper.readValue(obj, Api.class);
		return myObjects;

	}
	
	public Api parseApi(InputStream is) throws JsonParseException, JsonMappingException, IOException {
		Api myObjects = objectMapper.readValue(is, Api.class);
		return myObjects;

	}
	
	
}
