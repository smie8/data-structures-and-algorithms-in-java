
public class OrderedArray {
	private long[] array;
	private int nElems;
	
	public OrderedArray(int max) {
		array = new long[max];
		nElems = 0;
	}
	
	public int size() {
		return nElems;
	}
	
	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems + 1;
		int curIn;
		
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			
			if (array[curIn] == searchKey) {
				return curIn; // found it
			} else if (lowerBound > upperBound) {
				return nElems; // can't find it
			} else {
				if (array[curIn] < searchKey) {
					lowerBound = curIn + 1; // it's in upper half
				} else {
					upperBound = curIn - 1; // it's in lower half
				}
			}
		}
	}
	
	public void insert(long value) {
		int index = findIndex(value);
		
		for (int i = nElems; i > index; i--) { // move bigger ones up
			array[i] = array[i - 1];
		}
		
		array[index] = value;
		nElems++;
	}
	
	public int findIndex(long value) {
		if (nElems == 0 || array[0] > value) { // check if smallest
			return 0;
		} else if (array[nElems - 1] < value) { // check if biggest
			return nElems;
		}
		
		int lowerBound = 0;
		int upperBound = nElems + 1;
		int currentIndex;
		
		while (true) {
			currentIndex = (lowerBound + upperBound) / 2;
			
			if (array[currentIndex] >= value && array[currentIndex - 1] <= value) { // found it
				return currentIndex;
			} else {
				if (array[currentIndex] < value) {
					lowerBound = currentIndex + 1;
				} else {
					upperBound = currentIndex - 1;
				}
			}
		}
	}
	
	public boolean delete(long value) {
		int i = find(value);
		
		if (i == nElems) {
			return false; // can't find it
		} else { // found it
			for (int j = i; j < nElems; j++) { // move bigger ones down
				array[j] = array[j + 1];
			}
			
			nElems--;
			return true;
		}
	}
	
	public static void merge(long[] arrayA, long[] arrayB) {
		// merge two ordered source arrays into an ordered destination array
		// arrays may hold different numbers of data items
		// in this algorithm you will need to compare the keys of the source arrays, picking the smallest one to copy to the destination
		
		long[] mergedArray = new long[arrayA.length + arrayB.length];

		int iterator = 0;
		int j = 0;
		int k = 0;
		while (j < arrayA.length || k < arrayB.length) {
			if (j < arrayA.length) {
				if (k == arrayB.length || arrayA[j] < arrayB[k]) {
					mergedArray[iterator] = arrayA[j];
					j++;
				} else {
					mergedArray[iterator] = arrayB[k];
					k++;
				}
			} else {
				mergedArray[iterator] = arrayB[k];
				k++;
			}
			
			iterator++;
		}
		
		System.out.println("result: ");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
}
