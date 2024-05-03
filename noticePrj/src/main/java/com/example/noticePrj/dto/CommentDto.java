package com.example.noticePrj.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDto {

	private int cno;
	private int nno;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime regdate;
}
