package com.fabdy.bean.flipkart.product;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonSerialize(include= JsonSerialize.Inclusion.ALWAYS) 
public class ProductAttribute {
	@JsonProperty("title")
	String title;
	@JsonProperty("productDescription")
	String productDescription;
	@JsonProperty("imageUrls")
	ImageUrls imageUrls;
	@JsonProperty("maximumRetailPrice")
	MaximumRetailPrice maximumRetailPrice;
	@JsonProperty("sellingPrice")
	SellingPrice sellingPrice;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @return the imageUrls
	 */
	public ImageUrls getImageUrls() {
		return imageUrls;
	}
	/**
	 * @return the maximumRetailPrice
	 */
	public MaximumRetailPrice getMaximumRetailPrice() {
		return maximumRetailPrice;
	}
	/**
	 * @return the sellingPrice
	 */
	public SellingPrice getSellingPrice() {
		return sellingPrice;
	}
	/**
	 * @return the productUrl
	 */
	public String getProductUrl() {
		return productUrl;
	}
	/**
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}
	/**
	 * @return the inStock
	 */
	public boolean isInStock() {
		return inStock;
	}
	/**
	 * @return the emiAvailable
	 */
	public String getEmiAvailable() {
		return emiAvailable;
	}
	/**
	 * @return the codAvailable
	 */
	public String getCodAvailable() {
		return codAvailable;
	}
	/**
	 * @return the discountPercentage
	 */
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	/**
	 * @return the cashBack
	 */
	public String getCashBack() {
		return cashBack;
	}
	/**
	 * @return the offers
	 */
	public List<Offer> getOffers() {
		return offers;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the sizeUnit
	 */
	public String getSizeUnit() {
		return sizeUnit;
	}
	/**
	 * @return the sizeVariants
	 */
	public String getSizeVariants() {
		return sizeVariants;
	}
	/**
	 * @return the colorVariants
	 */
	public List<String> getColorVariants() {
		return (List<String>)colorVariants;
	}
	/**
	 * @return the styleCode
	 */
	public String getStyleCode() {
		return styleCode;
	}
	/**
	 * @return the offset
	 */
	public String getOffset() {
		return offset;
	}
	@JsonProperty("productUrl")
	String productUrl;
	@JsonProperty("productBrand")
	String productBrand;
	@JsonProperty("inStock")
	boolean inStock;
	@JsonProperty("emiAvailable")
	String emiAvailable;
	@JsonProperty("codAvailable")
	String codAvailable;
	@JsonProperty("discountPercentage")
	double discountPercentage;
	@JsonProperty("cashBack")
	String cashBack;
	@JsonProperty("offers")
	List<Offer> offers;
	@JsonProperty("size")
	String size;
	@JsonProperty("color")
	String color;
	@JsonProperty("sizeUnit")
	String sizeUnit;
	@JsonProperty("sizeVariants")
	String sizeVariants;
	@JsonProperty("colorVariants")
	Object colorVariants;
	@JsonProperty("styleCode")
	String styleCode;
	@JsonProperty("offset")
	String offset;
}
