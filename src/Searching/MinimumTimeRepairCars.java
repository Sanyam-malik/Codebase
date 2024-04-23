package Searching;

/*
 * <metadata>
 * <name>Minimum Time to Repair Cars</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumTimeCarRepairs.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://learnyard.com</url>
 * <date>2024-04-19</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/YIo2U8ceHmY?si=1IST59wWBn3NF-Zo" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>LearnYard Problem:Good Question</remarks>
 * <companies>Meta:Apple</companies>
 * </metadata>
 * */
public class MinimumTimeRepairCars {

    public long repairCars(int[] ranks, int cars) {
        long ans = (long) 1e14;
        long start = 1;
        long end = (long) 1e14;
        while(start < end){
            long mid = start + (end - start)/2;
            long compute = canRepare(ranks, mid);
            if(compute >= cars){
                ans = mid;
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public long canRepare(int[] ranks, long time){
        long totalCar = 0;
        for(int i = 0; i < ranks.length; i++){
            totalCar += (long)Math.sqrt(time/ranks[i]);
        }
        return totalCar;
    }
}
