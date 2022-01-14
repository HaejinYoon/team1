package com.team1.domain.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import lombok.Data;

@Data
public class NewsVO {
	private Integer id;
	private Integer memberId;
	private String location;
	private Integer up;
	private Integer views;
	private String tag;
	private String title;
	private String content;
	private LocalDateTime inserted;
	private LocalDateTime updated;
	private String nickname;
	private String userprofile;
	
	//해당 post가 가지고 있는 파일 리스트
	List<NewsFileVO> fileList;

		
	private Integer replyCount;
	
	private Integer upposession;
	// 현재시간 - 작성시간으로 new 마크를 해줄지 말지 결정
	private Integer newMark;
	//게시글 신고 누적 갯수
	private Integer reportCount;
	//댓글 신고 누적 갯수
	private Integer replyReportCount;
	//대댓글 신고 누적 갯수
	private Integer rereplyReportCount;
	
	public UserPostVO toUserPostVO() {
		
		UserPostVO postVO = new UserPostVO();
		postVO.setLink("news");
		postVO.setBoardType("동네소식");
		postVO.setPostId(this.id);
		postVO.setTag(this.tag);
		postVO.setTitle(this.title);
		postVO.setInserted(this.inserted);
		postVO.setUpdated(this.updated);
		
		return postVO;
	}
	
	public String getInserted() {
		return this.inserted.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
	
	public String getUpdated() {
		return this.updated.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
	
}
