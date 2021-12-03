package com.example.FoodInDOut.domain;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface TimeRepository extends CrudRepository<Time, Long> {
	List<Time> findByName(String name);

}
