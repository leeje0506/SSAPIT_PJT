package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.dto.Video;
import com.ssafy.board.model.service.VideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api-video")
@Api(tags="영상 컨트롤러")
public class VideoRestController {
	
	@Autowired
	private VideoService videoService;
	
	// 전체 비디오 가져와
	@GetMapping("/videos")
	@ApiOperation(value="영상 전체 조회")
	public List<Video> videoList() {
		return videoService.getVideoList();
	}

	//1. 목록(검색조건 있을 수도 있고 없을 수도 있다.)
	@GetMapping("/condition")
	@ApiOperation(value="조건별 영상 조회", notes="영상을 조건별로 가져온다.")
	public ResponseEntity<?> list(SearchCondition condition){
//		List<Board> list = boardService.getList(); //전체 조회
		List<Video> list = videoService.search(condition); //검색 조건이 있다면 그것으로 조회
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}
}