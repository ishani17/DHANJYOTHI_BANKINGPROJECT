package com.dhanjyothi;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerRegistrationController {
	
	@RequestMapping("/regform")
	public String Register()
	{
		return "registration";
	}
	
	
	@RequestMapping("/userdetails")
	public String userInfo(CustomerRegistration reg)
	{
		
		ModelMap model= new ModelMap();
		model.addAttribute("firstName", reg.getFirstName());
		model.addAttribute("lastName", reg.getLastName());
		model.addAttribute("dateOfBirth", reg.getDateOfBirth());
		model.addAttribute("addressLine1", reg.getAddressLine1());
		model.addAttribute("addressLine2", reg.getAddressLine2());
		model.addAttribute("city", reg.getCity());
		
		model.addAttribute("state", reg.getState());
		model.addAttribute("pin", reg.getPin());
		model.addAttribute("mobNumber", reg.getMobNumber());
		model.addAttribute("email", reg.getEmail());
		model.addAttribute("aadhar", reg.getAadhar());
		model.addAttribute("pan", reg.getPan());
		model.addAttribute("loginUsername", reg.getLoginUsername());
		model.addAttribute("loginPassword", reg.getLoginPassword());
		model.addAttribute("confirmPassword", reg.getConfirmPassword());
		
		
		
		
		ModelAndView mv= new ModelAndView("user-details");
		mv.addObject("regObj",reg);
		return mv;
	}

}
