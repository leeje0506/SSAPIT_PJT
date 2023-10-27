package com.ssafy.board.model.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value="게시판 바구니", description = "게시글 정보")
public class Board {
	private int id;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private String youtubeId; // 새로 생성
	private int viewCnt;

	public Board() {
	}

	public Board(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public Board(int id, String title, String writer, String content, String regDate, String youtubeId, int viewCnt) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.youtubeId = youtubeId;
		this.viewCnt = viewCnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getYoutubeId() {
		return youtubeId;
	}

	public void setYoutubeId(String youtubeId) {
		this.youtubeId = youtubeId;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", youtubeId=" + youtubeId + ", viewCnt=" + viewCnt + "]";
	}
	
}
