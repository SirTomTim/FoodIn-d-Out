package com.example.FoodInDOut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.example.FoodInDOut.domain.CaloIntake;
import com.example.FoodInDOut.domain.CaloOuttake;
import com.example.FoodInDOut.domain.Time;
import com.example.FoodInDOut.domain.CaloIntakeRepository;
import com.example.FoodInDOut.domain.CaloOuttakeRepository;
import com.example.FoodInDOut.domain.TimeRepository;

@SpringBootApplication
public class FoodInDOutApplication {
	private static final Logger log = LoggerFactory.getLogger(FoodInDOutApplication.class);
	public static void main(String[] args) {


		SpringApplication.run(FoodInDOutApplication.class, args);
	}
	@Bean
	public CommandLineRunner caloRunner(CaloIntakeRepository repIn, CaloOuttakeRepository repOut, TimeRepository repTime) {
		return (args) -> {
			repTime.save(new Time("Breakfast"));
			repTime.save(new Time("Lunch"));
			repTime.save(new Time("Dinner"));
			repTime.save(new Time("Snack"));
			
			repIn.save(new CaloIntake("burger", 600, "21:11:2021",repTime.findByName("Breakfast").get(0)));
			repOut.save(new CaloOuttake("running", 500,"21:11:2021","18.00-19:00"));
			log.info("fetch all calorie intake");
			for (CaloIntake intake : repIn.findAll()) {
				log.info(intake.toString());
			}
			log.info("fetch all calorie outake");
			for (CaloOuttake outtake : repOut.findAll()) {
				log.info(outtake.toString());
			}
			
		};
	}

}
