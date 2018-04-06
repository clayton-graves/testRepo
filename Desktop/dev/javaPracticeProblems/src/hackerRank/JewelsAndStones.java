package hackerRank;

public class JewelsAndStones {
    public static void main(String[] args){
        tester();
    }
    public static int numJewelsInStones(String J, String S){
        int count = 0;
        for(char j :J.toCharArray()){
            for(char s :S.toCharArray()){
                if(j == s){
                    count++;
                }
            }
        }
        return count;
    }
    public static void tester(){
        String s1 = "aaAdXfVgggg";
        String s2 = "AAAaDDDxFFFfG";
        int result = numJewelsInStones(s1, s2);
        System.out.print(result);

    }
}
