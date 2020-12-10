package com.infy.productms.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.productms.product.service.Subscribedproductservice;

import com.infy.productms.productdto.SubscribedProductDTO;

@RestController
@CrossOrigin
public class SubscribedProductController {
	@Autowired
	Subscribedproductservice subscribedproservice;
	
	@GetMapping(value="/subscribedproduct/viewbuyeridproduts/{buyerid}")
	public List<SubscribedProductDTO>  findByBuyerid(@PathVariable Integer buyerid)
	{
		return subscribedproservice.findByBuyerid(buyerid);
	}
	@PostMapping(value="/subscribedproduct/addproducts")
	public String addProduct(@RequestBody SubscribedProductDTO  spdto) {
		return  subscribedproservice.addProducts(spdto);
	}

}
