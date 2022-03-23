package co.jun.rest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.jun.rest.member.mapper.MemberMapper;
import co.jun.rest.member.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class MemberMapperClient {
	
	@Autowired
	MemberMapper mapper;
	
	@Test
	public void listTest() {
		List<MemberVO> list = mapper.memberList();
		System.out.println(list);
	}
	
	@Test
	public void selectTest() {
		MemberVO vo = new MemberVO();
		vo.setId("test");
		vo = mapper.memberSelect(vo);
		System.out.println(vo);
		assertEquals(vo.getId(), "test");
	}
	
	public void insertTest() {
		MemberVO vo = new MemberVO();
		vo.setId("test11");
		vo.setPassword("111");
		vo.setName("test");
		int r = mapper.memberInsert(vo);
		System.out.println(r);
	}
	
}
