package linkedin_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest
{
    public static void main(String[] args)
    {
	Integer[] values = new Integer[]{4,2,5,9,7};
	Stream<Integer> valuesStream = Arrays.stream(values);
	
	List<Integer> evenValues = valuesStream.filter(num -> num%2==0).collect(Collectors.toList());
	System.out.println("All even values : "+evenValues);
	
	
	//System.out.println();
	
	List<String> shoppingList = new ArrayList<>();
	shoppingList.add("Coffee");
	shoppingList.add("Bread");
	shoppingList.add("Pineaple");
	shoppingList.add("Milk");
	shoppingList.add("Pasta");
	shoppingList.add("Pasta");//Adding twice to test out distinct()
	
	System.out.println("Original List (Before) : "+shoppingList);
	
	Stream<String> stream = shoppingList.stream();
	stream.sorted().//Sorts the sequence
	distinct().//Keeps the unique elements only
	map(item -> {return item.toUpperCase();}).//Maps every element to make them Upper Case
	filter(item -> item.startsWith("P")).//Filters the elements based on the matching conditions 
	forEach(item -> {System.out.println(item);});
	
	System.out.println("Original List (After) : "+shoppingList);
	
	Stream<String> storedListStream = shoppingList.stream();
	List<String> modifiedList = storedListStream.sorted().distinct().map(item -> item.toUpperCase()).filter(item -> item.startsWith("P")).collect(Collectors.toList());
	
	System.out.println("Original List (Stored) : "+modifiedList);
	
	

    }

}
