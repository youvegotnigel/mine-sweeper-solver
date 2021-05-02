package com.mind.sweeper;

public class Test {

    public static void main(String[] args){

        String value = "1_1";
        String[] splitString = value.split("_");

        //System.out.println(splitString[0]);
        //System.out.println(splitString[1]);

        //convert to int
        int x = Integer.parseInt(splitString[0]);
        int y = Integer.parseInt(splitString[1]);

        System.out.println(x +"_"+ y);

        String N = ((x-1) +"_"+ (y));
        String S = ((x+1) +"_"+ (y));
        String W = ((x) +"_"+ (y-1));
        String E = ((x) +"_"+ (y+1));

        String NW = ((x-1) +"_"+ (y-1));
        String NE = ((x-1) +"_"+ (y+1));
        String SW = ((x+1) +"_"+ (y-1));
        String SE = ((x+1) +"_"+ (y+1));

        System.out.println(N);
        System.out.println(S);
        System.out.println(W);
        System.out.println(E);

        System.out.println(NW);
        System.out.println(NE);
        System.out.println(SW);
        System.out.println(SE);

    }

    public int get_plus_one_coordinate(int n){
        int x = n+1;
        if(x>=10)
            return -1;
        else
            return x;
    }

    public int get_minus_one_coordinate(int n){
        int x = n-1;
        if(x<=0)
            return -1;
        else
            return x;
    }
}
