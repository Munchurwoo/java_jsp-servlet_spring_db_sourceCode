package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MockDAO;
import org.kosta.model.MockDAOImpl;
import org.kosta.model.ProductVO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class findProductcController extends AbstractController{
	
	private MockDAO mockDAO = new MockDAOImpl();
	
	public findProductcController(MockDAO mockDAO) {
		super();
		this.mockDAO = mockDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		String s = request.getParameter("name");
		System.out.println(s);
		ProductVO vo = mockDAO.findProductByName(s);
		if(vo==null)
//			mv.setViewName("find_fail");
			return new ModelAndView("find_fail");
		else
			return new ModelAndView("find_ok","vo",vo);
	}	
}