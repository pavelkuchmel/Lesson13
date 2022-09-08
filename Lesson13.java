package classwork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson13 {

    public static void main(String[] args) {
        /*
-------Lesson 13 - 08.09.2022------------------------------------------------------------------------------------
         */
        //Matrix1. Даны целые положительные числа M и N.
        //Сформировать целочисленную матрицу размера M × N, у которой все элементы I-й строки имеют
        //значение 10·I (I = 1, . . ., M).
        //-----------------------------------------------------------------------------------
        //Matrix2. Даны целые положительные числа M и N.
        //Сформировать целочисленную матрицу размера M × N, у которой все элементы J-го столбца
        //имеют значение 5·J (J = 1, . . ., N).
        //-----------------------------------------------------------------------------------
        //Matrix3. Даны целые положительные числа M, N и набор из M чисел.
        //Сформировать матрицу размера M × N, у которой в каждом столбце содержатся
        //все числа из исходного набора (в том же порядке).
        //-----------------------------------------------------------------------------------
        //Matrix7. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Вывести
        //элементы K-й строки данной матрицы.
        //-----------------------------------------------------------------------------------
        //Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные
        //в строках с четными номерами (2, 4, . . .). Вывод элементов производить
        //по строкам, условный оператор не использовать.
        //-----------------------------------------------------------------------------------
        //Matrix10. Дана матрица размера M × N. Вывести ее элементы, расположенные
        //в столбцах с нечетными номерами (1, 3, . . .).
        //Вывод элементов производить по столбцам, условный оператор не использовать.
        //-----------------------------------------------------------------------------------
        //Matrix11. Дана матрица размера M × N. Вывести ее элементы в следующем
        //порядке: первая строка слева направо, вторая строка справа налево, третья
        //строка слева направо, четвертая строка справа налево и т. д.


        int[][] array = new int[4][5];
        fillArray(array, 1, 9);
        showArray(array);
        System.out.println();
        matrixSeventeen(array);

    }
    static void fillArray (int[][] arrayName, int left, int right){
        Random rdm = new Random();
        for (int i = 0; i < arrayName.length/*количество строк*/; i++){
            for (int j = 0; j < arrayName[i].length/*количество элеметнов в строке, строка имеет тип оденомерного массива*/; j++){
                arrayName[i][j] = rdm.nextInt(right-left+1)+left;
            }
        }
    }
    static void showArray (int[][] arrayName){
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixOne (int[][] arrayName){
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                arrayName[i][j]=i*10;
            }
        }
    }
    static void matrixTwo (int[][] arrayName){
        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                arrayName[i][j]=j*5;
            }
        }
    }
    static void matrixThree (int[][] arrayName){
        Random rdm = new Random();
        int m = 10;
        int[] arrayM = new int[m];
        for (int i = 0; i < arrayM.length; i++){
            arrayM[i] = rdm.nextInt(10);
        }

        for (int i = 0; i < arrayName.length; i++){
            for (int j = 0; j < arrayName[i].length; j++){
                arrayName[i][j]=i*10;
            }
        }
    }
    static void matrixNine (int[][] arrayName){
        for (int i = 0; i < arrayName.length;i+=2){
            for (int j = 0; j < arrayName[i].length; j++){
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixTen (int[][] arrayName){
        for (int i = 0; i < arrayName.length;i++){
            for (int j = 1; j < arrayName[i].length; j+=2){
                System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixEleven (int[][] arrayName){
        for (int i = 0;i< arrayName.length;i++){
            for (int j = 0; j < arrayName[i].length; j++){
                if (i%2!=0)System.out.print(arrayName[i][Math.abs(j-arrayName[i].length)-1]+" ");
                else System.out.print(arrayName[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void matrixSeventeen (int[][] arrayName){
        Scanner in = new Scanner(System.in);
        int k = 0;
            for (;;) {
                System.out.print("Enter K: ");
                k = in.nextInt();
                if (k < 0||k > arrayName.length-1) System.out.println("Введено неверное число.");
                else break;
            }
        System.out.println("Сумма: "+matrixSeventeenSum(arrayName, k));
        System.out.println("Произведение: "+matrixSeventeenMult(arrayName, k));
    }
    static int matrixSeventeenSum (int[][] arrayName, int k){
        int sum = 0;
        for (int i = 0; i < arrayName[k].length; i++){
            sum += arrayName[k][i];
        }
        return sum;
    }
    static int matrixSeventeenMult (int[][] arrayName, int k){
        int mult = 1;
        for (int i = 0; i < arrayName[k].length; i++){
            mult *= arrayName[k][i];
        }
        return mult;
    }
}
