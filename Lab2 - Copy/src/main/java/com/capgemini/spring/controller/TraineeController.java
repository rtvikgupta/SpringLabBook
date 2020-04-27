package com.capgemini.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.spring.entities.Trainee;
import com.capgemini.spring.service.ITraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	private ITraineeService traineeService;
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("menu");
	}
	
	@GetMapping("/add")
	public ModelAndView addTraineePage() {
		return new ModelAndView("addpage");
	}
	
	@GetMapping("/processadd")
	public ModelAndView addTrainee(@RequestParam("tid") int tid,@RequestParam("tname") String tname,@RequestParam("tlocation") String tlocation,@RequestParam("tdomain") String tdomain) {
		Trainee trainee = new Trainee();
		trainee.setTraineeId(tid);
		trainee.setTraineeName(tname);
		trainee.setTraineeLocation(tlocation);
		trainee.setTraineeDomain(tdomain);
		traineeService.addTrainee(trainee);
		return new ModelAndView("menu");
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteTraineePage() {
		return new ModelAndView("deletepage");
	}
	
	@GetMapping("/retrieve")
	public ModelAndView retrieveTrainee(@RequestParam("tid") int tid) {
		Trainee trainee = traineeService.getTrainee(tid);
		return new ModelAndView("deletepage","trainee",trainee);
	}
	
	@GetMapping("/processdelete")
	public ModelAndView deleteTrainee(@RequestParam("tid") int tid) {
		traineeService.deleteTraniee(tid);
		return new ModelAndView("menu");
	}
	
	@GetMapping("/update")
	public ModelAndView updateTraineePage() {
		return new ModelAndView("updatepage");
	}
	
	@GetMapping("/retrieve1")
	public ModelAndView retrieve1Trainee(@RequestParam("tid") int tid) {
		Trainee trainee = traineeService.getTrainee(tid);
		return new ModelAndView("updatepage","trainee",trainee);
	}
	
	@GetMapping("/processupdate")
	public ModelAndView updateTrainee(@RequestParam("tid") int tid,@RequestParam("tname") String tname,@RequestParam("tlocation") String tlocation,@RequestParam("tdomain") String tdomain) {
		Trainee trainee = new Trainee();
		trainee.setTraineeId(tid);
		trainee.setTraineeName(tname);
		trainee.setTraineeLocation(tlocation);
		trainee.setTraineeDomain(tdomain);
		traineeService.updateTrainee(trainee);
		return new ModelAndView("menu");
	}
	
	@GetMapping("/retrievee")
	public ModelAndView retrieveTraineePage() {
		return new ModelAndView("retrievepage");
	}
	
	@GetMapping("/retrieve2")
	public ModelAndView retrieve2Trainee(@RequestParam("tid") int tid) {
		Trainee trainee = traineeService.getTrainee(tid);
		return new ModelAndView("retrievepage","trainee",trainee);
	}
	
	@GetMapping("/retrieveAll")
	public ModelAndView retrieveAllTraineePage() {
		List<Trainee> tlist = traineeService.getAllTrainees();
		return new ModelAndView("retrieveallpage","tlist",tlist);
	}
}
