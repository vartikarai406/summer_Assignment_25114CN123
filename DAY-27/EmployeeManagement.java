import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void show(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class EmployeeManagement {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> emp=new ArrayList<>();

        while(true){

            System.out.println("\n1.Add Employee\n2.Display\n3.Exit");
            int ch=sc.nextInt();

            if(ch==1){

                System.out.print("ID: ");
                int id=sc.nextInt();

                System.out.print("Name: ");
                String name=sc.next();

                System.out.print("Salary: ");
                double sal=sc.nextDouble();

                emp.add(new Employee(id,name,sal));
            }

            else if(ch==2){

                for(Employee e:emp)
                    e.show();
            }

            else
                break;
        }
    }
}