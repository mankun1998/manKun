package org.lq.ZOO.communal;

public enum StaffProfessionType {
	
	/*
	 * STAFF_DOCTOR 医生
	 */
	STAFF_DOCTOR(1,"医生"),
	/**
	 * STAFF_FEED 饲养员
	 */
	STAFF_FEED(2,"饲养员");
	
	private int id;
	private String staff;
	StaffProfessionType(int id,String staff) {
		this.id = id;
		this.staff = staff;
	}
	
	public int getId() {
		return id;
	}
	
	public String getStaff() {
		return staff;
	}
	
	@Override
	public String toString() {
		return staff;
	}
}
