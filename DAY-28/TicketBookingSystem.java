import java.util.*;

public class TicketBookingSystem {

static Scanner sc=new Scanner(System.in);
static int seats=10;

public static void main(String args[]){

while(true){

System.out.println("\n1.Book Ticket\n2.Cancel Ticket\n3.Available Seats\n4.Exit");

int ch=sc.nextInt();

switch(ch){

case 1:
if(seats>0){
seats--;
System.out.println("Ticket Booked");
}
else
System.out.println("No Seats Available");
break;


case 2:
seats++;
System.out.println("Ticket Cancelled");
break;


case 3:
System.out.println("Available Seats:"+seats);
break;


case 4:
System.exit(0);

}

}

}

}