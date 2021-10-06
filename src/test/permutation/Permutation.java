package test.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    static int R = 2;
    static int[] list = {1, 2, 3};
    static int[] resulList = new int[R];
    static boolean[] visited = new boolean[4];

    public static void main(String[] args) {
        Arrays.fill(visited, false);
        permutation(0);

        System.out.println("==========");

        nPrSwap(0);

    }

    public static void permutation(int idx) {
        if (idx == R) {
            System.out.println(Arrays.toString(resulList));
            return;
        }
        for (int i = 0; i < list.length; i++) {
            if (visited[i])
                continue;

            resulList[idx] = list[i];

            visited[i] = true;
            permutation(idx + 1);
            visited[i] = false;
        }
    }

    public static void nPrSwap(int d) { // d: depth
        if(d == R) {
            System.out.println(Arrays.toString(list));
            return;
        }
        for (int i = d; i < list.length; i++) {
            swap(d,i);
            nPrSwap(d+1);
            swap(d,i);
        }
    }

    public static void swap(int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

}


