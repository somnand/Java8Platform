package code;

interface I
{
    public void show(String msg);
}

public class LambdaTest
{
    public static void main(String[] args)
    {
	I i;
	
	i = (String msg) ->
	{
	    System.out.println("Showing message : "+msg);
	};
	
	i.show("Hello World ! ");
    }

}
