import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true) {
            System.out.println("\n1.Add Student\n2.Display Students\n3.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String n = sc.next();

                    System.out.print("Enter Age: ");
                    int a = sc.nextInt();

                    list.add(new Student(r,n,a));
                    break;

                case 2:
                    for(Student s:list)
                        s.display();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}