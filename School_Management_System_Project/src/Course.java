import java.util.Date;
import java.util.LinkedList;

public class Course implements CourseInterface{

	private int courseID;
	private String courseCode;
	private String courseName;
	private Date courseDate;
	LinkedList<Instructor> instructors;
	LinkedList<Student> students;
	
	Course next;
	
	public Course() {
		
	}

	public Course(int courseID, String courseCode, String courseName, Date courseDate) {
		super();
		this.courseID = courseID;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseDate = courseDate;
		instructors = new LinkedList<Instructor>();
		students = new LinkedList<Student>();
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getCourseDate() {
		return courseDate;
	}

	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}
	
	 public LinkedList<Instructor> getInstructors() {
	    return instructors;
	 }

	  public LinkedList<Student> getStudents() {
	    return students;
	  }

	//adding unimplemented methods from our Course Interface
	
	@Override
	public void updateCourse(Course course) {
		
		System.out.println("The course info has been updated.");
		System.out.println("Course: " + course.courseCode + " " + course.getCourseName());
	}

	@Override
	public void deleteCourse(Course course) {
		
		System.out.println("Course has been deleted.");
		System.out.println("Course: " + course.courseCode + " " + course.getCourseName());
	}

	@Override
	public void addCourse(Course course) {
		
		System.out.println("Course has been added.");
		System.out.println("Course: " + course.courseCode + " " + course.getCourseName());
	}
	
	
}
