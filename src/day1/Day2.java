package day1;

public class Day2 {

    public static void main(String[] args){

        int[][] input={
                {7,6,4,2,1},
                {1,2,7,8,9},
                {9,7,6,2,1},
                {1,3,2,4,5},
                {8,6,4,4,1},
                {1,3,6,7,9}
        };

        for(int[] report : input){
            if(isSafe(report)){
                System.out.println("safe");
            }else {
                System.out.println("not safe");
            }
        }



    }


    private static boolean isSafe(int[] args){
        if(args.length <2){
            return true;
        }

        boolean isIncreased = args[1]>args[0];
        boolean isDecreased = args[1]<args[0];

        for(int i =1; i< args.length; i++){
            int diff = args[i] - args[i-1];

            if(Math.abs(diff) <1 || Math.abs(diff) > 3){
                return false;
            }

            if(diff> 0 && isDecreased) return false;
            if(diff< 0 && isIncreased) return false;
        }

        return true;

    }
}
