package co.jun.rest.member.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	@JsonIgnore
	private String password;
	private String name;
	private String tel;
	private String address;
	private String author;
}
