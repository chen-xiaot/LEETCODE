package StringEasy;

public class No551StudentAttendanceRecord1 {

	 public boolean checkRecord(String s) {  // 10ms
	        if(s.contains("LLL")) return false;
	        else if (s.indexOf("A") != s.lastIndexOf("A")) return false;
	        else return true;
	    }
	 
	 public boolean checkRecord2(String s) {  // 18ms
		 if(s.matches(".*A.*A.*")) return false;
	        else if (s.matches(".*LLL.*")) return false;
	        else return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
