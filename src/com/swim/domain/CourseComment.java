package com.swim.domain;
/**
 * �γ����۱�
 * @author Chan
 *
 */
public class CourseComment {
	private int ccid;//���۵ı��
	private String content;//��������
	private String cdate;//����ʱ��
	private int uid;
	private int ctid;
	private int goodnumber;//������
	private int badnumber;//������
	public int getCcid() {
		return ccid;
	}
	public void setCcid(int ccid) {
		this.ccid = ccid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public int getGoodnumber() {
		return goodnumber;
	}
	public void setGoodnumber(int goodnumber) {
		this.goodnumber = goodnumber;
	}
	public int getBadnumber() {
		return badnumber;
	}
	public void setBadnumber(int badnumber) {
		this.badnumber = badnumber;
	}
	

}
