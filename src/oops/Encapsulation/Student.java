package Encapsulation;

public class Student {

	private int rollNumber;
	private String name;
	 private boolean Attended;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student ( int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setStudentAttendence(boolean flag) {
		Attended=flag;
		System.out.println("tracher assigned");
	}
	public boolean getStudentAttendence() {
		System.out.println("Techer accessed");
		return Attended;
	}
}
