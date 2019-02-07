package adapter;

import java.util.Collections;
import java.util.List;

//Adaptee Class
public class ListSorter {
	  	   
	   public List<String> sort(List<String> strList)
	   {
	      //sort and return
		   Collections.sort(strList);
		   return strList;
	   }
}
