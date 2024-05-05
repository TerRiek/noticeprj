package com.example.noticePrj.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.noticePrj.dto.MemberDto;

@SpringBootTest
class IMemberDaoTest {

	@Autowired
	private IMemberDao dao;
	
	// @Test
	void testRegistMemberDto() {
		dao.registMemberDto(new MemberDto(0, "aaa", "aaa", "aaa", "010-1111-1111", "aaa@gmail.com"));
	}
	
	// @Test
	void testShowMemberDto() {
		MemberDto dto = dao.showMemberDto("aaa");
		assertThat(dto.getMno()).isEqualTo(1);
	}
	
	// @Test
	void testLoginCheck() {
		int result = dao.loginCheck("aaa", "aaa");
		assertThat(result).isEqualTo(1);	
	}
	
	// @Test
	void testUpdateMemberDto() {
		int result = dao.updateMemberDto(new MemberDto(1, "bbb", "bbb", "bbb", "010-2222-2222", "bbb@gmail.com"));
		assertThat(result).isEqualTo(1);
	}
	
	// @Test
	void testDeleteMemberDto() {
		int result = dao.deleteMemberDto("bbb");
		assertThat(result).isEqualTo(1);
	}

}
