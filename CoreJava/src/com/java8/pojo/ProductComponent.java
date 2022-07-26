package com.java8.pojo;

public class ProductComponent {

	private Integer id;
	private String code;
	
	public ProductComponent(Integer id, String code) {
		super();
		this.id = id;
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ProductComponent [id=" + id + ", code=" + code + "]";
	}
	
	
}
