package org.kosta.springmvc13;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc13.model.dao.BoardDAO;
import org.kosta.springmvc13.model.service.PagingBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class BoardUnitTest {
	@Resource
	BoardDAO boardDAO;
	
	@Test
	public void list() {
		int totalPostCount=boardDAO.getTotalPostCount();
		PagingBean pagingBean=new PagingBean(totalPostCount);
		System.out.println(boardDAO.getPostList(pagingBean));
		System.out.println(pagingBean);
	}
}






