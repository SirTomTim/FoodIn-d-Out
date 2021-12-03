package com.example.FoodInDOut;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.FoodInDOut.web.CalorieController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FoodInDOutApplicationTests {
	
	@Autowired
	private CalorieController controller;
	

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
