package org.kosta.controller;

import org.kosta.model.dao.CustomerDAO;
import org.kosta.model.dao.CustomerDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	private CustomerDAOImpl customerdao = new CustomerDAOImpl();
	@RequestMapping("findCustomerById.do")
	public ModelAndView findCustomerById(String id) {
		customerdao.findCustomerById(id);
		return new ModelAndView("result");
	}
}
