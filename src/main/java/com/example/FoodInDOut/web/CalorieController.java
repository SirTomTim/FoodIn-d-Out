package com.example.FoodInDOut.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.FoodInDOut.domain.CaloIntake;
import com.example.FoodInDOut.domain.CaloOuttake;
import com.example.FoodInDOut.domain.Time;
import com.example.FoodInDOut.domain.CaloIntakeRepository;
import com.example.FoodInDOut.domain.CaloOuttakeRepository;
import com.example.FoodInDOut.domain.TimeRepository;


@Controller
public class CalorieController {
	@Autowired
	private CaloIntakeRepository repIN;
	
	@Autowired
	private CaloOuttakeRepository repOUT;
	
	@Autowired
	private TimeRepository repTime;
	 // Show calories that have taken
	   @RequestMapping(value="/calorieList")
	    public String caloINList(Model model) {	
	        model.addAttribute("intake", repIN.findAll());
	        return "calorieList";
	    }
	   // Show calories that have wasted
	   @RequestMapping(value="/sportList")
	    public String calOUTList(Model model) {	
	        model.addAttribute("outtake", repOUT.findAll());
	        return "sportList";
	    }
	// Add calories that you have taken
	    @RequestMapping(value = "/add")
	    public String addCal(Model model){
	    	model.addAttribute("intake", new CaloIntake());
	    	model.addAttribute("times", repTime.findAll());
	        return "addcaloIntake";
	    }
	 // Add calories that you have wasted
	    @RequestMapping(value = "/add1")
	    public String addSport(Model model){
	    	model.addAttribute("outtake", new CaloOuttake());
	        return "add1caloOuttake";
	    }
	    
	    // Save new calorie intake
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(CaloIntake in){
	        repIN.save(in);
	        return "redirect:calorieList";
	    } 
	    // Save new calorie outtake
	    @RequestMapping(value = "/save1", method = RequestMethod.POST)
	    public String save1(CaloOuttake in){
	        repOUT.save(in);
	        return "redirect:sportList";
	    }
	    // Delete calorie intake
	    @RequestMapping(value = "/delete/{inId}", method = RequestMethod.GET)
	    public String deleteIN(@PathVariable("id") Long inId, Model model) {
	    	repIN.deleteById(inId);
	        return "redirect:../calorieList";
	    }    
	    // Delete calorie outtake
	    @RequestMapping(value = "/delete1/{outId}", method = RequestMethod.GET)
	    public String deleteOUT(@PathVariable("outId") Long outId, Model model) {
	    	repOUT.deleteById(outId);
	        return "redirect:../sportlist";
	    }    
}
