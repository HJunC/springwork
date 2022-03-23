package co.jun.rest.member.mapper;

import java.util.List;

import co.jun.rest.member.vo.MemberVO;

public interface MemberMapper {
	List<MemberVO> memberList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
}
