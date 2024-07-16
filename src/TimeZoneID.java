import java.time.ZoneId;
import java.util.*;

public class TimeZoneID {

	public static void main(String[] args) {
		
		
		for(String ids : ZoneId.getAvailableZoneIds()) {
			
			String s[]=ids.split("/");
			for(String f:s) {
				
                if(f.equalsIgnoreCase("Asia")) {
                	System.out.println(ids);
                }
			}
		}
		
	    	
	    }
	}

	
