
   public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
    	  String best = "";
    	  int mostOccurences = -1;
    	  for(String strand : strands){
    		  int occurences = CountLetters(strand, nuc.charAt(0));
    		  if(occurences > mostOccurences){
    			  best = strand;
    			  mostOccurences = occurences; 
    		  }
    		  else if(occurences == mostOccurences){
    			  if(best.length() < strand.length()){
    				  best = strand;
    				  mostOccurences = occurences; 
    			  }
    		  }
    	  }
    	  if(mostOccurences == 0){
    		  return "";
    	  }
    	  else{
    		  return best; 
    	  }
      }
      public static int CountLetters(String letters, char c){
    	  int counter = 0;
    	  for(int i = 0; i < letters.length(); i++){
    		  if(letters.charAt(i) == c){
    			  counter ++;
    		  }
    	  }
    	  return counter;
      }
   }
