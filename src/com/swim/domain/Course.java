package com.swim.domain;
/**
 * �γ̾����½ڱ�
 * @author Chan
 *
 */
public class Course {
	private int ctid;//�γ�����
	private int chid;//�γ��½ڱ��
	private String ctname;//�½���
	private String ctbrief;//�½ڼ��
	private String cttime;//�½�ʱ��
	
	private String videourl;//�γ���Ƶ��ַ
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public int getChid() {
		return chid;
	}
	public void setChid(int chid) {
		this.chid = chid;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public String getVideourl() {
		return videourl;
	}
	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}
	public String getCtbrief() {
		return ctbrief;
	}
	public void setCtbrief(String ctbrief) {
		this.ctbrief = ctbrief;
	}
	public String getCttime() {
		return cttime;
	}
	public void setCttime(String cttime) {
		this.cttime = cttime;
	}
	
}
