import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        int ma = 0;
        String[] str = in.nextLine().split(" ");

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
            if (arr[i] > ma) {
                ma = arr[i];
            }
        }

        boolean flg = false;
        int[] ost = new int[n-1];
        int k = 0;
        int su = 0;
        for (int j : arr) {
            if (j != ma || flg) {
                ost[k] = j;
                su += ost[k];
                k += 1;
            }
            if (j == ma) {
                flg = true;
            }
        }
        int rez = 0;
        if (su == ma){
            rez = ma*2;
        } else {
            rez = ma - su;
        }
        System.out.println(rez);
        }
    }