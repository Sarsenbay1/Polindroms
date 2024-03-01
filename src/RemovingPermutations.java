
import java.util.Map;

public class RemovingPermutations extends PolydromeFinder {
    public String removingPermutedWords(String _defaultText) {
        Map<String, String> _permutedWords = this.searchPermutedWords(_defaultText);// Map слов перестановок

        StringBuilder result = new StringBuilder();
        String[] words = _defaultText.split("\\s+");
        for (String word : words) {
            String originalWord = word.replaceAll("[^a-zA-Z]", ""); // Убираем знаки пунктуации из слова
            if (!_permutedWords.containsKey(
                    originalWord.toLowerCase()) && !_permutedWords.containsValue(originalWord.toLowerCase())) {
                result.append(word).append(" "); // Добавляем слово к результату, если его нет в словаре
            }
        }
        return result.toString().trim();

    }
}
