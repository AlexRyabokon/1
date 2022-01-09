//Создайте массив из восьми случайных чисел отрезка (1/10). Выведите массив на экран в строку. замените элемент с начетным индексом
// на ноль. Снова выведите массив на экран на отдельной строке.

package javalearn;

public class Task7 {
    public static void main(String[]args){int[] array = new int[8];


        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*9+1);
            System.out.print(array[i] + "  ");
        }
        System.out.println(" \n");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                array[i] = 0;
            }

            System.out.print(array[i] + "  ");
    }

}
}
