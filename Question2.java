// Aman Bhatt 19105013
public class Question2{

	static int[] countingSort(int []arr){

		int []freq = new int[21];  // stores the count or frequency of each element in the array
		for(int a:arr) freq[a]++;

		int j = 0;
		for(int i=0;i<=20;i++){

			while(freq[i] > 0){
				arr[j] = i;
				j++;
				freq[i]--;
			}
		}

		return arr;
	}
	public static void main(String args[]){

		int []arr = {5,6,4,7,1,3,9};
		arr = countingSort(arr);

		for(int a:arr) System.out.print(a + " ");
		System.out.println();
	}
}