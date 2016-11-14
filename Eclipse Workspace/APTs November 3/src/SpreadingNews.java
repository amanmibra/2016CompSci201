import java.util.*;

public class SpreadingNews {
	public int minTime(int[] supervisors){
		return getTime(supervisors,0);
	}
	
	public ArrayList<Integer> getSubIndexes(int[] data, int me){
		ArrayList<Integer> ret = new ArrayList<>();
		for(int k=0; k < data.length; k++){
			if (data[k] == me){
				ret.add(k);
			}
		}
		return ret;
	}
	
	public int getTime(int[] supervisors, int boss) {

		ArrayList<Integer> subTimes = new ArrayList<Integer>();
		for(int i : getSubIndexes(supervisors, boss)){
			subTimes.add(getTime(supervisors, i));
		}
		Collections.sort(subTimes,Collections.reverseOrder());
		ArrayList<Integer> time = new ArrayList<Integer>();
		if(subTimes.size() == 0) return 0;
		
		for(int i = 0; i < subTimes.size(); i++){
			time.add(subTimes.get(i) + i + 1);
		}
		return Collections.max(time);
	}
	
	public static void main(String args[]){
		SpreadingNews x = new SpreadingNews();
		int[] superv = new int[]{-1, 0, 0, 2, 2};
		System.out.println(x.minTime(superv));
	}
	
}