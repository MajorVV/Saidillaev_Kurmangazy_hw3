package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] tag = {45.5, -86.2, -88.3, -32.4, -48.8, -55.1, -66.7, -84.5, -23.6, -74.4, -36.2, -22.3, -73.1, 21.7, 22.8};

        double sum = 0;

        int kol = 0;

        boolean otr = false;

        for (double hat : tag) {

            if (hat < 0) {

                otr = true;

            } else {

                if (otr) {

                    kol++;

                    sum += hat;

                }




            }

        }

        System.out.println("Среднее арифметическое=\t"+ sum / kol);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < tag.length-1; i++) {
                if(tag[i] > tag[i+1]){
                    isSorted = false;

                    buf = (int) tag[i];
                    tag[i] = tag[i+1];
                    tag[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(tag));
    }

    }

