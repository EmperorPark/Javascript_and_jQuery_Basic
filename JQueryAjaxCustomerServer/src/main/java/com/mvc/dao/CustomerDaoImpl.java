package com.mvc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mvc.vo.Customer;

public class CustomerDaoImpl {
	ArrayList<Customer> data ;
	
	public CustomerDaoImpl() {		
		getData();
	}

	private void getData() {
		data = new ArrayList<>();
		data.add(new Customer("1","West","London"));
		data.add(new Customer("2","Merrill","Seoul"));
		data.add(new Customer("3","Vince","Paris"));
		data.add(new Customer("4","Ahmed","Paris"));
		data.add(new Customer("5","Fleur","Beijing"));
		data.add(new Customer("6","Renaldo","Tokyo"));
		data.add(new Customer("7","Tamera","Singapore"));
		data.add(new Customer("8","Daffi","Seoul"));
		data.add(new Customer("9","Marena","London"));
		data.add(new Customer("10","Orrin","Seoul"));
		
	}

	public List<Customer> selectAll() {
		return data;
	}


	public Customer selectOne(String num) {		
		for (Customer customer : data) {
			if(customer.getNum().equals(num)) {
				return customer;
			}
		}
		return null;
	}

	
	public int insert(Customer c) {
		data.add(c);
		Collections.sort(data);
		return 1;
	}

	
	public int delete(String num) {
		for (int i = 0; i < data.size(); i++) {
			if(data.get(i).getNum().equals(num)) {	
				data.remove(i);				
				break;
			}
		}
		
		return 1;
	}
	

	
	public int update(Customer c) {
		synchronized (data) {
			for (int i = 0; i < data.size(); i++) {
				if(data.get(i).getNum().equals(c.getNum())) {						
					data.set(i, c);					
					break;
				}
			}
		}
		
		return 1;
	}
	
	
	
	public static void main(String[] args) {
		CustomerDaoImpl dao = new CustomerDaoImpl();
		List l = dao.selectAll();
		dao.print(l);
		
		System.out.println(dao.selectOne("4") + "\n");
		dao.insert(new Customer("11","Julie","Spivey"));
		dao.print(l);
		
		dao.update(new Customer("11","Julie","Rome"));
		dao.print(l);
		
		dao.delete("11");
		dao.print(l);
	}

	private void print(List l) {
		for (Customer customer : data) {
			System.out.println(customer);
		}
		System.out.println();
	}

}
