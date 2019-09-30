import java.util.Scanner;

public class MinArr {
    public static void randomArr(int[][] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("input max crurrent:= ");
        int maxCurrent = sc.nextInt();
        System.out.println("input Max column:= ");
        int maxColumn = sc.nextInt();
        arr = new int[maxCurrent][maxColumn];
        randomArr(arr);
        System.out.println("Print arr\n");
        print(arr);
        int minArr = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minArr) {
                    minArr = arr[i][j];
                }
            }
        }
        System.out.println("Min Arr: = " + minArr);
    }
}
