package com.myshop;

import java.util.List;
import java.util.Scanner;

import com.myshop.dao.CustomerDAO;
import com.myshop.dao.OrderDAO;
import com.myshop.dao.ProductDAO;
import com.myshop.dto.CustomerDTO;
import com.myshop.dto.OrderDTO;

public class MyShopMain {
	public static void main(String[] args) {
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO 		= OrderDAO.getInstance();
		ProductDAO productDAO	= ProductDAO.getInstance();
		CustomerDTO loginedCustomer = null;
		while(true) {
			if(loginedCustomer ==null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			}else {
				System.out.println("종료:0, 로그아웃:1, 주문현황2, 상품목록:3, 주문하기:4");
			}
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			if(answer==0) {
				break;
			}else if(answer==1) {
			 //로그인
				if(loginedCustomer ==null) {
				System.out.print("아이디 입력 : ");
				String custId = sc.next();
				loginedCustomer= customerDAO.selectCustomer(custId);
				if(loginedCustomer !=null) {
					System.out.println(loginedCustomer.getName()+"님 어서오세요");
				}else {
					System.out.println(custId +"와 일치하는 회원이 없습니다.");
				}
				}else {
					//로그아웃
					loginedCustomer=null;
					System.out.println("로그아웃 되었습니다");
				}
			}else if(answer==2) {
				if(loginedCustomer ==null) {
					//회원가입
					CustomerDTO customer = new CustomerDTO();
					System.out.print("아이디 입력 : ");
					customer.setCustId(sc.next());
					System.out.print("이름 입력: ");
					customer.setName(sc.next());
					System.out.print("휴대폰 입력: ");
					customer.setHp(sc.next());
					System.out.print("주소 입력: ");
					sc.nextLine();
					customer.setAddr(sc.nextLine());
					customerDAO.insertCustomer(customer);
					
					System.out.println("회원가입을 하셨습니다.");
				}else {
					//주문현황
					List<OrderDTO> list= orderDAO.selectOrders(loginedCustomer.getCustId());
					System.out.println("-----주문현황-----");
					for(OrderDTO order : list) {
						System.out.println(order);
					}
					System.out.println("----------------");
				}
			}else if(answer==3) {
				
			}else if(answer==4) {
				
			}
			
		}
		
		
		System.out.println("안녕히 가십시오.");
	}
}
