package test.permutation;

public class Permutation_Temp {
    public static void main(String[] args) {
        String str = "ABCDE";
        int n = str.length();
        int r = 3;

        char[] arr = str.toCharArray();
        char[] temp = new char[r];
        boolean[] visit = new boolean[n];
        permutate(arr, temp, visit, n, r, 0);

    }

    public static void permutate(char[] arr, char[] temp, boolean[] visit, int n, int r, int idx) {
        if (idx == r) {
            System.out.println(String.valueOf(temp));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visit[i])
                continue;

            temp[idx] = arr[i];
            visit[i] = true;
            permutate(arr,temp,visit,n,r,idx+1);
            visit[i] = false;
        }
    }
}
