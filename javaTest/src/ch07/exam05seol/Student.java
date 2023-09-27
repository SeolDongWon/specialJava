package ch07.exam05seol;

import java.util.Objects;

public class Student {
	private String name;
	private String dep;
	private String id;
	private double score;
	
	public Student() {
		this(null,null,null,0);
	}
	public Student(String id) {
		this(null,null,id,0);
	}
	public Student(String name,String id) {
		this(name,null,id,0);
	}
	public Student(String name, String dep, String id) {
		this(name,dep,id,0);
	}

	public Student(String name, String dep, String id, double score) {
		super();
		this.name = name;
		this.dep = dep;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getDep() {
		return dep;
	}

	public String getId() {
		return id;
	}

	public double getScore() {
		return score;
	}

	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if(this.name.equals(stu.name)&&this.dep.equals(stu.dep)&&this.id.equals(stu.dep)&&this.score==stu.score) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,dep,id,score);
	}

	@Override
	public String toString() {
			return "이름:" + name + "\n학과:" + dep + "\n학번:" + id + "\n학점평균:" + score + "\n";
	}

}
