package Task3;
// Необходимо реализовать приложение на вход которого поступает текст,
// а на выходе выводится частотный словарь букв латинского(английского) алфавита.


public class Task2 {
    public static void main(String[] args) {
        String s = "Example text to char";
        char[] charArr = new char[s.length()];
        int[] freqArr = new int[s.length()]; // заменить на коллекцию HashSet
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isFound = false;
            for (idx = 0; idx < s.length(); idx++) {
                if (freqArr[idx] == 0) {
                    break;
                }
                if (c == charArr[idx]) {
                    freqArr[idx]++;
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                charArr[idx] = c;
                freqArr[idx]++;
            }
        }

        //Вывод частоту букв

        for (int i = 0; i < s.length(); i++) {
            if (freqArr[i] != 0) {
                System.out.printf("%s:%d", charArr[i], freqArr[i]);
                System.out.println();
            }
        }
    }
}
