package com.swim.domain;
/**
 * �γ��ܱ�
 * @author Chan
 *
 */
public class CourseTotal { 
	private int ctid;//�γ�����
	private String ctname;//�γ���
	private int tid;//�γ̽�ʦ���
	private String studentnumber;//�γ��Ѿ������ѧ����Ŀ
	private String ctbrief;//�γ̼��
	private String img;//�γ̷���
	
	public int getCtid() {
		return ctid;
	}
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}
	public String getCtbrief() {
		return ctbrief;
	}
	public void setCtbrief(String ctbrief) {
		this.ctbrief = ctbrief;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
