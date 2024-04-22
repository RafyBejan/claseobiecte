import java.util.HashSet;

public class Vocala {

    public static void main(String[] args) {
        System.out.println(containsAllVowels("hello World"));
        System.out.println(containsAllVowels("hd"));

    }

    public static boolean containsAllVowels(String str) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
   
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                return true; 
            }
        }

        return false; 
    }
}



