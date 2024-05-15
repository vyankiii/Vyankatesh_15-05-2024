package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1,"DELL Inspiron 145000", 65239.22);
		System.out.println(p1.getProductId()); 
		System.out.println(p1.getProductName());

		p1.setProductId(100);
		p1.setProductName("HP");
		p1.setProductPrice(12993.22);
		
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductName());
		System.out.println(p1.getProductPrice());

	}

}
