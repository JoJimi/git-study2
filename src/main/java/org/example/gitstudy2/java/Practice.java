package org.example.gitstudy2.java;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 100;

        while(true){
            if(num <= 5){
                System.out.println("실행 종료");
                break;
            }

            num = random.nextInt(100) + 1;
            System.out.println("숫자 = " + num);
        }
    }
}
