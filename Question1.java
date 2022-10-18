// Aman Bhatt 19105013
public class Question1{

	static int compareTo(String a, String b){

		int i = 0, j = 0;
		while(i<a.length() && j < b.length()){

			if((int)a.charAt(i) != (int)b.charAt(j)){
				return -(int)b.charAt(j) + (int)a.charAt(i); 
			}

			i++;
			j++;
		}


		return -b.length() + a.length(); 
	}
	public static void main(String args[]){

		String a = "abcd", b = "abxc"; 

		int val = compareTo(a,b);  // return 0 if both strings are equal, positive if a > b and negative if b > a
		System.out.println(val);
	}
}
