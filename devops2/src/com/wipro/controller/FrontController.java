package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.dao.MainDao;
import com.wipro.model.MainModel;

@Controller
public class FrontController {
@Autowired 
MainDao mainDao;

@RequestMapping(value="/")
public String toIndex()
{
	return "index";
}
@RequestMapping(value="/store")
public String toStore(@ModelAttribute("bean") MainModel mainModel)
{
	 String str = mainDao.toStore(mainModel);
	 if(str != null)
	 {
		 return "hello";
	 }
	 else
	 {
		 return "hai";
	 }
}
@RequestMapping(value="/toshow")
public String toshow(Model model,@ModelAttribute("bean")MainModel mainmodel)
{
	model.addAttribute("details", mainDao.toshow());
	return "show";
}

}
