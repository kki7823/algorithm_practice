package test;

public class MyComb {
    static char[] temp = new char[3];

    public static void com(int n, int r) {

        //5 Combonation 2
        int depth = 3;
        int index = 10;

        String order = "0123456789";
        char[] arr = order.toCharArray();

        if (r == depth) {
            System.out.println(String.valueOf(temp));
            return;
        }

        if (n == index) {
            return;
        }

        temp[r] = arr[n];
        com(n + 1, r + 1);
        com(n + 1, r);
    }

    public static void main(String[] args) {
        com(0, 0);
    }
}
