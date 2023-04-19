
public class InstructorList extends Instructor{
	
	Instructor first;
	
	public void addInstructors(Instructor instructor) {
		
		if (first == null) {
            first = instructor;
        } else {
            Instructor current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = instructor;
        }
	}
	
	public void displayInstructor() {
		
        Instructor current = first;
        while (current != null) {
            System.out.println("Instructor ID: " + current.getInstID());
            System.out.println("Full Name: " + current.getFirstName() + " " + current.getLastName());
            System.out.println();
            current = current.next;
        }
	}
	
	public void deleteInstructors(Instructor instructor) {
		
		Instructor curr = first;
        Instructor prev = null;

        while (curr != null) {
            if (curr.equals(instructor)) {
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
