package com.example.FoodInDOut.domain;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface CaloOuttakeRepository extends CrudRepository<CaloOuttake, Long> {
	List<CaloOuttake> findBySport (String sport);                        

}
