package hackerRank;

public class CamelCase {
    //CALCULATE HOW MANY WORDS ARE IN THE CAMEL CASE STRING
    public static void main(String[] args){
        String testString = "iWillSmiteTheeWithFuriousAnger";
        System.out.println(camelcase(testString));
    }
    static int camelcase(String s) {
        int wordCount = 1;
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : s.toCharArray()){
            for (char b : caps.toCharArray()){
                if (c == b){
                    wordCount++;
                }
            }

        }
        // Complete this function
        return wordCount;
    }
}
