package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;

public interface VideoService {

	List<Video> getVideoList();

	List<Video> search(SearchCondition condition);

}