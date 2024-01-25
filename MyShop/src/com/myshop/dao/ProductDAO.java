package com.myshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.myshop.db.DBHelper;
import com.myshop.dto.ProductDTO;

public class ProductDAO extends DBHelper {
	//ΩÃ±€≈Ê
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	//CRUD ∏ﬁº≠µÂ
	public void insertProduct(ProductDTO dto) {
		try {
			close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectProduct(int prodNo) {
	try {
		close();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public List<ProductDTO> selectProducts( ) {
	try {
		close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateProduct(ProductDTO dto) {
	try {
		close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteProduct(int prodNo) {
	try {
		close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
