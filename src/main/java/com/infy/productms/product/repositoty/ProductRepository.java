package com.infy.productms.product.repositoty;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.productms.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	List<Product> findBySellerid(Integer sellerid);
	List<Product> findByCategoryAndProductname(String category,String productname);
	
}
