package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.db.SQL;
import com.myshop.dto.OrderDTO;
import com.myshop.dto.ProductDTO;

public class OrderDAO extends DBHelper {
	//ΩÃ±€≈Ê
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	//CRUD ∏ﬁº≠µÂ
	public void insertOrder(OrderDTO dto) {
		try {
			close();			
		}catch(Exception e) {
			
		}
	}
	public void selectOrder(int orderNo) {
	try {
		close();
		}catch(Exception e) {
			
		}
	}
	public List<OrderDTO> selectOrders(String orderID) {
		List<OrderDTO> orders = new ArrayList<OrderDTO>();
	try {
		conn =getConnection();
		psmt=conn.prepareStatement(SQL.SELECT_ORDERS);
		psmt.setString(1, orderID);
		rs =psmt.executeQuery();
		while(rs.next()) {
			OrderDTO order = new OrderDTO();
			order.setOrderNo(rs.getInt(1));
			order.setOrderId(rs.getString(2));
			order.setOrderProduct(rs.getInt(3));
			order.setOrderCount(rs.getInt(4));
			order.setOrderDate(rs.getString(5));
			order.setProdName(rs.getString(6));
			order.setPrice(rs.getInt(7));
			order.setCompany(rs.getString(8));
			orders.add(order);
		}
		close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	public void updateOrder(OrderDTO dto) {
	try {
		close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteOrder(int orderNo) {
	try {
		close();
		}catch(Exception e) {
			
		}
	}
}
