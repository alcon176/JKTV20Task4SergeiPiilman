/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task4sergeipiilman;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task4SergeiPiilman {

 public static void main(String[] args) {
        //создаем массив
        Random random = new Random();
        int sum = 0;
        int[] massiv = new int[100];
        for(int i = 0; i < massiv.length; i++){
            massiv[i] = random.nextInt(100);
        }
        //сортируем массив
        boolean isSorted = false;
        int buf;
        while (!isSorted) {            
            isSorted = true;
            for (int i = 0; i < massiv.length-1; i++) {
                if(massiv[i] > massiv[i+1]){
                    isSorted = false;
                    buf = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = buf;
                }
            }
        }
        int count = 0;
        System.out.println("Massiv = "+Arrays.toString(massiv));
        for(int i = 0; i < massiv.length; i++){
            System.out.printf("%4d",massiv[i]);
            count++;
            if(count == 10){
                System.out.println();
                count=0;
            }
        }
        //находим среднее арифметическое
        for (int i = 0; i < massiv.length; i++) {
            sum = sum + massiv[i];
        }
        System.out.println("Среднее арифметическое: " + sum / 100);
    }
    
    
}   
