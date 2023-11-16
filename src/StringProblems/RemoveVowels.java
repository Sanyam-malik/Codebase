package StringProblems;

public class RemoveVowels {
    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') continue;
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] a) {
        System.out.println(removeVowels("Mobile"));
    }
}
