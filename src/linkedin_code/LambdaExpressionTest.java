package linkedin_code;

import java.util.Random;

public class LambdaExpressionTest
{

    public static void main(String[] args)
    {
	Greeting greeting = new HelloGreeting();
	greeting.sayHello();
	
	Greeting lambdaGreeting = () -> {System.out.println("Hello World of Functional Programming !! ");};
	lambdaGreeting.sayHello();
	
	Calculator calculator = (int x,int y) -> {
	    Random random = new Random();
	    int randomNumber = random.nextInt(50);
	    
	    return x*y+randomNumber;
	};
	
	int result = calculator.calculate(1, 2);
	System.out.println("Value of Calculate : "+result);
	
	//TODO implement the Lambda Expressions using built in JAVA Functional Interfaces.
	
    }
}
