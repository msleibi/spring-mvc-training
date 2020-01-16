package com.home.mvc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {

		return "homePage";
	}

	@RequestMapping("/showSite")
	public String showPage() {

		return "show-Page";
	}

}
