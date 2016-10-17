import java.util.*;

public class HashTaggery {
	public String maxTag(String[] tags, String[] messages) {
		double counter = 0; 
		double min_count = messages.length * 0.75;

		for(String s : messages){
			String[] tempArry = s.split(" ");
			for(String str : tempArry){
				if(Arrays.asList(tags).contains(str) == true){
					counter++;
					break; 
				}
			}
		}
		
		if(counter >= min_count){
			return "tagged";
		}
		else{
			return "missed";
		}
	}
	public static void main(String[] args){
		HashTaggery x = new HashTaggery();
		String[] tags = {"#duke", "#compsci", "#fun", "hashtag", "#hash", "#tag"};
		String[] messages = {"We are @duke and #duke #compsci is #hashtag fun!",
	            "We are #duke. We have all the #fun. We #hash and call #hashCode.",
	            "#hash #tag and hashcodes are part of #compsci",
	            "duke compsci fun is predicated on hashtaggery and #tags",
	            "learning about hashing is lots of fun, tags are great"};
		System.out.println(x.maxTag(tags, messages));
	}
}