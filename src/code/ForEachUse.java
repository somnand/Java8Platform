package code;

import java.util.Arrays;
import java.util.List;

public class ForEachUse
{
    public static void main(String[] args)
    {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	System.out.println("Elements in the List");
	
	list.forEach(i -> {System.out.print(i+" ");});//Lambda expression
    }
}
