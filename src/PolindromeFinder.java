import java.util.ArrayList;

public class PolindromeFinder extends PeremutationWordFinder {
    public String[] findPolydrome(String _defaultText) {
        String[] _words = textFormatting(_defaultText);

        ArrayList<String> _polyndromeWords = new ArrayList<String>();

        for (String _word : _words) {
            if (isPolyndrome(_word) && !_polyndromeWords.contains(_word)) { // Проверка слова на пoлиндром
                _polyndromeWords.add(_word);
            }
        }
        return _polyndromeWords.toArray(new String[_polyndromeWords.size()]);// Преобразование списка в массив и
                                                                             // возвращение его

    }

    private boolean isPolyndrome(String _word) {
        return _word.equals(new StringBuilder(_word).reverse().toString()); // Проверка на полиндром

    }
}