import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter name and password to reach the School Management System (SMS) \nName:\nPassword:");
			
			String name = "admin";
			String password = "12345";
			
			String userNameChoice = scanner.next();
			String userPassChoice = scanner.next();
			
			if (!name.equalsIgnoreCase(userNameChoice.toLowerCase()) || !password.equalsIgnoreCase(userPassChoice)) { //Do not think case sensitive
				
				System.out.println("Invalid Value!");
			}
			
			else {
				
				String msg = "Welcome to the School Management System";
				
				System.out.println(msg);
				
				System.out.println();
				
				//String msgFouUser = "Please Select an option \n1) Display all the courses \n2) display all the instructors";
				
				//System.out.println(msgFouUser + "\n");
				
				//int choice = scanner.nextInt();
				
				
				/*LinkedList<Course> courses = new LinkedList<Course>();
				LinkedList<Student> students = new LinkedList<Student>();
				LinkedList<Instructor> instructors = new LinkedList<Instructor>();*/
				
				School school = new School();
				
				System.out.println();
				
				Student student1 = new Student(1, "Buse", "Tasdelen", 2001631);
				Student student2 = new Student(2, "Deniz", "Yazicioglu", 2001299);
				Student student3 = new Student(3, "Burak", "Taskiran", 2018903);
				
				
				StudentList studentList = new StudentList();
				
				studentList.addStudent(student1);
				student1.addStudent(student1);
				studentList.addStudent(student2);
				student2.addStudent(student2);
				studentList.addStudent(student3);
				student3.addStudent(student3);
				
				System.out.println();
				
				studentList.displayStudents();
				
				
				Instructor instructor1 = new Instructor(1, "Merve", "Ariturk", 1234567);
				Instructor instructor2 = new Instructor(2, "Ozge", "Kasap", 1234567);
				Instructor instructor3 = new Instructor(3, "Yucel Batu", "Salman", 1234567);
				
				
				InstructorList instructorList = new InstructorList();
				
				instructorList.addInstructor(instructor1);
				instructor1.addInstructor(instructor1);
				instructorList.addInstructor(instructor2);
				instructor2.addInstructor(instructor2);
				instructorList.addInstructor(instructor3);
				instructor3.addInstructor(instructor3);
				
				System.out.println();
				
				
				Course course1 = new Course(1, "SEN2212", "Data Structures", null);
				
				Course course2 = new Course();
				
				course2.setCourseID(2);
				course2.setCourseCode("SEN2104");
				course2.setCourseName("DBMS");
				course2.setCourseDate(null);
				
				Course course3 = new Course(3, "SEN2022", "Project Management", null);
				Course course4 = new Course(4, "TLL1004", "Literature", null);
				Course course5 = new Course(5, "GEP0309", "Popular Culture", null);
				
				CourseList courseList = new CourseList();
				
				courseList.addCourse(course1);
				course1.addCourse(course1);
				courseList.addCourse(course2);
				course2.addCourse(course2);
				courseList.addCourse(course3);
				course3.addCourse(course3);
				courseList.addCourse(course4);
				course4.addCourse(course4);
				courseList.addCourse(course5);
				course5.addCourse(course5);
				
				System.out.println();
				
				
				/*switch (choice) {
				case 1: 
					
					courseList.displayCourses();
					break;
					
				case 2:
					
					instructorList.displayInstructor();
					break;
					
				default:
					
					System.out.println("Something went wrong!!!");
				}*/
				
				
				//Adding Courses
				school.addCoursetoSchool(new Course(1, "SEN2212", "Data Structures", null));
				school.addCoursetoSchool(new Course(2, "SEN2104", "DBMS", null));
				school.addCoursetoSchool(new Course(3, "CMP2004", "Hardware", null));
				school.addCoursetoSchool(new Course(4, "TLL1004", "Literature", null));
				school.addCoursetoSchool(new Course(5, "GEP0309", "Popular Culture", null));
				
				
				//Assigning instructors into to the courses
				school.addInstrutortoSchool(instructor1, course1);
				school.addInstrutortoSchool(instructor1, course2);
				school.addInstrutortoSchool(instructor1, course3);
				school.addInstrutortoSchool(instructor2, course1);
				school.addInstrutortoSchool(instructor3, course1);
				school.addInstrutortoSchool(instructor2, course3);
				school.addInstrutortoSchool(instructor2, course4);
				school.addInstrutortoSchool(instructor2, course5);
				school.addInstrutortoSchool(instructor3, course2);
				school.addInstrutortoSchool(instructor3, course3);
				
				
				//Assigning students into to the courses
				school.addStudenttoSchool(student1, course2);
				school.addStudenttoSchool(student1, course4);
				school.addStudenttoSchool(student1, course5);
				school.addStudenttoSchool(student2, course1);
				school.addStudenttoSchool(student2, course2);
				school.addStudenttoSchool(student3, course3);
				school.addStudenttoSchool(student3, course4);
				school.addStudenttoSchool(student3, course1);
				school.addStudenttoSchool(student3, course5);
				
				
				//Showing the output
				school.printCourses();
				
				//Closing scanner
				scanner.close();
			}
			
		}
		
		catch (Exception e) {
			
			System.out.println("An error occured!");
		}
			
			
		
	}
	
}
