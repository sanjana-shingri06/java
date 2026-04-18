class Student{
    
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

}

public class object {
    public static void main(String[] args) {
        Student students[]=new Student[2];
        students[0]=new Student(1,"satyarth");
        students[1]=new Student(2,"SAnju");
        for(Student nums:students){
System.out.println(nums);
        }

    }
    
}
