
import java.util.HashMap;

public class RemovingPermutations extends PolindromeFinder {
    public String removingPermutedWords(String _defaultText) {
        HashMap<String, String> _permutedWords = this.searchPermutedWords(_defaultText);// Map слов перестановок

        String result = "";
        String[] words = _defaultText.split(" ");
        for (String word : words) {
            String originalWord = word.replaceAll("[.,!:;%&?#%$]", ""); // Убираем знаки пунктуации из слова
            if (!_permutedWords.containsKey(
                    originalWord.toLowerCase()) && !_permutedWords.containsValue(originalWord.toLowerCase())) {
                result = result + word + " "; // Добавляем слово к результату, если его нет в словаре
            }
        }
        return result.toString().trim();

    }
}
