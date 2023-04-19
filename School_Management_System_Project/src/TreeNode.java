import java.util.LinkedList;

public class TreeNode {

	private Course course;
    private LinkedList<Student> students;
    private LinkedList<Instructor> instructors;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Course course) {
    	
        this.course = course;
        this.students = new LinkedList<Student>();
        this.instructors = new LinkedList<Instructor>();
        this.left = null;
        this.right = null;
    }

    public Course getCourse() {
        return course;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }
    
    public LinkedList<Instructor> getInstructors() {
        return instructors;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void addStudenttoTreeNode(Student student) {
        students.add(student);
    }
    
    public void addInstructortoTreeNode(Instructor instructor) {
        instructors.add(instructor);
    }
    
    @Override
    public String toString() {
        return "course = " + course.getCourseName() + ", students = " + students.toString() + ", instructors = " + instructors.toString();
    }

}
