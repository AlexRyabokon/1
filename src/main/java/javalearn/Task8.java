// Cоздайте массив из 4х случайных чисел отрезка (10/99). Выведите его на экран в строку.
// Далее определите и выведите на экран сообщение о том,
// является ли массив строго возрастающей последовательностью

package javalearn;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [] array1 = new int[4];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 90) + 10;
        }


        for (int i = 1; i < array1.length; i++){
            if(array1[i]<=array1[i-1]){
                System.out.println("Массив не является строго возрастающей последовательностью");
            } else if(array1[i] >= array1[i - 1]){
                System.out.println("Массив является строго возрастающей последовательностью");
            }
        }

        System.out.println(Arrays.toString(array1));


    }
}
