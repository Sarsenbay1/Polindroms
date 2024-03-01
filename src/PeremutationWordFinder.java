import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PeremutationWordFinder implements IWordFinder {
    @Override
    public Map<String, String> searchPermutedWords(String _text) {
        // Разбиваем входную строку на слова и сохраняем их в массив _words
        String[] _words = this.textFormatting(_text);
        // Создать Map для хранения найденных пар
        Map<String, String> permutations = new HashMap<>();

        // Поиск перестановок слов
        for (int i = 0; i < _words.length; i++) {
            for (int j = 0; j < _words.length; j++) {
                if (i != j) {
                    // Преобразуем слова в массивы символов и сортируем их
                    char[] word1 = _words[i].toCharArray();
                    char[] word2 = _words[j].toCharArray();
                    Arrays.sort(word1);
                    Arrays.sort(word2);
                    // Если отсортированные массивы символов равны и первое слово не содержится в
                    // Map, то добавляем пару в Map
                    if (Arrays.equals(word1, word2) && !permutations.containsKey(_words[i])
                            && !permutations.containsValue(_words[i])) {
                        permutations.put(_words[i], _words[j]);
                    }
                }
            }
        }
        return permutations;
    }

    protected String[] textFormatting(String _text) {
        _text = _text.toLowerCase();
        String[] _words = _text.replaceAll("[\\p{Punct}]", "").split(" ");
        return _words;
    }
}