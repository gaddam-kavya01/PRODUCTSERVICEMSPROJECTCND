package com.infy.productms.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.productms.product.entity.Product;
import com.infy.productms.product.repositoty.ProductRepository;
import com.infy.productms.productdto.ProductDTO;

@Service
public class Productservice {
	Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	 ProductRepository productrepo;
	public List<ProductDTO> getAllProducts()
	{
		
	 List<Product> po;
	 po=productrepo.findAll();
	 List<ProductDTO> proddto=new ArrayList<>(); 
	 for(Product p:po)
	 {
		 proddto.add(ProductDTO.valueOf(p));
	 }
	 logger.info("products details of product:{}",proddto);
		
		return proddto;
		
	}
	public String addProducts(ProductDTO productDTO)
	{
		Product product = productDTO.createEntity();
		productrepo.save(product);
		return "Succes";
	}
	public List<ProductDTO> findBySellerid(Integer sellerid)
	{
		List<Product> po=productrepo.findBySellerid(sellerid);
		List<ProductDTO> proddto=new ArrayList<>(); 
		 for(Product p:po)
		 {
			 proddto.add(ProductDTO.valueOf(p));
		 }
		 return proddto;
		
	}
	public List<ProductDTO>findByCategoryAndProductname(String category,String productname)
	{
		List<Product> po=productrepo.findByCategoryAndProductname(category, productname);
		List<ProductDTO> proddto=new ArrayList<>(); 
		 for(Product p:po)
		 {
			 proddto.add(ProductDTO.valueOf(p));
		 }
		 return proddto;
		
	}
	public String updateProducts(Integer productId, Integer stock)
	{
		if(stock<10) {
			return "Stock should be more than 10";
		}
		Optional<Product> optpro = productrepo.findById(productId);
		Product product = null;
		if(optpro.isPresent()) {
			product= optpro.get();
		}
		product.setStock(stock);
 		
		productrepo.save(product);
		return "Succes";
		
	}
	
	
	

}
