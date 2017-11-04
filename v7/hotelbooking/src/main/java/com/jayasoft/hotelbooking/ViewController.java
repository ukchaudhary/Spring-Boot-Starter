package com.jayasoft.hotelbooking;

import java.util.Date;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	private String appMode;
	private String appName;
	private String appUser;
	
	private String serverAddress;
	
	public ViewController(Environment env) {
		appMode = env.getProperty("app-mode");
		appName = env.getProperty("app-name");
		appUser = env.getProperty("security.user.name");
		
		serverAddress = env.getProperty("server.address");
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("datetime", new Date());
		model.addAttribute("username", appUser);
		model.addAttribute("mode", appMode);
		model.addAttribute("appName", appName);
		
		model.addAttribute("serverAddress", serverAddress);
		return "index";
	}
}
