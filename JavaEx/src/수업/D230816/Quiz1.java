package 수업.D230816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(mid(x, y, z));

    }

    public static int mid(int x, int y, int z){
        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        for(int i = 0; i < 2; i++){
            for(int j = 1; j < 3; j++){
                if(arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
}
