import java.util.*;

public class SandwichBar
{
	public static void main(String[] args){
		SandwichBar x = new SandwichBar();
		String[] available = new String[]{ "cheese", "mustard", "lettuce"   };
		String[] orders = new String[]{"cheese ham", "cheese mustard lettuce", "ketchup", "beer" };
		System.out.println(x.whichOrder(available, orders));
	}
	public int whichOrder(String[] available, String[] orders){
		int order = -1;
		//turn the array parameters into ArrayLists
		List<String> avList = Arrays.asList(available); 
		List<String> orList = Arrays.asList(orders);
		
		for(int i = 0; i < orList.size(); i++){
			String orPos = orList.get(i); //gets the indivdual String of the ArrayList
			String[] orSep = orPos.split(" "); //splits the string between every space
			List<String> orSepList = Arrays.asList(orSep);
			if(avList.containsAll(orSepList)){
				order = i;
				break;
			}
		}
		return order;
      }
}