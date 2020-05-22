package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable{
	private static final long serialVersionUID=1L;
	
	private long id;
	private String goodsName;
	private String price;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName=goodsName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price=price;
	}
	

}
