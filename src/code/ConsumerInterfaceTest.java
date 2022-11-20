package code;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ActionForConsumer<T> implements Consumer<T>
{
    public void accept(T e)
    {
	System.out.print(e+" ");
    }
}

public class ConsumerInterfaceTest
{
    public static void main(String[] args)
    {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5);	
	
	Consumer<Integer> method = new ActionForConsumer<>();
	
	numbers.forEach(method);
	
    }

}
