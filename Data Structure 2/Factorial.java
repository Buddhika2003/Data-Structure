import java.util.*;

class Factorial{
	public int getFactorial(int n){
		int fact=1;
		for(int i=1 ; i<=n ;i++){
			fact=fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---Finding Factorial of a Number---");
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		Factorial obj=new Factorial();
		int result=obj.getFactorial(num);
		
		System.out.println("Factorial : " + result);
		sc.close();
	}
}