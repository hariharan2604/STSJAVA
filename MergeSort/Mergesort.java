package MergeSort;

public class Mergesort {
    int beg, end, arr[];

    public Mergesort(int arr[]) {
        this.arr = arr;
        this.beg = 0;
        this.end = arr.length - 1;
    }
    void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    void merge(int arr[], int beg, int mid, int end) {
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int i, j, k;
        int LeftArr[] = new int[n1];
        int RightArr[] = new int[n2];
        for (int l = 0; l < n1; l++) {
            LeftArr[l] = arr[beg + l];
        }
        for (int r = 0; r < n2; r++) {
            RightArr[r] = arr[mid + 1 + r];
        }
        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2) {
            if (LeftArr[i] <= RightArr[j]) {
                arr[k] = LeftArr[i];
                i++;
            } else {
                arr[k] = RightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LeftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = RightArr[j];
            j++;
            k++;
        }

    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void sort() {
        mergeSort(this.arr,this.beg,this.end);
    }
}
