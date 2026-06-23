import java.util.*;

public class MarksheetGeneration {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name=sc.next();

        System.out.print("Enter Roll No: ");
        int roll=sc.nextInt();

        System.out.print("Enter Marks of 3 Subjects: ");

        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        int total=m1+m2+m3;
        double per=total/3.0;

        System.out.println("\n----- MARKSHEET -----");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);

        if(per>=40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}