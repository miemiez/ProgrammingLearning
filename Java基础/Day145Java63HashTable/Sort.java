package Day145Java63HashTable;

public class Sort {
	public static void main(String[] args) {
		int[] arr = {4,1,3,7,5,9,2,6,3};
		mergeSort(arr,0,arr.length-1);
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j]  > current) {
		        array[j+1] = array[j];
		        j--;
		    }
			array[j+1] = current;
		}
	}
	
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}
