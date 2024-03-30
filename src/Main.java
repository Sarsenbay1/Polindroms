import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer _numberClass = 0;

        Integer _numberMethod = 0;
        String _text = "";
        Scanner _inputConsole = new Scanner(System.in);

        do {
            System.out.println("Please select what to do\n1)Слова перестановки\n2)Полиндромы");
            try {
                _numberClass = Integer.parseInt(_inputConsole.nextLine());
            } catch (Exception e) {
                System.out.println("Incorrect number input, try again");
            }

        } while (_numberClass < 1 || _numberClass > 2);

        System.out.println("Input your text: ");
        _text = _inputConsole.nextLine();

        switch (_numberClass) {
            case 1: {
                do {
                    System.out.println("1)Найти слова перестановки\n2)Удалить слова перестановки");
                    try {
                        _numberMethod = Integer.parseInt(_inputConsole.nextLine());
                    } catch (Exception e) {
                        System.out.println("Incorrect number input, try again");
                    }
                    switch (_numberMethod) {
                        case 1: {
                            PeremutationWordFinder _permutationWords = new PeremutationWordFinder();
                            System.out.println("Слова перестановки:");
                            System.out.println(_permutationWords.permutedWords(_text));

                            break;
                        }

                        case 2: {
                            PeremutationWordFinder _removingPermutations = new RemovingPermutations();
                            System.out.println("Новое предложение:");

                            System.out.println(_removingPermutations.permutedWords(_text));
                            break;
                        }

                    }

                } while (_numberMethod < 1 || _numberMethod > 2);

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
