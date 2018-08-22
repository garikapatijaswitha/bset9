import java.util.Scanner;
 
class GCDofTwo1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,gcd=0;
		for(i = 1; i <= n1 && i <=n2; i++)
	    {
	        if(n1 % i == 0 && n2 % i == 0)
	        {
	            gcd = i;
	        }
	    }	
		System.out.println(gcd);
	}
}
