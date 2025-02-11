package com.celcom.day3;

public class JavaBean {
	private int eid;
	private String ename;
	private float esalary;

	public JavaBean() {

	}

	public JavaBean(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public static void main(String[] args) {
		JavaBean obj = new JavaBean(75, "Nithin", 40000.0f);
	}

}
