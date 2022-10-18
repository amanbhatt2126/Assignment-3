// Aman Bhatt 19105013

import java.util.*;


public class Question4{


	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();  // taking integer input

		while(n!=1){
			System.out.println(n);
			if(n%2==0) n/=2;
			else n = 3*n + 1;

		}


	}
}