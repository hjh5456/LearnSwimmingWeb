package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.CourseComment;

public interface icommentservice {
		//评论课程
		public List<CourseComment> submitCommentbyuser(int uid,int ctid,String content)throws SQLException, ClassNotFoundException;
		//点赞评论
		public int goodComment(int uid,int ccid) throws SQLException, ClassNotFoundException;
		//反对评论
		public int badComment(int uid,int ccid) throws SQLException, ClassNotFoundException;
		//展示评论
		public List<CourseComment> showCommentbypage(int ctid)throws SQLException, ClassNotFoundException;
		
}
