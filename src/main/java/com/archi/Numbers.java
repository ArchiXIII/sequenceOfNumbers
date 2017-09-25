package com.archi;

/**
 * Created by Черный on 25.09.2017.
 */
public class Numbers {
    public static void main(String[] args) {
        odd();
//        even();
    }

    public static void odd(){
        for(int i = 241; i <= 1111; i+=2){
            System.out.print(i + ", ");
        }
    }

    public static void even(){
        for(int i = 1112; i >= 242; i-=2){
            System.out.print(i + ", ");
        }
    }
}
