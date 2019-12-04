/**
 * 
 */
package org.lq.ZOO.communal;

/**
 * @author 第四组 王威
 *@data 2019年6月13日
*@project_nameZOO
 */
public enum PositionType {

	ZOOKEEPER_TYPE_ID(1,"动物园园长"),
	
	SECURITYSTAFF_TYPE_ID(2,"保安");
	
	
	private int value;
	private String title;
	
	/**
	 * 
	 */
	private PositionType(int value,String title) {
		this.value = value;
		this.title = title;
	}
}
