import java.util.*;
public class PrintOneItSorted {
    //print 1 if an array is sorted order(ascending)
//print 0 if.its not sorted.order
	public static int check(int[] brr){
	//	int n=5;
		for(int i=0;i<brr.length-1;i++){
			if(brr[i]>brr[i+1]){
			return 0;}
		}		
			return 1;		
	}
	public static void main(String[] args) {
		int last;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element you want to insert in array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
	//	for(int i=0;i<n;i++){
		//	last=check(ar);
			System.out.println(check(ar));
	//	}
	}
}

