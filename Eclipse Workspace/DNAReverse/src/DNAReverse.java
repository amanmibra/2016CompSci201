
   public class DNAReverse {
      public String reverse(String dna) {
    	  String r = "";
    	  for(int y = 0; y < dna.length(); y++){
    		  char c = dna.charAt(y);
    		  r = c + r;
    	  }
    	  return r;
      }
   }