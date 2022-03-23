package co.jun.rest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.jun.rest.users.service.UserService;
import co.jun.rest.users.service.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class UserServiceClient {
	
	@Autowired
	UserService userService;
	
	@Test 
	public void list() {
		List<UserVO> list = userService.getUserList(null);
		System.out.println(list);
	}
	
	@Test
	public void select() {
		UserVO vo = new UserVO();
		vo.setId("test");
		vo = userService.getUser(vo);
		System.out.println(vo);
	}
}
