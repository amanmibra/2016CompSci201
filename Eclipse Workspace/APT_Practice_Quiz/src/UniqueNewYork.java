import java.util.*;

public class UniqueNewYork {
	public int seen(String[] records) {
		int size = 0;
		Set<String> hashRecords = new HashSet<String>();
		for(String s : records){
			for(String ss : s.split(",")){
				hashRecords.add(ss);
			}
		}
		size = hashRecords.size();
		return size; //replace with your code
    }
	public static void main(String[] args){
		UniqueNewYork x = new UniqueNewYork();
		String[] records = {"Mississippi,Mississippi Mississippi","Mississippi Mississippi Mississippi"};
		System.out.println(x.seen(records));
	}
}