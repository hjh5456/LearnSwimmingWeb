package com.swim.domain;

public class Article {
	private int aid;//���±�� 
	private String adate;//���·���ʱ�� 
	private String author;//�������� 
	private int Clicknum; //���µ����
	private String content; //����ԭ��
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getClicknum() {
		return Clicknum;
	}
	public void setClicknum(int clicknum) {
		Clicknum = clicknum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
