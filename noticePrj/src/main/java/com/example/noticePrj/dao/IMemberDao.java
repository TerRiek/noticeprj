package com.example.noticePrj.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.noticePrj.dto.MemberDto;

@Mapper
public interface IMemberDao {

	public MemberDto showMemberDto(@Param("id") String id);
	public int loginCheck(@Param("id") String id, @Param("pw") String pw);
	public int checkValidId(@Param("id") String id);
	public int registMemberDto(@Param("dto") MemberDto dto);
	public int updateMemberDto(@Param("dto") MemberDto dto);
	public int deleteMemberDto(@Param("id") String id);

}
