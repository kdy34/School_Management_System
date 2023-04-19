
public class StudentList extends Student{

	Student head;
	
	public void addStudents(Student student) {

		if (head == null) {
            head = student;
        } 
		
		else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = student;
        }
	}
	
	public void displayStudents() {
		
        Student current = head;
        
        while (current != null) {
        	
            System.out.println("Student ID: " + current.getStuID());
            System.out.println("Full Name: " + current.getFirstName() + " " + current.getLastName());
            System.out.println();
            current = current.next;
        }
	}
	
	public void deleteStudents(Student student) {
		
		Student curr = head;
        Student prev = null;

        while (curr != null) {
            if (curr.equals(student)) {
                // Found the node to remove
                if (prev == null) {
                    // The node to remove is the head node
                    head = curr.next;
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
