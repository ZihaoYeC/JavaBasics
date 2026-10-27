public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record 
		double Newrecord = Math.max(Math.max(Math.max(Math.max(jump1,jump2),jump3),jump4),record);
		
		// Display the new record
		System.out.println("The current record is now "+Newrecord+" meters");
		
		// Display the next integer value
		int nextint = (int) Math.ceil(Newrecord);
		System.out.println("The current record is below "+nextint+" meters");
		
		// Display the previous integer value
		int previousint = (int) Math.floor(Newrecord);
		System.out.println("The current record is above "+previousint+" meters");
		

	}

}