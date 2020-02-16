package Lesson01;
/*
Написать программу для вывода на экран таблицы умножения.
 */
public class Less01Task3 {
    public static void main (String[] args ){
        int[][] mas=new int[9][9];
        for (int i=1; i<10; i++)
        {
            for (int j=1;j<10;j++){
                mas[i-1][j-1]=i*j;
                System.out.print(" "+mas[i-1][j-1]+"    ");
            }
            System.out.println();}
    }
}
