package model;

import java.io.Serializable;
import java.sql.Date;
//import java.text.SimpleDateFormat;

public class Attendance implements Serializable{
	private static final long serialVersionUID = -6267924876808800107L;

	private Integer rid; //id unique in the table , auto increment
	private Integer fk_user;
	private Date time;
//	private Integer timestamp;
	private Integer direct; //1 enter ,  0 leave
	private Integer type;  //1 general, 2 vacation, 3 doctor
	
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getFk_user() {
		return fk_user;
	}
	public void setFk_user(Integer fk_user) {
		this.fk_user = fk_user;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getDirect() {
		return direct;
	}
	public void setDirect(Integer direct) {
		this.direct = direct;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
//	public Integer getTimestamp() {
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(this.getTime());
//		return timestamp;
//	}
//	public void setTimestamp(Integer timestamp) {
//		this.timestamp = timestamp;
//	}
	
}
