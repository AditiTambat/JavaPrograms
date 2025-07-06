
public class TrainTicket{
	private final int tktid;
	private final String passengername;
	private final int trainnumber;
	private final int seatnumber;
	
	
	public TrainTicket(int tktid, String passengername,int trainnumber, int seatnumber) {
		this.tktid = tktid;
		this.passengername = passengername;
		this.trainnumber = trainnumber;
		this.seatnumber = seatnumber;
			
	}

	public int getTktid() {
		return tktid;
	}
	
//	public void setPassengername(String passengername) {
//		this.passengername = passengername;
//	}

	public String getPassengername() {
		return passengername;
	}

	public int getTrainnumber() {
		return trainnumber;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	@Override
	public String toString() {
		return "TicketId=" + tktid + ", Passenger Name=" + passengername + ", Train Number=" + trainnumber
				+ ", Seat Number=" + seatnumber ;
	}	
	
}

