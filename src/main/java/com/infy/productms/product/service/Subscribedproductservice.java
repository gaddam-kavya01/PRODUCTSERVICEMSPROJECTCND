package com.infy.productms.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.productms.product.entity.SubscribedProduct;
import com.infy.productms.product.repositoty.SubscribedProductRepositoty;

import com.infy.productms.productdto.SubscribedProductDTO;

@Service
public class Subscribedproductservice {
	@Autowired
	SubscribedProductRepositoty subscribedproductrepo;
	public List<SubscribedProductDTO> findByBuyerid(Integer buyerid)
	{
		List<SubscribedProduct> sp=subscribedproductrepo.findByBuyerid(buyerid);
		List<SubscribedProductDTO> spdto=new ArrayList<>();
		for(SubscribedProduct sps:sp)
		{
			spdto.add(SubscribedProductDTO.valueOf(sps));
		}
		return spdto;
	}
	public String addProducts(SubscribedProductDTO spdto)
	{
		SubscribedProduct sp= spdto.createEntity();
		
		subscribedproductrepo.save(sp);
		return "Succes";
	}

}
