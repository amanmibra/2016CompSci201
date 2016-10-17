import java.util.*;
public class Starter {
	public int begins(String[] words, String first) { 
         Set<String> wordSet = new HashSet<String>();
         
         for(String s : words){
        	 if(s.charAt(0) == first.charAt(0)){
        		 wordSet.add(s);
        	 }
         }
         return wordSet.size();
	}
	public static void main(String[] args){
		Starter x = new Starter();
		String[] words = {"easy", "lies", "the", "head", "that", "wears", "yellow"};
		String first = "e"; 
		System.out.println(x.begins(words, first));
	}
 }