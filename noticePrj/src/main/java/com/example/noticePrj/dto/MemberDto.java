package com.example.noticePrj.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {

	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
}
