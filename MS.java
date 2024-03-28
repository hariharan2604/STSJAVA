import MergeSort.Mergesort;
public class MS {
    public static void main(String[] args) {
        int arr[] = { 100, 2, 56, 22, 87 };
        Mergesort ms = new Mergesort(arr);
        ms.printArr(arr);
        ms.sort();
        ms.printArr(arr);
    }
}
