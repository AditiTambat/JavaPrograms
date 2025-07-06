import java.util.ArrayList;
import java.util.List;

public class TicketMain {
public static void main(String[] args) {
		
	 TrainTicket t1 = new TrainTicket(101, "Aditi", 1001, 15);
	 
	 //try to change values
	// t1.passengername = "Ram"; //-> it needs public field
//	 t1.setPassengername("Ram"); -> it needs setter method
	 
     TrainTicket t2 = new TrainTicket(102, "Sita", 2001, 22);
     TrainTicket t3 = new TrainTicket(103, "Gita", 3001, 8);

     List<TrainTicket> ticketList = new ArrayList<>();
     ticketList.add(t1);
     ticketList.add(t2);
     ticketList.add(t3);
     

     for (TrainTicket ticket : ticketList) {
         System.out.println(ticket);
     }
 
	}
}
