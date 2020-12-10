package com.infy.productms.product.repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.productms.product.entity.SubscribedProduct;


@Repository
public interface SubscribedProductRepositoty extends JpaRepository<SubscribedProduct,Integer>  {
	List<SubscribedProduct> findByBuyerid(Integer buyerid);

}
