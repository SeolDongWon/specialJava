package ch07.sec06;

import java.util.Objects;

public class Student {
	//멤버변수
	private int id;
	private String tel;
	//생성자(디생,매생)
	public Student() {
		this(0,null);
	}
	public Student(int no, String tel) {
		super();
		this.id = no;
		this.tel = tel;
	}
	//멤버함수(연산,겟터,셋터,오버라이딩)
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if(this.id==stu.id&& this.tel.equals(stu.tel)) {
			return true;
		}else {
			return false;
		}		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id,tel);
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", tel=" + tel + "]";
	}
	
	
	
	
	
	
	
	//출력함수
}
