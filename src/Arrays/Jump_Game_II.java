package Arrays;



/*
 * <metadata>
 * <name>Jump Game II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Jump_Game_II.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/jump-game-ii/description/</url>
 * <date>2024-03-29</date>
 * <level>Medium</level>
 * <companies>Amazon:Apple:Bloomberg:Google:DoorDash:Tiktok:Microsoft:Adobe:Tesla:payu</companies>
 * <notes>Using Greedy Algorith <br /> <iframe width="560" height="315" src="https://www.youtube.com/embed/9kyHYVxL4fw?si=QNYmQRkFPDWcbpVX" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>Solve Using Greedy</remarks>
 * </metadata>
 * */
public class Jump_Game_II {

    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int current = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == current) {
                jumps++;
                current = farthest;
            }
        }
        return jumps;
    }
}
