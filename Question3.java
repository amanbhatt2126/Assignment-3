// Aman Bhatt 19105013
import java.util.*;

public class Question3{

	public static void main(String args[]){

		String str = "abcsjksjakdja"; 

		char []charArr	= str.toCharArray();
		Arrays.sort(charArr);
		str = new String(charArr);

		System.out.println(str);
	}
}