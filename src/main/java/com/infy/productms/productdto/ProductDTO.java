package com.infy.productms.productdto;

import com.infy.productms.product.entity.Product;

public class ProductDTO {

	Integer prodid;
	String brand;
	String category;
	String description;
	String image;
	double price;
	String productname;
	Integer rating;
	Integer sellerid;
	Integer stock;
	String subcategory;
	
	
	
	public Integer getProdid() {
		return prodid;
	}
	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getSellerid() {
		return sellerid;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	@Override
	public String toString() {
		return "ProductDTO [prodid=" + prodid + ", brand=" + brand + ", category=" + category + ", description="
				+ description + ", image=" + image + ", price=" + price + ", productname=" + productname + ", rating="
				+ rating + ", sellerid=" + sellerid + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}
	public static ProductDTO valueOf(Product prod)
	{
		ProductDTO pdto=new ProductDTO();
	pdto.setBrand(prod.getBrand());
	pdto.setCategory(prod.getCategory());
	pdto.setDescription(prod.getDescription());
	pdto.setImage(prod.getImage());
	pdto.setPrice(prod.getPrice());
	pdto.setProdid(prod.getProdid());
	pdto.setProductname(prod.getProductname());
	pdto.setRating(prod.getRating());
	pdto.setSellerid(prod.getSellerid());
	pdto.setStock(prod.getStock());
	pdto.setSubcategory(prod.getSubcategory());
	
		return pdto;
	}
	public Product createEntity(){
		Product pro=new Product();
		pro.setBrand(this.brand);
		pro.setCategory(this.category);
		pro.setDescription(this.description);
		pro.setImage(this.image);
		pro.setPrice(this.price);
		pro.setProdid(this.prodid);
		pro.setProductname(this.productname);
		pro.setRating(this.rating);
		pro.setSellerid(this.sellerid);
		pro.setStock(this.stock);
		pro.setSubcategory(this.subcategory);
		
		return pro;
		
	}
}
