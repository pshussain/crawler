package com.fabdy.bean.flipkart.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ImageUrls {
	@JsonIgnore
	@JsonProperty("100x100")
	String image100x100;
	@JsonIgnore
	@JsonProperty("75x75")
	String image75x75;
	@JsonIgnore
	@JsonProperty("40x40")
	String image40x40;
	@JsonIgnore
	@JsonProperty("200x200")
	String image200x200;
	@JsonIgnore
	@JsonProperty("400x400")
	String image400x400;
	@JsonIgnore
	@JsonProperty("1100x1100")
	String image1100x1100;
	@JsonIgnore
	@JsonProperty("275x275")
	String image275x275;
	@JsonIgnore
	@JsonProperty("125x125")
	String image125x125;
	@JsonIgnore
	@JsonProperty("1100x1360")
	String image1100x1360;
	@JsonIgnore
	@JsonProperty("180x240")
	String image180x240;
	@JsonIgnore
	@JsonProperty("275x340")
	String image275x340;
	@JsonIgnore
	@JsonProperty("unknown")
	String unknown;
	/**
	 * @return the image100x100
	 */
	public String getImage100x100() {
		return image100x100;
	}
	/**
	 * @return the image75x75
	 */
	public String getImage75x75() {
		return image75x75;
	}
	/**
	 * @return the image40x40
	 */
	public String getImage40x40() {
		return image40x40;
	}
	/**
	 * @return the image200x200
	 */
	public String getImage200x200() {
		return image200x200;
	}
	/**
	 * @return the image400x400
	 */
	public String getImage400x400() {
		return image400x400;
	}
	/**
	 * @return the image1100x1100
	 */
	public String getImage1100x1100() {
		return image1100x1100;
	}
	/**
	 * @return the image275x275
	 */
	public String getImage275x275() {
		return image275x275;
	}
	/**
	 * @return the image125x125
	 */
	public String getImage125x125() {
		return image125x125;
	}
	/**
	 * @return the image1100x1360
	 */
	public String getImage1100x1360() {
		return image1100x1360;
	}
	/**
	 * @return the image180x240
	 */
	public String getImage180x240() {
		return image180x240;
	}
	/**
	 * @return the image275x340
	 */
	public String getImage275x340() {
		return image275x340;
	}
	/**
	 * @return the unknown
	 */
	public String getUnknown() {
		return unknown;
	}
}
