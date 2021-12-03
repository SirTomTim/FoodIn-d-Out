package com.example.FoodInDOut.domain;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface CaloIntakeRepository extends CrudRepository <CaloIntake, Long> {
	
	List<CaloIntake> findByFood(String food);

}
