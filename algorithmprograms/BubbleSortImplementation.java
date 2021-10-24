package algorithmprograms;

public class BubbleSortImplementation {

	public static void main(String[] args) {
		int arr[] = { 36, 19, 29, 12, 6, 10 };
		System.out.print("before sorting ");
		printArray(arr);
		bubbleSort(arr);
		System.out.println();
		System.out.print("after sorting ");
		printArray(arr);
		

	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
