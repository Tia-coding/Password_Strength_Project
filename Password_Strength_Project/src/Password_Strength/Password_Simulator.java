package Password_Strength;
import java.util.Random;
public class Password_Simulator {
	
		public static boolean attack(String target)
		{
			Random rd=new Random();
			int max_try=10000;
			String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*%$#@?!&";
			for(int i=0;i<max_try;i++)//java123@!$  
			{
				String myGuess="";
				
				for(int j=0;j<target.length();j++)
				{
					myGuess+=characters.charAt(rd.nextInt(characters.length()));
				}
	            if (myGuess.equals(target)) {
	                System.out.println("Password cracked in " + i + " tries!");
	                return true;
	            }
			}
			System.out.println("Failed to crack password in " + max_try + " tries.");
	        return false;
	    
	    }
}
