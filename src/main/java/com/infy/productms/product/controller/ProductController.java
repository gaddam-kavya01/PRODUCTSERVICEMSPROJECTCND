package com.infy.productms.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.productms.product.service.Productservice;
import com.infy.productms.productdto.ProductDTO;

@RestController
@CrossOrigin
public class ProductController {
	Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	Productservice proservice;
	@GetMapping(value="/product/viewallproducts")
	public List<ProductDTO> getAllProducts(){
		logger.info("productdetails of products");
		return proservice.getAllProducts();
	}
	@PostMapping(value="/product/addproducts")
	public String addProduct(@RequestBody ProductDTO productDTO) {
		return proservice.addProducts(productDTO);
	}
	@GetMapping(value="/product/viewselleridproduts/{sellerid}")
	public List<ProductDTO>  findBySellerid(@PathVariable Integer sellerid)
	{
		return proservice.findBySellerid(sellerid);
	}
	@GetMapping(value="/product/viewproByCatandpro/{category}/{productname}")
	public List<ProductDTO>findByCategoryAndProductname(@PathVariable("category") String category,@PathVariable("productname") String productname)
	{
		return proservice.findByCategoryAndProductname(category, productname);
	}
	@PostMapping(value="/product/updateproducts")
	public String updateproduct(@RequestParam(name = "productid") Integer productId, @RequestParam(name = "stock") Integer stock ){
		return proservice.updateProducts(productId,stock);
	}

}
