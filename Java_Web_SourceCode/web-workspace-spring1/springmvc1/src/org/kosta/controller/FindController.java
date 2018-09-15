package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MockDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FindController extends
AbstractController {
	private MockDAO mockDAO;
	
	public FindController(MockDAO mockDAO) {
		super();
		this.mockDAO = mockDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//mockDAO 에서 findUserInfo()에서 null 을 반환하면 
		//find_fail.jsp 로 이동 아니면 ok 이동 (이동 전 조회결과를 공유)
		ModelAndView mv = new ModelAndView();
		System.out.println(request.getParameter("userId"));
		
		String st = request.getParameter("userId");
		String find= mockDAO.findUserInfo(st);
		if(find==null) {
			mv.addObject("info","정보 잘못 입력:");
			mv.setViewName("find_fail");
		}else {			
			mv.addObject("info",find);
			mv.setViewName("find_ok");
		}
		return mv;
	}

}