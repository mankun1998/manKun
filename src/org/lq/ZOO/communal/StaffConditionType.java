package org.lq.ZOO.communal;

public enum StaffConditionType {

	/**
	 * STAFF_AT 在职
	 */
	STAFF_AT(1,"在职"),
	/**
	 * STAFF_LEAVE 离职
	 */
	STAFF_LEAVE(2,"离职");
	
	private int id;
	private String condition;
	private StaffConditionType(int id,String condition) {
		this.id = id;
		this.condition = condition;
	}
	public int getId() {
		return id;
	}
	public String getCondition() {
		return condition;
	}
	@Override
	public String toString() {
		return condition;
	}
}
