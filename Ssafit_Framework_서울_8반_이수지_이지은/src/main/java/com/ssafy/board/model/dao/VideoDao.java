package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;

public interface VideoDao {

	List<Video> selectAll();

	int insertUser(Video video);
	
	Video selectOne(String youtubeId);

	List<Video> search(SearchCondition condition);
	
}