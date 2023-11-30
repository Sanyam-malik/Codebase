public class SearchInStrings {
    
    public static void main(String[] args){
        char ch = 'n';
        String s = "Kunal";
        System.out.println("Is '"+ch+"' present in "+s+" : "+search(s, ch));
    }
    
    public static boolean search(String s, char ch) {
        for(char chr: s.toCharArray()) {
            if(ch == chr) {
                return  true;
            }
        }
        return false;
    }
}
