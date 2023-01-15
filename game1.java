import java.util.*;
class game1{
	public static void main(String args[]){
		
		int ych;
		int cch;
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("Enter 0 for Rock.");
		System.out.println("Enter 1 for Paper.");
		System.out.println("Enter 2 for Scissor.");
		
		System.out.print("Enter Your Choice : ");
		ych = sc.nextInt();
		System.out.println();
		
		cch = rn.nextInt(3);
		
		if(ych == cch){
			System.out.println("Game Draw..!");
		}
		else if((ych == 1 && cch == 0) || (ych == 2 && cch == 1) || (ych == 0 && cch == 2)){
			System.out.println("You WIN The Game (: ");
		}
		else{
			System.out.println("You Loss :( ");
		}
		
		if(ych == 0){
			System.out.println("Your Choice : Rock" );
		}
		else if(ych == 1){
			System.out.println("Your Choice : Paper" );
		}
		else{
			System.out.println("Your Choice : Scissor" );
		}
		
		
		
		if(cch == 0){
			System.out.println("Computer Choice : Rock" );
		}
		else if(cch == 1){
			System.out.println("Computer Choice : Paper");
		}
		else{
			System.out.println("Computer Choice : Scissor");
		}
		
		
	}
}