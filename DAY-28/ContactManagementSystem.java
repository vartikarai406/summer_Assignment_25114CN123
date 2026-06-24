import java.util.*;

class Contact {

String name;
String phone;

Contact(String n,String p){
name=n;
phone=p;
}

}

public class ContactManagementSystem {

static Scanner sc=new Scanner(System.in);
static ArrayList<Contact> list=new ArrayList<>();

public static void main(String args[]){

while(true){

System.out.println("\n1.Add Contact\n2.View Contact\n3.Delete Contact\n4.Exit");

int ch=sc.nextInt();
sc.nextLine();

switch(ch){

case 1:

System.out.print("Name:");
String n=sc.nextLine();

System.out.print("Phone:");
String p=sc.nextLine();

list.add(new Contact(n,p));
System.out.println("Added");

break;


case 2:

for(Contact c:list)
System.out.println(c.name+" "+c.phone);

break;


case 3:

System.out.print("Enter name:");
String del=sc.nextLine();

list.removeIf(c->c.name.equals(del));

System.out.println("Deleted");

break;


case 4:
System.exit(0);

}

}

}

}