public class Main {

    public static void main(String[] args) {
    System.out.println(ispalindrome("aba"));

    }


    static boolean ispalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;
    }

}
