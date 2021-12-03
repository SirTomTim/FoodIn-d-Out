package com.example.FoodInDOut;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.FoodInDOut.domain.CaloOuttake;
import com.example.FoodInDOut.domain.CaloOuttakeRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CalorieOuttakeRepTest {
	@Autowired
	private CaloOuttakeRepository rep;
	
	@Test
	public void findSport() {
		 List<CaloOuttake> spo = rep.findBySport("run");
		 assertThat(spo).hasSize(1);
		 }
	 @Test
	 public void createNewAct() {
	 CaloOuttake spor = new CaloOuttake("Football", 800, "19.12.2021", "18:00-19:00");
	 rep.save(spor);
	 assertThat(spor.getOutId()).isNotNull();
	 }

}
