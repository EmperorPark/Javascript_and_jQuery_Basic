package com.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.dao.CustomerDaoImpl;
import com.mvc.vo.Customer;
//Rest 방식으로 서비스 하는 컨트롤러
//클라이언트로부터 들어오는 요청을 처리하는 객체.
//@RestController: @Controller + @ResponseBody
//@ResponseBody: 서버에서 클라이언트로 응답이 나갈때 java 객체 ->json으로 변환시켜주는 어노테이션
//@RequestBody:클라이언트가 보내는 json 객체 -> java로 변환시켜주는 어노테이션
@RestController
public class CustomerRestController {		
	CustomerDaoImpl service = new CustomerDaoImpl();
	
	//get: http://localhost:port/context-root/customers
	@GetMapping(value="/customers")
	public List<Customer> selectAll(){
		return service.selectAll();
	}
	
	//get: http://localhost:port/context-root/customers/121
	@GetMapping(value="/customers/{num}")
	public Customer selectOne(@PathVariable String num){
		return service.selectOne(num);
	}
	
	//post(insert): http://localhost:port/context-root/customers
	//client(json)->java object
	@PostMapping(value="/customers")
	public Map<String, String> insert(@RequestBody Customer c){
		int x = service.insert(c);
		
		Map<String, String> map = new HashMap<>();
		map.put("result", "추가성공");
		return map;
	}
	
	//put(update): http://localhost:port/context-root/customers
	//client(json)->java object
	@PutMapping(value="/customers")
	public Map<String, String> update(@RequestBody Customer c){
		int x = service.update(c);
		
		Map<String, String> map = new HashMap<>();
		map.put("result", "수정성공");
		return map;
	}
	
	//delete(delete): http://localhost:port/context-root/customers/44	
	@DeleteMapping(value="/customers/{num}")
	public Map<String, String> delete(@PathVariable String num){
		int x = service.delete(num);
		
		Map<String, String> map = new HashMap<>();
		map.put("result", "삭제성공");
		return map;
	}

}

