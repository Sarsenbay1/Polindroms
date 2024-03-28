import java.util.Arrays;
import java.util.HashMap;

public class PeremutationWordFinder implements IWordFinder {
    @Override
    public HashMap<String, String> searchPermutedWords(String _text) {
        // Разбиваем входную строку на слова и сохраняем их в массив _words
        String[] _words = this.textFormatting(_text);
        // Создать Map для хранения найденных пар
        HashMap<String, String> _permutations = new HashMap<String, String>();

        // Поиск перестановок слов
        for (Integer i = 0; i < _words.length; i++) {
            for (Integer j = i + 1; j < _words.length; j++) {
                if (i != j) {
                    char[] _word1 = _words[i].toCharArray();
                    char[] _word2 = _words[j].toCharArray();

                    Arrays.sort(_word1);
                    Arrays.sort(_word2);
                    // Map, то добавляем пару в Map
                    // System.out.println(_word1 + " " + _word2);
                    if (Arrays.equals(_word1, _word2) && !_permutations.containsKey(_words[i])
                            && !_permutations.containsValue(_words[i]) && !_words[i].equals(_words[j])) {
                        _permutations.put(_words[i], _words[j]);
                        // System.out.println(_words[i] + "----" + _words[j]);
                    }

                }

            }
        }
        return _permutations;
    }

    protected String[] textFormatting(String _text) {
        _text = _text.toLowerCase();
        String[] _words = _text.replaceAll("[.,!:;%&?#$]", "").split(" ");//
        // System.out.println("");
        return _words;
    }
}