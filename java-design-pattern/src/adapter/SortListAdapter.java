package adapter;

import java.util.Arrays;
import java.util.List;

//Concrete implementation of Target interface
public class SortListAdapter implements Sorter{

	   public String[] sort(String[] str)
	   {
	      //convert the array to a List
		   List<String> stringList =Arrays.asList(str);
	      
	      //call the adapter 
	      ListSorter sorter = new ListSorter();
	      List<String> sortedList = sorter.sort(stringList);

	      //convert the list back to an array and return 
	      String[] list = new String[sortedList.size()];
	      return sortedList.toArray(list);
	      
	   }

}
