import java.util.*;

class Salary {
    int empId;
    double basic, bonus;

    Salary(int id,double b,double bo){
        empId=id;
        basic=b;
        bonus=bo;
    }

    void display(){
        double total=basic+bonus;

        System.out.println("Employee ID: "+empId);
        System.out.println("Basic Salary: "+basic);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+total);
    }
}

public class SalaryManagement {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id=sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double b=sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bo=sc.nextDouble();

        Salary s=new Salary(id,b,bo);

        s.display();
    }
}