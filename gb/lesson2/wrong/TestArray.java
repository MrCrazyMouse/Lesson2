package gb.lesson2.wrong;

import java.util.Random;

public class TestArray {
    public static void main (String[] args){
        int[][] arr = new int[4][4];
        int max, min;
        Random rnd = new Random();
        for (int i=0;i < arr.length;i++) {
            for (int j=0;j < arr[i].length;j++) {
                arr[i][j]=rnd.nextInt(10) + 1;
            }
        }
        for (int i=0;i < arr.length;i++,System.out.println()) {
            for (int j=0;j < arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
