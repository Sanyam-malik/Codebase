package Strings;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/encode-the-message_699836
 * </metadata>
 * */
public class EncodeString {
    public static String encode(String message) {
        StringBuilder sb = new StringBuilder();
        char prevChar = ' ';
        int count = 0;
        for(char ch: message.toCharArray()) {
            if(prevChar != ch && prevChar != ' ') {
                sb.append(prevChar);
                sb.append(count);
                count=0;
            }
            count++;
            prevChar = ch;
        }

        sb.append(prevChar);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] a) {
        System.out.println(encode("aabbc"));
    }
}
