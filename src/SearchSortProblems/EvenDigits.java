public class EvenDigits {

    public static void main(String[] args){
        int[] array = new int[]{18, 1, -7, 3, 143, 2890};
        System.out.println(count(array));
    }

    public static int count(int[] array){
        int count = 0;
        for(int i=0; i<array.length; i++) {
            int digits = (int)Math.log10(array[i])+1;
            if(digits%2 ==0) {
                count++;
            }
        }
        return count;
    }
}
