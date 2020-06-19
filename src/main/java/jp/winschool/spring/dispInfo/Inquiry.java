package jp.winschool.spring.dispInfo;

import lombok.Data;

@Data
public class Inquiry {
	
	private Integer id;
	private String name;
	private String mail;
	private Integer age;
	private String gender;
	private String contents;

}
