class CollegeManagement {
    String facultyName;
    String facultyDept;
    String studentName;
    int rollNo;
    void setFacultyDetails(String fname,String dept){
        facultyName=fname;
        facultyDept=dept;
    }
    void setStudentDetails(String sname,int rno){
        studentName=sname;
        rollNo = rno;
    }
    void displayDetails(){
        System.out.println("Faculty Name:"+facultyName);
        System.out.println("Faculty Department:"+facultyDept);
        System.out.println("Student Name:"+studentName);
        System.out.println("Roll Number:"+rollNo);
    }
}
class School extends CollegeManagement{
    int marks;
    void setMarks(int m){
        marks=m;
    }
    void displayStudentWithMarks(){
        displayDetails();
        System.out.println("Marks:"+marks);
    }
}
public class Main{
    public static void main(String[] args){
        School s1=new School();
        s1.setFacultyDetails("Ravi Kumar","Maths");
        s1.setStudentDetails("Poojaswi",87);
        s1.setMarks(95);
        s1.displayStudentWithMarks();
    }
}
