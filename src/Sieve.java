import java.util.Scanner;
public class Sieve {
        public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println ("Choose what number you want the sieve to go up to.");
        int sieve;
        sieve = in.nextInt();
        boolean [] num = new boolean[sieve];
        

      for (int p = 0; p <= sieve; p++)
      {

        for ( int i = 2; i<num.length;
            i=i+p)
         {
            num[i]=false;
      }


    }
                   
    
    System.out.println ("Here are the prime numbers:" + num[true]);



        }
        }

