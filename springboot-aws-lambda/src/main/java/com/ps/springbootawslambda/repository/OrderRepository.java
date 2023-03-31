package com.ps.springbootawslambda.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ps.springbootawslambda.domain.Order;

@Repository
public class OrderRepository {
	
	public List<Order> buildOrders(){
		return Arrays.asList(new Order(101, "mobile", 20000, 1),
				new Order(102, "Book", 200, 2),
				new Order(278, "Book", 100, 3),
				new Order(953, "Jeans", 1500, 1));
	}

}
