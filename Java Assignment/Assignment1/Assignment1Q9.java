package assignment1;
//
//
import java.util.*;
//
//class Student {
//    private int subjectA,subjectB,subjectC;
//
//    public Student() {
//        subjectA=0;
//        subjectB=0;
//        subjectC=0;
//    }
//    public void setMarks(int a,int b,int c)
//    {
//        subjectA = a;
//        subjectB = b;
//        subjectC = c;
//    }
//
//    public int studentsTotalMarksInAllSubjects(Student[] students) {
//        int total=0;
//        for(int i=0;i<students.length;i++)
//        {
//            total += students[i].subjectA + students[i].subjectB + students[i].subjectC;
//        }
//        return total;
//    }
//
//    public double studentsAverageMarksInAllSubjects(Student[] students) {
//        double total=0.0;
//        for(int i=0;i<students.length;i++)
//        {
//            total += students[i].subjectA + students[i].subjectB + students[i].subjectC;
//        }
//        return total/students.length;
//    }
//
//    public int[] subjectWiseMarks(Student[] students,String subjectName) {
//        int k=0;
//        int marks[] = new int[students.length];
//        for(int i=0;i<students.length;i++)
//        {
//            if(subjectName=="subjectA"){
//            marks[k]= students[i].subjectA;
//            k++;
//            }
//            if(subjectName=="subjectB"){
//                marks[k]= students[i].subjectB;
//                k++;
//            }
//            if(subjectName=="subjectC"){
//                marks[k]= students[i].subjectC;
//                k++;
//            }
//        }
//        return marks;
//    }
//
//    public int subjectATotalByStudents(int[] marks) {
//        return subjectTotalByStudents(marks);
//    }
//    public int subjectBTotalByStudents(int[] marks) {
//        return subjectTotalByStudents(marks);
//    }
//    public int subjectCTotalByStudents(int[] marks) {
//        return subjectTotalByStudents(marks);
//    }
//
//    public int subjectTotalByStudents(int[] marks) {
//        int total=0;
//        for(int i=0;i<marks.length;i++)
//        {
//            total += marks[i] ;
//        }
//        return total;
//    }
//
//    public double subjectAAverageByStudents(int[] marks) {
//        double total;
//        total = subjectTotalByStudents(marks);
//        return total/marks.length;
//    }
//    public double subjectBAverageByStudents(int[] marks) {
//        double total;
//        total = subjectTotalByStudents(marks);
//        return total/marks.length;
//    }
//    public double subjectCAverageByStudents(int[] marks) {
//        double total;
//        total = subjectTotalByStudents(marks);
//        return total/marks.length;
//    }
//
//}
//
//public class Assignment1Q9 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of students");
//        int n= scan.nextInt();
//        Student students[] = new Student[n];
//        int a,b,c;
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("Enter student"+(i+1)+" marks for 3 subjects");
//            a= scan.nextInt();
//            b= scan.nextInt();
//            c= scan.nextInt();
//            students[i] = new Student();
//            students[i].setMarks(a,b,c);
//        }
//        Student student = new Student();
//        System.out.println(student.studentsTotalMarksInAllSubjects(students));
//        System.out.println(student.studentsAverageMarksInAllSubjects(students));
//        int marksA[] = student.subjectWiseMarks(students,"subjectA");
//        int marksB[] = student.subjectWiseMarks(students,"subjectB");
//        int marksC[] = student.subjectWiseMarks(students,"subjectC");
//        System.out.println(student.subjectATotalByStudents(marksA));
//        System.out.println(student.subjectAAverageByStudents(marksA));
//        System.out.println(student.subjectBTotalByStudents(marksB));
//        System.out.println(student.subjectBAverageByStudents(marksB));
//        System.out.println(student.subjectCTotalByStudents(marksC));
//        System.out.println(student.subjectCAverageByStudents(marksC));
//    }
//}
   

class Student {
    private int subjectA,subjectB,subjectC;

    public static int studentsTotalMarksInAllSubjects(Student[] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA+s.subjectB+s.subjectC;
        }
        return sum;
    }

    public static double studentsAverageMarksInAllSubjects(Student[] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA+s.subjectB+s.subjectC;
        }
        avg=sum/3;
        return avg;
    }

    public static int subjectATotalByStudents(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectA;
        }
        return sum;
    }
    public static int subjectBTotalByStudents(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectB;
        }
        return sum;
    }
    public static int subjectCTotalByStudents(Student [] students) {
        int sum=0;
        for(Student s:students)
        {
            sum+=s.subjectC;
        }
        return sum;
    }


    public static double subjectAAverageByStudents(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectA;
        }
        avg=sum/3;
        return avg;
    }
    public static double subjectBAverageByStudents(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectB;
        }
        avg=sum/3;
        return avg;
    }
    public static double subjectCAverageByStudents(Student [] students) {
        double avg=0;
        int sum=0;
        for(Student s:students)
        {
            sum +=s.subjectC;
        }
        avg=sum/3;
        return avg;
    }

    Student(int x,int y, int z)
    {
        subjectA=x;
        subjectB=y;
        subjectC=z;
    }
}

public class Assignment1Q9 extends Student{

    Assignment1Q9(int x, int y, int z) {
        super(x, y, z);
    }
    public static void main(String[] args) {
        Student s1= new Student(10,20,30);
        Student s2= new Student(10,20,30);
        Student s3= new Student(10,20,30);
        Student s[]={s1,s2,s3};
        System.out.println(studentsTotalMarksInAllSubjects(s));
        System.out.println(studentsAverageMarksInAllSubjects(s));
        System.out.println(subjectATotalByStudents(s));
        System.out.println(subjectAAverageByStudents(s));
        System.out.println(subjectBTotalByStudents(s));
        System.out.println(subjectBAverageByStudents(s));
        System.out.println(subjectCTotalByStudents(s));
        System.out.println(subjectCAverageByStudents(s));


         


    }
}
