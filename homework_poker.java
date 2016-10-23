package homework;

import java.util.Scanner;

public class homework_poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int times=0,flower=4,getflower=0,number=13;
		String[] putin={"spade","heart","diamond","club"};
		System.out.println("How many times do you want to print?");
		times=scan.nextInt();
		for(int count=0;count<times;count++)
		{
			for(getflower=0;getflower<flower;getflower++)
			{
						for(int getnumber=1;getnumber<=number;getnumber++)
						{
							System.out.println(putin[getflower]+"   "+getnumber);
						}
			}
		}
	
	}

}
