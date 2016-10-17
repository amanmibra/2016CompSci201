import java.util.*;

public class MaxDonor {
	public String generous(String[] orgs, int[] amount) {
		HashMap<String, Integer> donorMap = createMap(orgs, amount); //declare and initialize map through method
		StringBuilder ansBuilder = new StringBuilder();
		//below will find key in map with greatest value
		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : donorMap.entrySet())
		{
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			{
				maxEntry = entry;
			}
		}
		ansBuilder.append(maxEntry.getKey() + ":$" + maxEntry.getValue());
		String ans = ansBuilder.toString();
		return ans;
		
	}
	public static HashMap<String, Integer> createMap(String[] orgs, int[] amount){
		HashMap<String, Integer> donorMap = new HashMap<>(); 
		for(int i = 0; i < orgs.length; i++){
			int val = amount[i];
			if(donorMap.containsKey(orgs[i]) == false){
				donorMap.put(orgs[i], val);
			}
			else{
				donorMap.put(orgs[i], donorMap.get(orgs[i]) + val);
			}
		}
		return donorMap;
	}
	public static void main(String[] args){
		MaxDonor x = new MaxDonor();
		String[] orgs = {"red cross", "girl scouts", "red cross", "girl scouts", "moma", "unicef"};
		int[] amount = {10,20,50,29,49,51};
		System.out.println(x.generous(orgs, amount));
	}
}