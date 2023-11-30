package Problem_Of_The_Day;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/ninja-and-the-storyteller_1264947
 * </metadata>
 * */
public class NinjaStoryteller {

    public static int countStories(int x, int y, int z) {
        int paidStories = z/y;
        int storyCount = paidStories;
        int freeStories = 0;

        while(storyCount>=x) {
            int freeStoryNow = storyCount/x;
            int freeStoryleft = storyCount%x;
            freeStories+=freeStoryNow;
            storyCount = freeStoryleft + freeStoryNow;
        }
        return paidStories+freeStories;
    }

    public static void main(String[] a) {
        System.out.println(countStories(2, 1, 4));
    }
}
