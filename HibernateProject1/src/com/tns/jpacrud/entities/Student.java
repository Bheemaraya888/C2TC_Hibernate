package com.tns.jpacrud.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Bheemaraya
 *
 */


@Entity
@Table(name="student")
public class Student {
	@Id
	private int sid;
	
	private String sname;

	public int getStudent_id() {
		return sid;
	}

	public void setStudent_id(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return sname;
	}

	public void setName(String name) {
		this.sname = name;
	}

	public Student() {
	
	}

	public Student(int student_id, String name) {
		this.sid = student_id;
		this.sname = name;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + sid + ", name=" + sname + "]";
	}
	
}
