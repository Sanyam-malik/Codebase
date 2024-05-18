package Contest.Code_Gladiators_2024;

import java.util.*;


/*
 * <metadata>
 * <name>Long Distance</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/LongDistance.png"></description>
 * <url>https://www.techgig.com/codegladiators</url>
 * <date>2024-05-02</date>
 * <level>Easy</level>
 * <notes>Self Explainary</notes>
 * </metadata>
 * */
public class LongDistance {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int numberOfTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Arrays to store inputs for all test cases
        int[] speed1Array = new int[numberOfTestCases];
        int[] distance1Array = new int[numberOfTestCases];
        int[] extraTime1Array = new int[numberOfTestCases];
        int[] speed2Array = new int[numberOfTestCases];
        int[] distance2Array = new int[numberOfTestCases];
        int[] extraTime2Array = new int[numberOfTestCases];

        // Read inputs for all test cases
        for (int i = 0; i < numberOfTestCases; i++) {
            distance1Array[i] = scanner.nextInt();
            speed1Array[i] = scanner.nextInt();
            extraTime1Array[i] = scanner.nextInt();
            distance2Array[i] = scanner.nextInt();
            speed2Array[i] = scanner.nextInt();
            extraTime2Array[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        }

        scanner.close();

        // Process inputs and compute results for all test cases
        for (int i = 0; i < numberOfTestCases; i++) {
            int speed1 = speed1Array[i];
            int distance1 = distance1Array[i];
            int extraTime1 = extraTime1Array[i];
            int speed2 = speed2Array[i];
            int distance2 = distance2Array[i];
            int extraTime2 = extraTime2Array[i];

            // Calculate time taken for each person
            int timeTaken1 = (distance1 / speed1) + extraTime1;
            int timeTaken2 = (distance2 / speed2) + extraTime2;

            // Compare the time taken by each person and print the result
            if (timeTaken1 < timeTaken2) {
                System.out.println("PAUL");
                System.out.println(timeTaken1);
            } else if (timeTaken2 < timeTaken1) {
                System.out.println("NINA");
                System.out.println(timeTaken2);
            } else {
                System.out.println("BOTH");
                System.out.println(timeTaken1);
            }
        }
    }
}
