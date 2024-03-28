import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer _numberMethod = 0;
        String _text = "";
        Scanner _inputConsole = new Scanner(System.in);

        do {
            System.out.println("Please select what to do\n1)removing permutation words\n2)Find polindrome");
            _numberMethod = _inputConsole.nextInt();
            _inputConsole.nextLine();

        } while (_numberMethod < 1 || _numberMethod > 2);

        System.out.println("Input your text: ");
        _text = _inputConsole.nextLine();

        switch (_numberMethod) {
            case 1: {
                RemovingPermutations _removingPermutations = new RemovingPermutations();
                System.out.println(_removingPermutations.removingPermutedWords(_text));
                break;
            }

            case 2: {
                PolindromeFinder _polydromeFinder = new PolindromeFinder();
                String[] _polindroms = _polydromeFinder.findPolydrome(_text);
                System.out.println("Polindroms:");
                for (String _polindrom : _polindroms) {
                    System.out.printf(_polindrom + "\n");
                }
                break;
            }

        }
        _inputConsole.close();

    }
}
