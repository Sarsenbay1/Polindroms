import java.util.ArrayList;
import java.util.List;

public class PolydromeFinder extends PeremutationWordFinder {
    public String[] findPolydrome(String _defaultText) {
        String[] words = this.textFormatting(_defaultText);

        // List<String> _polinomeList = new ArrayList<>();
        List<String> palindromeWords = new ArrayList<>();

        for (String word : words) {
            if (isPalindrome(word) && !palindromeWords.contains(word)) { // Проверка слова на палиндром
                palindromeWords.add(word);
            }
        }

        return palindromeWords.toArray(new String[palindromeWords.size()]);// Преобразование списка в массив и
                                                                           // возвращение его

    }

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString()); // Проверка на палиндром

    }
}