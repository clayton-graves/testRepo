package hackerRank;

public class StairCase {
    /*
   GIVEN A SPECIFIC INTEGER, CREATE A STAIRCASE.
   EX: 4 =
      #
     ##
    ###
   ####

    */
    public static void main(String[] args){
        staircase(10);
    }
    static void staircase(int n) {
        for (int i = 1; i <= n; i++){
            String spaces = "";
            String hashes = "";
            int spaceNum = n - i;
            int hashNum = i;
            for (int x = 0; x < spaceNum; x++ ){
                spaces += " ";
            }
            for (int y = 0; y < i; y++){
                hashes +="#";
            }
            System.out.println(spaces + hashes);
        }
    }
}
