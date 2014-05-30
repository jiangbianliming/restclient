package pku.edu.cn.monitor.restclient;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "media")
public class Media {
	private String id;
	private String position;
	private String type;
	private String coding;
	private int size;
	private Date begintime;
	private int length;
	private String rn_sid;
	private String rn_name;
	private int task_id;
	private String task_name;
	private String ipc_sid;
	
	
	
	public String getRn_name() {
		return rn_name;
	}
	public void setRn_name(String rn_name) {
		this.rn_name = rn_name;
	}
	public String getIpc_sid() {
		return ipc_sid;
	}
	public void setIpc_sid(String ipc_sid) {
		this.ipc_sid = ipc_sid;
	}
	public String getRn_sid() {
		return rn_sid;
	}
	public void setRn_sid(String rn_sid) {
		this.rn_sid = rn_sid;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getId() {
		return id;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCoding() {
		return coding;
	}
	public void setCoding(String coding) {
		this.coding = coding;
	}
	public int getSize() {
		return size;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
