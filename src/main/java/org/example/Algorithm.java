package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Input 5 integers:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }
        int sumArray = 0, max = list.get(1), min = list.get(1);
        for (int element : list) {
            sumArray += element;
        }
        //Get min/max value
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        System.out.printf("%d  %d",sumArray-max,sumArray-min);
    }
}