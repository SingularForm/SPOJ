package questions.spoj;

import java.util.Scanner;

public class PrimeNumCryptosystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no. of test:");
		int count=scan.nextInt();
		int arr[]=new int[count];
		System.out.println("enter the elements:");
		for(int i=0;i<count;i++) {
			arr[i]=scan.nextInt();
			if(arr[i]>0) {
				int num=arr[i];
				int rem=num%2;
				if(rem!=0) {
					System.out.println(num);
					continue;
				}
			}
		}
	}

}
