package com.example.noticePrj.dao;

import java.util.List;

import com.example.noticePrj.dto.NoticeDto;

public interface INoticeDao {

	public List<NoticeDto> getNoticeNoReceiver();
}
