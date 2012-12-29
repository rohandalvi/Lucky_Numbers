/*
    File Name: lucky.java
    Author: Rohan Dalvi
    Version: 1.0
 */
/*
 Accepting Standard Input, compliant with the test cases as mentioned in the revised readme.
 */
import java.util.Scanner;
public class Solution {
	public static void main(String args[])
	{
        long[] numbers = new long[1000*1000];
		char[] no = new char[10000000];
		int count=0;
		Scanner sc = new Scanner(System.in);
		int i=0;
        String[] s = new String[5000];
		while(sc.hasNextLine())
		{
			s[i]=sc.next();
            i++;
        }
		for(int r=Integer.parseInt(s[1]);r<=Integer.parseInt(s[2]);r++)
		{
			
			if(islucky(r))
            {
				count++;
            }
            
		}
		System.out.println(count);
        count=0;
        for(int r=Integer.parseInt(s[3]);r<=Integer.parseInt(s[4]);r++)
		{
			
			if(islucky(r))
            {
				count++;
            }
            
		}
        System.out.println(count);
        
		
	}
    public static boolean islucky(int nos)
	{
		long sum=0;
		long square_sum=0;
		while(nos/10>0)
		{
			int z = nos%10;
			sum+=z;
			square_sum+=z*z;
			nos=nos/10;
		}
		if(nos/10==0)
			sum+=nos%10;
        square_sum+=(nos%10)*(nos%10);
        
		if(isPrime(sum) && isPrime(square_sum))
            return true;
		else
			return false;
	}
	public static boolean isPrime(long n)
	{
		long i;
		for( i=2;i<=n;i++)
		{
			if(n%i==0)
				break;
		}
		if(n==i)
			return true;
		else
			return false;
	}
    
}