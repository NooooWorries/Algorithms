public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,6,7,9,12,14,17,19};
		int targetOne = 3;
		int targetTwo = 27;
		System.out.println("Position of 3: " + binarySearch(targetOne, array, 0, array.length - 1));
		System.out.println("Position of 27: " + binarySearch(targetTwo, array, 0, array.length - 1));
	}
	
	public static int binarySearch(int target, int[] array, int low, int high) {
		if (low > high)
			return -1;
		int middle = (low + high) / 2;
		if (array[middle] < target)
			return binarySearch(target, array, middle + 1, high);
		else if (array[middle] > target)
			return binarySearch(target, array, low, middle - 1);
		else
			return middle;
	}
}