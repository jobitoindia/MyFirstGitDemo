package paymentPage;

public class PaymentPageClass {
	
	static int sum,substration, multiplication, div;  //variable declaration
	
	
	public static void additoinOfNumbers(int num1,int num2)  //method declarataion
	{
	   sum=num1+num2;
	   System.out.println("the addition of two numbers is :" +sum);
	}
	
	public static void additoinOfNumbers(int num1,int num2,int num3)  //method declarataion
	{
	   sum=num1+num2+num3;
	   System.out.println("the addition of two numbers is :" +sum);
	}
	
	public static void additoinOfNumbers(int num1,int num2, int num3,int num4)  //method declarataion
	{
	   sum=num1+num2+num3+num4;
	   System.out.println("the addition of two numbers is :" +sum);
	}
	
	
	public static void substrationOfNumbers(int num1,int num2) {
		  substration=num1+num2;
		  System.out.println("the addition of two numbers is :" +sum);
		  
		  
		  
	}
	
	
	 static public void main(String[] args)
	{
		
		PaymentPageClass ppc=new PaymentPageClass();
		additoinOfNumbers(100, 100);
		additoinOfNumbers(200, 200);
		additoinOfNumbers(500, 500);
		additoinOfNumbers(1000, 1000);
		additoinOfNumbers(10, 5000);
		additoinOfNumbers(10000, 6000);
		additoinOfNumbers(10000, 6000,6000,6000);
		additoinOfNumbers(100, 100,100);
		
	}

	
}
