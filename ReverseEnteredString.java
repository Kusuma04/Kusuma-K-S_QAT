package test;
import java.util.Scanner;
import java.util.ArrayList;


public class ReverseEnteredString {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of string array : ");
		 
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			arrlist.add(sc.next());
			 
		}
		System.out.println("The Reversed Strings are : ");
		for(int j=arrlist.size()-1;j>=0;j--){
			System.out.println(arrlist.get(j));
		}
		
		 
		
		
	}				
			
}

