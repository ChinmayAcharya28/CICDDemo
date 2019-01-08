package com.raweng.hawks.cicdapplication;

public class TestActivity {

    public int addition(int first, int second){

        return (first + second);
    }

    public int multi(int first, int second){

        return (first * second);
    }

    public String minus(int first, int second){

        if(first > second){
            return "First Minus Me";
        }else if(second > first){
            return "Second Minus Me";
        }else{
            return "Equal";
        }
    }

    public int divide(int first, int second){

        return (first/second);
    }
}
