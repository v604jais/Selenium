package javaProgram;
import java.lang.Math;
public class ArmStrongNumber extends Factorial
{

	public static void main(String[] args) {
		
     int n=reader();
     ARDetector (n);
	}

	public static void ARDetector (int n)
	{
		double sum=0;
		int OrignalNum=n;
		
		while (n!=0)
		{
			int remainder=n%10;
			sum=sum+Math.pow(remainder, 3);
			n=n/10;
		}
		if (OrignalNum==sum)
			System.out.println(OrignalNum+" is a armstrong");
		else
			System.out.println(OrignalNum+" is not a armstrong");
	}
	
}
