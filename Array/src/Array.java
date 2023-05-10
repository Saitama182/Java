/* Создать массив чисел, и проинициализировать его значениями от 100 до 1000
Создать второй массив по длине равный первому(использовать свойство length). Проинициализировать его значениями, взятыми
из первого массива , но в обратном порядке.
В цикле for each вывести все элементы второго массива.*/

public class Array {
    public static void main(String[] args) {
        int [] arr1 = new int[901];
        for (int i=0; i< arr1.length; i++) {
            arr1[i] = 100+i;
        }
        int [] arr2 = new int[arr1.length];
        for (int i =0, j = arr1.length-1; i< arr1.length; i++, j--){
            arr2[j] = arr1[i];
        }
        for( int i : arr2) {
            System.out.println(i);
        }

    }
}