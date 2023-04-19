import java.util.LinkedList;

public class Student extends Person implements StudentInterface{

	private int stuID;
	LinkedList<Course> courses;
	
	Student next;

	public Student() {
		super();
	}

	public Student(int id, String firstName, String lastName, int stuID) {
		super(id, firstName, lastName);
		this.stuID = stuID;
		courses = new LinkedList<>();
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
	public LinkedList<Course> getCourses() {
        return courses;
    }

	//adding unimplemented methods from our Student Interface
	
	@Override
	public void updateStudent(Student student) {
		
		System.out.println("Student has been updated.");
		System.out.println("Student Full Name: " + student.getFirstName() + " " + student.getLastName());
	}

	@Override
	public void deleteStudent(Student student) {
		
		System.out.println("Student has been deleted.");
		System.out.println("Student Full Name: " + student.getFirstName() + " " + student.getLastName());
	}

	@Override
	public void addStudent(Student student) {
		
		System.out.println("Student has been added.");
		System.out.println("Student Full Name: " + student.getFirstName() + " " + student.getLastName());
	}
	
	
}
