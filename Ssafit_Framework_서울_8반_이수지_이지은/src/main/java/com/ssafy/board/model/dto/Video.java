package com.ssafy.board.model.dto;

public class Video {
	private String youtubeId;
	private String title;
	private String fitPartName;
	private String channelName;
	private String url;
	private int viewCnt;

	public Video() {
		super();
	}

	public Video(String youtubeId, String title, String fitPartName, String channelName, String url, int viewCnt) {
		super();
		this.youtubeId = youtubeId;
		this.title = title;
		this.fitPartName = fitPartName;
		this.channelName = channelName;
		this.url = url;
		this.viewCnt = viewCnt;
	}

	public String getYoutubeId() {
		return youtubeId;
	}

	public void setYoutubeId(String youtubeId) {
		this.youtubeId = youtubeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFitPartName() {
		return fitPartName;
	}

	public void setFitPartName(String fitPartName) {
		this.fitPartName = fitPartName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	@Override
	public String toString() {
		return "Video [youtubeId=" + youtubeId + ", title=" + title + ", fitPartName=" + fitPartName + ", channelName="
				+ channelName + ", url=" + url + ", viewCnt=" + viewCnt + "]";
	}
	
}
