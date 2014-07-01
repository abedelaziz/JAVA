import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isnert n");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		
		System.out.println(n+"! = "+fac2(n));
		input.close();
	}
	//factorial 1
	private static int fac(int n){
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
	//factorial 2
	private static int fac2(int n){
		if(n>1){
			System.out.println(n+"*");
			return n*fac2(n-1);
		}
		return 1;
	}
	

}
