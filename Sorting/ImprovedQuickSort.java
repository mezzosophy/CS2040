// Quick Sort algorithm
public class ImprovedQuickSort {

	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length-1);
	}

	private static void quickSort(int[] a, int i, int j) {
		if (i < j) {
			int pivotIdx= partition(a, i, j);
			quickSort(a, i, pivotIdx-1);
			quickSort(a, pivotIdx+1, j);
		}
	}

	private static void swap(int[] a, int pos1, int pos2) {
		int temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}

	private static int partition(int[] a, int i, int j) {
		// partition data items in a[i..j]
		int p = a[i]; // p is the pivot, the i-th item
		int m = i;    // Initially S1 and S2 are empty
        int s = i;

		for (int k=i+1; k<=j; k++) { // process unknown region
			if (a[k] < p) { // case 2: put a[k] to S1
				m++;
                if (s<j) {
                    s++;
                }
				swap(a,k,m);
                swap(a,k,s);
			} else if (a[k] == p) {
                if (s<j) {
                    s++;
                }
                swap(a,k,s);
            }
		}

		swap(a,i,m); // put the pivot at the right place
		return m;    // m is the pivot's final position
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 7, 7, 7, 3, 8, 2, 10, -3 };

		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}
}

