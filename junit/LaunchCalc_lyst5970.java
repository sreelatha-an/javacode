
class Calc {
	//	one unit
	public int divide(int num1, int num2)
	{
		return num1/num2;
		
	}
	
//Another unit
	public int multiply(int num1, int num2)
	{
		return num1*num2;
		
	}
}

public class LaunchCalc 
{

	public static void main(String[] args) 
	{
		Calc c=new Calc();
		
		int result=c.divide(10, 5);
		
		if(result==2)
			System.out.println("test case passed");
		else
			System.out.println("test case failed");
		
		int result2=c.divide(10, 0);
		
		if(result2==2)
			System.out.println("test case passed");
		else
			System.out.println("test case failed");
		
		
	}

}
