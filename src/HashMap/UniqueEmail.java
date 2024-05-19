package HashMap;

import java.util.HashSet;
import java.util.Set;

/*
 * <metadata>
 * <name>Unique Email Addresses</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/UniqueEmailAddresses.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/unique-email-addresses/description/</url>
 * <date>2024-05-19</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Intuit</companies>
 * <notes>Using HashSet</notes>
 * </metadata>
 * */
public class UniqueEmail {

    // Time Complexity: O(n*m)
    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str: emails) {
            String[] strArray = str.split("@");
            String local = strArray[0].replace(".", "");
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            String domain = strArray[1];
            set.add(local+"@"+domain);
        }
        return set.size();
    }

    public static void main(String args[]) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
    }

}
