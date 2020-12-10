package com.infy.productms.productdto;

import com.infy.productms.product.entity.SubscribedProduct;

public class SubscribedProductDTO {
	int subid;
	int buyerid;
	int prodid;
	int quantity;
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "SubscribedProductDTO [subid=" + subid + ", buyerid=" + buyerid + ", prodid=" + prodid + ", quantity="
				+ quantity + "]";
	}
	
	public static SubscribedProductDTO valueOf(SubscribedProduct subs)
	{
		SubscribedProductDTO subpro=new SubscribedProductDTO();
		subpro.setBuyerid(subs.getBuyerid());
		subpro.setProdid(subs.getProdid());
		subpro.setQuantity(subs.getQuantity());
		subpro.setSubid(subs.getSubid());
		return subpro;
	}
	public  SubscribedProduct createEntity(){
		SubscribedProduct sub=new SubscribedProduct();
		sub.setBuyerid(this.buyerid);
		sub.setProdid(this.prodid);
		sub.setQuantity(this.quantity);
		sub.setSubid(this.subid);
		return sub;
	}

}
