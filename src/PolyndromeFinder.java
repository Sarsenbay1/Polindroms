import java.util.ArrayList;
// import java.util.List;

public class PolyndromeFinder extends PeremutationWordFinder {
    public String[] findPolydrome(String _defaultText) {
        String[] _words = this.textFormatting(_defaultText);

        ArrayList<String> _palindromeWords = new ArrayList<String>();

        for (String _word : _words) {
            if (isPalindrome(_word) && !_palindromeWords.contains(_word)) { // Проверка слова на палиндром
                _palindromeWords.add(_word);
            }
        }
        return _palindromeWords.toArray(new String[_palindromeWords.size()]);// Преобразование списка в массив и
                                                                             // возвращение его

    }

    private static boolean isPalindrome(String _word) {
        return _word.equals(new StringBuilder(_word).reverse().toString()); // Проверка на палиндром

    }
}