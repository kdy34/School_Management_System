
public class School {

	private TreeNode root;

    public School() {
    	
        this.root = null;
    }

    public void addCoursetoSchool(Course course) {
    	
    	TreeNode newNode = new TreeNode(course);

        if (root == null) {
        	
            root = newNode;
        } 
        
        else {
        	
            TreeNode current = root;
            boolean added = false;

            while (!added) {
            	
                if (course.getCourseID() < current.getCourse().getCourseID()) {
                	
                    if (current.getLeft() == null) {
                    	
                        current.setLeft(newNode);
                        added = true;
                    } 
                    else {
                    	
                        current = current.getLeft();
                    }
                } 
                else {
                	
                    if (current.getRight() == null) {
                    	
                        current.setRight(newNode);
                        added = true;
                    } 
                    else {
                    	
                        current = current.getRight();
                    }
                }
            }
        }
    }
    
    public void addStudenttoSchool(Student student, Course course) {
    	
        TreeNode current = root;

        while (current != null) {
        	
            if (course.getCourseID() == current.getCourse().getCourseID()) {
            	
                current.addStudenttoTreeNode(student);
                break;
            } 
            
            else if (course.getCourseID() < current.getCourse().getCourseID()) {
            	
                current = current.getLeft();
            } 
            
            else {
            	
                current = current.getRight();
            }
        }
    }
    
    public void addInstrutortoSchool(Instructor instructor, Course course) {
    	
        TreeNode current = root;

        while (current != null) {
        	
            if (course.getCourseID() == current.getCourse().getCourseID()) {
            	
                current.addInstructortoTreeNode(instructor);
                break;
            } 
            
            else if (course.getCourseID() < current.getCourse().getCourseID()) {
            	
                current = current.getLeft();
            } 
            
            else {
            	
                current = current.getRight();
            }
        }
    }

    public void printCourses() {
    	
        printTree(root);
    }

    private void printTree(TreeNode node) {
    	
        if (node != null) {
        	
            printTree(node.getLeft());
            System.out.println(node);
            printTree(node.getRight());
        }
    }
}
