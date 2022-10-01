package com.greatlearning.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.crm.entity.Crm;
import com.greatlearning.crm.service.CrmService;

@Controller
@RequestMapping("/crm")
public class CrmController {

	@Autowired
	private CrmService crmService;

	// add mapping for "/list"

	@RequestMapping("/list")
	public String listCrm(Model theModel) {

		System.out.println("request received");
		// get crm list from db
		List<Crm> theCrm = crmService.findAll();

		// add to the spring model
		theModel.addAttribute("Crms", theCrm);

		return "list-Crms";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Crm theCrm = new Crm();

		theModel.addAttribute("Crm", theCrm);

		return "Crm-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theId, Model theModel) {

		// get the crm from the service
		Crm theCrm = crmService.findById(theId);

		// set crm as a model attribute to pre-populate the form
		theModel.addAttribute("Crm", theCrm);

		// send over to our form
		return "Crm-form";
	}

	@PostMapping("/save")
	public String saveCrm(@RequestParam("id") int id, @RequestParam("fname") String fname,
			@RequestParam("lname") String lname, @RequestParam("email") String email) {

		System.out.println(id);
		Crm theCrm;
		if (id != 0) {
			theCrm = crmService.findById(id);
			theCrm.setFname(fname);
			theCrm.setLname(lname);
			theCrm.setEmail(email);
		} else
			theCrm = new Crm(fname, lname, email);
		// save the crm
		crmService.save(theCrm);

		// use a redirect to prevent duplicate submissions
		return "redirect:/crm/list";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int theId) {

		// delete the crm
		crmService.deleteById(theId);

		// redirect to /crm/list
		return "redirect:/crm/list";

	}

}
