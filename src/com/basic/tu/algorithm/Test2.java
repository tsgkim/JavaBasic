package com.basic.tu.algorithm;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long emptyNumber = scanner.nextLong();

            long countNumber = 0L;
            while (emptyNumber > 2L) {

                long useNumber = emptyNumber / 3;

                countNumber = countNumber + useNumber;

                emptyNumber = emptyNumber - useNumber * 2;

                if (emptyNumber == 2L) {
                    countNumber = countNumber + 1;
                    break;
                }

            }

            System.out.println(countNumber);

        }
    }

}
