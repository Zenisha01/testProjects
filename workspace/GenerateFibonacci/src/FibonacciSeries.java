import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s = new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
          int n = s.nextInt();
	       
//		int i,a,b,c;
//		a=0;
//		b=1;
//		c=0;
//				
//        System.out.println("Fibnoci series is:");
//       
//        System.out.print(a);
//        System.out.print(" " +b);
//        for(i=0;i<=n;i++)
//                {
//            c =a+b;
//          System.out.print(" "+c);
//            a=b;
//            b=c;
//           
//        }  
//    }
//}
//	      
			
	  
	       if (n == 0) {
         System.out.println("0");
	       } else if (n == 1) {
	           System.out.println("0 1");
	       } else {
	           System.out.print("0 1 ");	           
	           int a = 0;
	           int b = 1;
	           for (int i = 1; i < n; i++) {
	               int c = a + b;
	               System.out.print(c + " ");
	               a = b;
	               b = c;
	           }
	       }
	   }
	}
