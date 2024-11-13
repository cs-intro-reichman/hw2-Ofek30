// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
	    int num=Integer.parseInt(args[0]);
		double pi=1;
		
		for(int i=0;i<num-1;i++)
		{
			if(i%2==0 ||i==0)
			{
              pi=pi-(1.0/(3.0+2.0*(double)i));
			}
			else
			{
				pi=pi+(1.0/(3.0+2.0*(double)i));

			}
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+pi*4.0);
	}
}
