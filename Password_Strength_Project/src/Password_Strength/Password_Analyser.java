package Password_Strength;
import java.util.*;
public class Password_Analyser {
public static String Check_Strength(String password)
{
	int score=1;
	if(password.length()>=8)
		score++;
	if(password.matches(".*\\d.*"))
		score++;
	if(password.matches(".*[a-z].*")&& password.matches(".*[A-Z].*"))
		score++;
	if(password.matches(".*[%$#@*?!&].*"))
		score++;
	switch(score)
	{
	case 4:
		return "Very Strong";
	case 3:
		return "Strong";
	case 2:
		return "Medium";
	case 1:
		return "Weak";
	default:
		return "Very Weak";
	}
}
public static long guessBruteForceAttackTime(String password)
{
	int possible_char=94;
	int per_second_attempt=1000;
	//System.out.println(Math.pow(2,4)) will print 2*2*2*2=16
	long possiblecombination=(long) Math.pow(possible_char,password.length());
	return possiblecombination / per_second_attempt;
	
}

}
