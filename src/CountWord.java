
import java.util.TreeMap;

public class CountWord {

	public static void main(String[] args) {
		String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        TreeMap<String, Integer> wordCount = countWords(words);
        System.out.println(wordCount);

	}
	  public static TreeMap<String, Integer> countWords(String[] words) {
		  TreeMap<String, Integer> wordCountMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);


	       
	        for (String word : words) {
	            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
	        }
	        TreeMap<String, Integer> wordCount = new TreeMap<>(wordMap);

	        return wordCount;
	    }
	

}
