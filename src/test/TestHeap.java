package test;

public class TestHeap {


    public static void main(String[] args) {
        Heap<Integer> heap1 = new Heap<>();
        Heap<String> heap2 = new Heap<>(15);

        heap1.add(10);
        heap1.add(5);
        heap1.add(5);
        heap2.add("sss");
        heap2.add("lll");
        heap2.add("kkk");
        System.out.println(heap1.toString());
        System.out.println(heap2.toString());
    }

}
