package com.home.mvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/worker")
public class WorkerController {
	
	@RequestMapping("/worker-form")
	public String showWorker(Model model) {
		
		Worker theWorker = new Worker();
		model.addAttribute("worker", theWorker);
		
		return "worker-form";
	}
	
	@RequestMapping("/process-worker")
	public String processWorker(@ModelAttribute("worker") Worker theWorker) {
		
			
		return "show-workers";
	}

}
