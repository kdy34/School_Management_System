import java.util.LinkedList;

public class Instructor extends Person implements InstructorMethods{

	private int instID;
	LinkedList<Course> courses;
	
	Instructor next;

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String lastName, int instID) {
		super(id, firstName, lastName);
		this.instID = instID;
		courses = new LinkedList<Course>();
	}

	public int getInstID() {
		return instID;
	}

	public void setInstID(int instID) {
		this.instID = instID;
	}

	//adding unimplemented methods from our Instructor Interface
	
	@Override
	public void updateInstructor(Instructor instructor) {
		
		System.out.println("Instructor has been updated.");
		System.out.println("Instrucor Full Name: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		
		System.out.println("Instructor has been deleteed.");
		System.out.println("Instrucor Full Name: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public void addInstructor(Instructor instructor) {
		
		System.out.println("Instructor has been added.");
		System.out.println("Instrucor Full Name: " + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
}
