package questions.spoj;

import java.util.Scanner;

public class LifeUniverseAndEverything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of element:");
		int count=scan.nextInt();
		int num[]=new int[count];
		System.out.println("enter the elements:");
		for(int i=0;i<count;i++) {
			num[i]=scan.nextInt();
			if(num[i]==42) {
				//System.out.println("nope");
				break;
			}
			else {
				System.out.println(num[i]);
				continue;
			}
		}
	}

}
