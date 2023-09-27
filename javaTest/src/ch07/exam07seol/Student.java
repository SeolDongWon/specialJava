package ch07.exam07seol;

import java.util.Objects;

public class Student {
	private String name;
	private double score;
	
	public Student() {
		this(null,0.0);
	}
	public Student(String name) {
		this(name,0.0);
	}
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if(!(obj instanceof Student)) {
			return false;
		}
		stu = (Student)obj;
		if(this.name.equals(stu.getName())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}
