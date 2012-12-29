/*
    File Name: lucky.java
    Author: Rohan Dalvi
    Version: 1.0
 */
/*
 More changes to be made, changing command line input to stdin, using bufferedreader or scanner.
 */
public class lucky {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] numbers = new long[1000*1000];
		char[] no = new char[10000000];
		int count=0;
		for(int i=Integer.parseInt(args[0]);i<=Integer.parseInt(args[1]);i++)
		{
			
			if(islucky(i)){
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
