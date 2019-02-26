class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 9, 4, 8, 10};
        SelectionSort ss = new SelectionSort(arr);
        ss.sort();
        System.out.println("SelectionSort: " + ss.toString());

        BubbleSort bs = new BubbleSort(arr);
        bs.sort();
        System.out.println("BubbleSort: " + bs.toString());

        InsertionSort is = new InsertionSort(arr);
        is.sort();
        System.out.println("InsertionSort: " + is.toString());
    }
}
