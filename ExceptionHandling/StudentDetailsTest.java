package ExceptionHandling;


class MarksCannotBeNegativeException extends Exception {
    public MarksCannotBeNegativeException(String message) {
        super(message);
    }
}

class StudentDetails {
    private String Name;
    private String regNo;
    private double totalMarks;

    public StudentDetails(String Name, String regNo, double totalMarks) throws MarksCannotBeNegativeException{
        this.Name = Name;
        this.regNo = regNo;
        if(totalMarks < 0) {
            throw new MarksCannotBeNegativeException("Students total marks cannot be in negative");
        }
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public double getTotalMarks() {
        return  totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }
    public String toString() {
        if (totalMarks >= 200)
            return "Student has achieved passing marks";
        return null;
    }
}
public class StudentDetailsTest {
    public static void main(String[] args) {
        try {
            StudentDetails student1 = new StudentDetails("Yash Runnoo", "22MCA0421", 678);
            StudentDetails student2 = new StudentDetails("Arkadipta Mojumder", "22MCA0201", 189);

            System.out.println("Student 1 details: " + student1.getName() + "," + student1.getRegNo() + "," + student1.getTotalMarks());
            System.out.println("Student 2 details: " + student2.getName() + "," + student2.getRegNo() + "," + student2.getTotalMarks());

//            System.out.println("Student 1 result status: " + student1.eligibilityCriteria());
//            System.out.println("Student 2 result status: " + student2.eligibilityCriteria());

        } catch (MarksCannotBeNegativeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

