package com.ps.springbootawslambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ps.springbootawslambda.domain.Order;
import com.ps.springbootawslambda.repository.OrderRepository;

@SpringBootApplication
public class SpringbootAwsLambdaApplication {

	@Autowired
	private OrderRepository orderRepo;

	@Bean
	public Supplier<List<Order>> orders() {
		return () -> orderRepo.buildOrders();
	}

	@Bean
	public Function<String, List<Order>> findOrderByName() {

		return (input) -> orderRepo.buildOrders().stream().filter(o -> o.getName().equals(input))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsLambdaApplication.class, args);
	}

}
