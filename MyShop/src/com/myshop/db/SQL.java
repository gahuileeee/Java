package com.myshop.db;

public class SQL {
	//customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `customer` VALUES(?,?,?,?,now())";
	public static final String SELECT_CUSTOMER = "SELECT * from `customer` where `custId` =?";
	public static final String SELECT_CUSTOMERS = "";
	public static final String UPDATE_CUSTOMER = "";
	public static final String DELETE_CUSTOMER = "";
	
	//order
	public static final String INSERT_ORDER = "";
	public static final String SELECT_ORDER = "";
	public static final String SELECT_ORDERS = "select a.*, prodName, price, company from `order` as a join `product` as b"
			+ " on a.orderProduct=b.prodNo where orderId = ?";
	public static final String UPDATE_ORDER = "";
	public static final String DELETE_ORDER = "";

	//product
	public static final String INSERT_PRODUCT = "";
	public static final String SELECT_PRODUCT = "";
	public static final String SELECT_PRODUCTS = "";
	public static final String UPDATE_PRODUCT = "";
	public static final String DELETE_PRODUCT = "";
}
