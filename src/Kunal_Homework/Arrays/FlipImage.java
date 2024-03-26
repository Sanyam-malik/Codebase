package Kunal_Homework.Arrays;


/*
 * <metadata>
 *   Name:- Flipping an Image,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Flip_Image.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/flipping-an-image/,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Companies: Google,
 *   Notes:- Use Two Pointers to flip the image,
 * </metadata>
 * */
public class FlipImage {

    public int[][] flipAndInvertImage(int[][] image) {
        // Mirror Flip
        for(int r=0; r < image.length; r++) {
            int cs = 0;
            int ce = image[r].length - 1;
            while(cs < ce) {
                int temp = image[r][cs];
                image[r][cs] = image[r][ce];
                image[r][ce] = temp;
                cs++;ce--;
            }
        }

        // Inverse
        for(int r=0; r < image.length; r++) {
            for(int c=0; c < image[r].length; c++) {
                image[r][c] = image[r][c] == 1 ? 0 : 1;
            }
        }

        return image;
    }
}
