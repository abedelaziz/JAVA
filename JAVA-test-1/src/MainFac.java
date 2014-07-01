import java.util.Scanner;


public class MainFac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		int n=0;
		try{
		System.out.println("enter n");
		Scanner input =new Scanner(System.in);
		n = input.nextInt();
		System.out.println("enter (1) for iterative algo and (2) for recursive one");
		choice=input.nextInt();
		}
		catch(Exception e){
			System.out.println("please enter a numeric value");
		}
		if(choice==1){
		// factorial with for loop iterative algorithm
		Factorial facCal=new FactorialOne();
		System.out.println(facCal.fac(n));
		}
		else
			if(choice==2){
		// factorial with recursive call
		Factorial facCalrec=new FactorialTwo();
		System.out.println(facCalrec.fac(n));
			}
			else{
				System.out.println(choice +" not in [1,2]");
			}
	}

}
