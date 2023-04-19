
public class CourseList extends Course{

	Course first;
	
	public void addCourses(Course course) {
		
		if (first == null) {
            first = course;
        } else {
            Course current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = course;
        }
	}
	
	public void displayCourses() {
		
        Course current = first;
        while (current != null) {
            System.out.println("Course Code: " + current.getCourseCode());
            System.out.println("Course Name: " + current.getCourseName());
            System.out.println();
            current = current.next;
        }
	}
	
	public void deleteCourses(Course course) {
		
		Course curr = first;
        Course prev = null;

        while (curr != null) {
            if (curr.equals(course)) {
                // Found the node to remove
                if (prev == null) {
                    // The node to remove is the head node
                    first = curr.next;
                } 
                else {
                    // The node to remove is not the head node
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        
	}
}
