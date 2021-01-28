package labs;

public class Lab2 {

	public static void main(String[] args) {

		Student student = new Student("Hari", "656783989");
		student.setPhone("9875562723");
		student.setCity("Hyderabad");
		student.setState("Telangana");
		student.enroll("English");
		student.enroll("Hindi");
		student.showCourses();
		System.out.println(student);
	}

}

class Student {

	private static int iD = 100;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private double balance;
	private String phone;
	private String city;
	private String state;

	public Student(String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		this.userID = iD + "" + randNum + SSN.substring(SSN.length() - 4);

	}

	private void setEmail() {
		email = name.toLowerCase() + "@gmail.com";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void enroll(String course) {
		this.courses += "\n" + course;
		System.out.println(courses);
		balance += costOfCourse;
	}

	public void pay(double amount) {
		balance = balance - amount;
	}

	public void checkBalance() {
		System.out.println("Balance :  $" + balance);
	}

	public void showCourses() {
		System.out.println("Courses : " + courses);
		checkBalance();
	}

	@Override
	public String toString() {
		return "Student [userID=" + userID + ", name=" + name + ", SSN=" + SSN + ", email=" + email + ", balance="
				+ balance + ", phone=" + phone + ", city=" + city + ", state=" + state + "]";
	}

}
