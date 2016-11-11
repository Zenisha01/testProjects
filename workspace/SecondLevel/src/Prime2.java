import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	       System.out.print("Enter first:");
	       int start = s.nextInt();	
	       System.out.print("Enter last:");
	       int end=s.nextInt();
		Prime2 object =new Prime2();
		object.primeCount(start,end);
	}
		 public  void primeCount(int start, int end)
	        {
	            int count = 0;
	            int notprime=0;
	            for(int i=start;i<=end;i++)
	            {
	              
	              if(IsPrime(i))
	              {
	                  count++;
	              }
	              else{
	                	notprime++;
	                }
	            }
	            System.out.println("Total number of prime number:" + count);
	            System.out.println("Total number of not prime number:" + notprime);
	        }


	    public static Boolean IsPrime(int n)
	        {
	         Boolean prime = true;
	            if (n == 1)
	                prime = false;
	            if (n <= 0)
	                prime = false;
	            for (int i = 2; i <= n / 2; i++)
	            {
	            if (n % i == 0)
	            {
	              prime = false;
	              break;
	                }
	            }

	            return prime;
	        }
	
}