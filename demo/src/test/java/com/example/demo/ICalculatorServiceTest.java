package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.InMemoryCalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ICalculatorServiceTest {
	
	@InjectMocks
	InMemoryCalculatorService inMemoryCalculatorService;
	
	@Test
	public void testAdd() {
		Double addResponse = inMemoryCalculatorService.add(12d, 32d, 22d);
		
		Assert.assertNotNull(addResponse);
	}
	
	@Test
	public void testSub() {
		Double addResponse = inMemoryCalculatorService.subtract(10d, 5d, 2d);
		
		Assert.assertNotNull(addResponse);
    }
	@Test
	public void testMul() {
		Double addResponse = inMemoryCalculatorService.multiply(12d, 32d, 22d);
		
			Assert.assertNotNull(addResponse);
}
	@Test
	public void testDiv() {
		Double addResponse = inMemoryCalculatorService.divide(50d, 10d, 5d);
		
			Assert.assertNotNull(addResponse);
}
}