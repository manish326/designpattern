package adapter;

public class TestAdapter {

	public static void main(String[] arg){
		
		String[] stringArray = {"Manish","Amit","Mitesh","Anjali"};
		for(String s: stringArray){
			System.out.println(s);
		}
		
		SortListAdapter adapter = new SortListAdapter();
		adapter.sort(stringArray);
		
		for(String s: stringArray){
			System.out.println(s);
		}
	}
	
}
