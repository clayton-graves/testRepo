package hackerRank;
/*
COMPARE THE TWO TRIPLETS SENT IN INDIVIDUAL INTS, IF A0 > B0 THEN A GETS A POINT, IF B0 > A0 THEN B GETS A POINT, IF THEY ARE EQUAL THEN NO POINTS ARE BESTOWED.
RETURNS AN ARRAY WITH THE A POINTS PRECEDING THE B POINTS.
 */

public class CompareTriplets {
    public static void main(String[] args){
        test();
    }
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */
        int a = 0;
        int b = 0;
        if (a0 > b0){
            a += 1;
        }
        if (a0 < b0){
            b +=1;
        }
        if (a1 > b1){
            a+=1;
        }
        if (a1 < b1){
            b+=1;
        }
        if (a2 > b2){
            a+=1;
        }
        if (a2 < b2){
            b+=1;
        }
        int result[] = {a, b};
        return result;
    }

    public static int[] solveImprov(int a0, int a1, int a2, int b0, int b1, int b2){

        int pointsAlice = ((a0 > b0)? 1:0) + ((a1 > b1)? 1:0) + ((a2 > b2)? 1:0);
        int pointsBob = ((a0 < b0)? 1:0) + ((a1 < b1)? 1:0) + ((a2 < b2)? 1:0);
        int result[] = {pointsAlice, pointsBob};
        return result;

    }

    public static int[] test(){

        int[] solved = solve(1,2,3,4,5,6);
        System.out.println(solved[0]);
        System.out.println(solved[1]);
        int[] improvSolve = solveImprov(1,2,3,4,5,6);
        System.out.println(improvSolve[0]);
        System.out.println(improvSolve[1]);
        return solved;
    }
}
