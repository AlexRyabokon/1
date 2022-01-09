package javalearn;

public class Task6 {
    public static void main(String[] args) {
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
