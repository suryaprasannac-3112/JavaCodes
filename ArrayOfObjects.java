class Student{
    int rollno;
    String name;
    int marks;
    //these are instance variables these variables belongs to a class not a method
}

public class ArrayOfObjects{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Prasanna";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsha";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Surya";
        s3.marks = 7;

        Student students[] = new Student[3]; //s1, s2, s3 they will become the part of the array as we going to store those objects in this array
        //here in the above line we are not creating 3 student objects
        //we are creating an array that can hold student references it'll not create those objects by itself
        
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        /*for(int i=0; i<students.length;i++){
            System.out.println(students[i].name  + " " + students[i].rollno + " " + students[i].marks);
        }*/
       for(Student stud : students){
        System.out.println(stud.rollno  + " : " + stud.name + " -> " + stud.marks);
       }

    }
}