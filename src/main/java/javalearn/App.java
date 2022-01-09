package javalearn;


import java.util.ArrayList;
import java.util.Arrays;



public class App {


    public static void main(String[] args) {
     /*   double[] doubleArr = {5.2, 2.3, 4.4, 2.0, 12354.4};

        int[] intArr;

        int[] intArr1;
        intArr1 = new int[10];
        intArr1[0] = 4455;
        intArr1[1] = 55;
        intArr1[2] = 745;
        intArr1[3] = 48;
        intArr1[4] = 525;
        intArr1[5] = 332;
        intArr1[6] = 345;
        intArr1[7] = 32;
        intArr1[8] = 457;
        intArr1[9] = 889;





        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println("Массив даблов -- " + doubleArr[i]);
        }

        System.out.println("\n");

      //   5. Создайте пустой массив (intArr1). Заполните значения элементов. Расширьте массив на 5 элементов (сделал с помощью import java.util.ArrayList и import java.util.Arrays  -- https://ru.education-wiki.com/6872022-array-methods-in-java).
        System.out.println("Массив интов -- " + Arrays.toString(Arrays.copyOf(intArr1, 15)));

*/


 /*   double randomNum = Math.random()*(15 - -15 +1) + -15;
    double[] arrRandom = new double[12];


        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = (Math.random()*(15 - -15 +1) + -15);
            System.out.println("Массив даблов:" + arrRandom[i]);

            if (arrRandom[i]) {
                System.out.println("  ff ="+arrRandom[i]);
            }
        }*/

// 6. Создайте массив из 12 случайных чисел из отрезка (-15/15).
// Определите макс. элемент массива и сообщите индекс его вхождения в массив
            double [] mas = new double[12];
            double maxNumber = -16.9999999999;
            int maxIndex = 0;

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (double)(Math.random()*31.0)-15.0;
                System.out.println(mas[i]);
                if(maxNumber <= mas[i]){
                    maxNumber = mas[i];
                    maxIndex = i;
                }
            }

            System.out.println("Индекс максимального элемента: " + maxIndex);






}
}
