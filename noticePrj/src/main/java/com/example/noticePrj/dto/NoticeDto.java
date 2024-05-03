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
public class NoticeDto {

	private int nno;
	private String title;
	private String content;
	private String writer;
	private String receiver;
	private LocalDateTime regdate;
	private int viewCount;
	private boolean viewTf;
}
