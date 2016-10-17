import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SimpleWordGame {
    public static void main(String[] args){
    	String[] player = new String[] { "orange", "orange" };
    	String[] dictionary = new String[] { "strawberry", "orange", "grapefruit", "watermelon" };
    	SimpleWordGame x = new SimpleWordGame();
    	System.out.println(x.points(player, dictionary));
    }
	public int points(String[] player, String[] dictionary) {
		int score = 0; //initiates the return value
		int calcScore = 0; //this creates the variable to calculate the score
    	Set<String> playerSet = getSet(player); //calls method in order to remove possible duplicate strings
    	Set<String> dicSet = getSet(dictionary); 
		for(String s : playerSet){ //enhanced for loop to check every string in the playerSet
			for(String d : dicSet){ //this for loop checks every string in the dicSet
				if (s.equals(d)){
					calcScore = (s.length() * s.length());
					score = calcScore + score; 
				}
			}
		}
    	return score;
      }
      public HashSet<String> getSet(String[] array){ 
    	  //This method turns the string[] player into a set in order to remove duplicates
    	  List<String> list = Arrays.asList(array);
    	  Set<String> playerSet = new HashSet<String>(list);
    	  return (HashSet<String>) playerSet;
    	  
      }
  }