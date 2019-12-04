package org.lq.ZOO.communal;

public enum AnimalStatusType {
	//动物状态 存在
	ANIMAIL_EXIST(1,"存在"),
	ANIMAL_DIE(2,"死亡");
	private int id;
	private String status;
	AnimalStatusType(int id,String status) {
		this.id = id;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return status;
	}
}
