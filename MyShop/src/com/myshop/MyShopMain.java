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
		System.out.println("���θ��� ���Ű��� ȯ���մϴ�.");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO 		= OrderDAO.getInstance();
		ProductDAO productDAO	= ProductDAO.getInstance();
		CustomerDTO loginedCustomer = null;
		while(true) {
			if(loginedCustomer ==null) {
				System.out.println("����:0, �α���:1, ȸ������:2, ��ǰ���:3, �ֹ��ϱ�:4");
			}else {
				System.out.println("����:0, �α׾ƿ�:1, �ֹ���Ȳ2, ��ǰ���:3, �ֹ��ϱ�:4");
			}
			System.out.print("���� : ");
			
			int answer = sc.nextInt();
			if(answer==0) {
				break;
			}else if(answer==1) {
			 //�α���
				if(loginedCustomer ==null) {
				System.out.print("���̵� �Է� : ");
				String custId = sc.next();
				loginedCustomer= customerDAO.selectCustomer(custId);
				if(loginedCustomer !=null) {
					System.out.println(loginedCustomer.getName()+"�� �������");
				}else {
					System.out.println(custId +"�� ��ġ�ϴ� ȸ���� �����ϴ�.");
				}
				}else {
					//�α׾ƿ�
					loginedCustomer=null;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				}
			}else if(answer==2) {
				if(loginedCustomer ==null) {
					//ȸ������
					CustomerDTO customer = new CustomerDTO();
					System.out.print("���̵� �Է� : ");
					customer.setCustId(sc.next());
					System.out.print("�̸� �Է�: ");
					customer.setName(sc.next());
					System.out.print("�޴��� �Է�: ");
					customer.setHp(sc.next());
					System.out.print("�ּ� �Է�: ");
					sc.nextLine();
					customer.setAddr(sc.nextLine());
					customerDAO.insertCustomer(customer);
					
					System.out.println("ȸ�������� �ϼ̽��ϴ�.");
				}else {
					//�ֹ���Ȳ
					List<OrderDTO> list= orderDAO.selectOrders(loginedCustomer.getCustId());
					System.out.println("-----�ֹ���Ȳ-----");
					for(OrderDTO order : list) {
						System.out.println(order);
					}
					System.out.println("----------------");
				}
			}else if(answer==3) {
				
			}else if(answer==4) {
				
			}
			
		}
		
		
		System.out.println("�ȳ��� ���ʽÿ�.");
	}
}
