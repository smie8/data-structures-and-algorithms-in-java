
public class BubbleSortApp {
	
	public static void main(String args[]) {
		int maxSize = 100000;
		
		//ArrayBubbleSort arrayBubbleSort = new ArrayBubbleSort(maxSize);
		//fillArrayWithRandomNumbers(maxSize, arrayBubbleSort);
		
		ArrayBubbleSort arrayBubbleSort = createInverselySortedArray(maxSize);
	
		arrayBubbleSort.displayContents();
		arrayBubbleSort.bubbleSort();			// takes about 10 seconds with 100,000 items, in random order // 3 seconds when inversely sorted
		arrayBubbleSort.displayContents();
		System.out.println("Done.");
	}
	
	private static void fillArrayWithRandomNumbers(int size, ArrayBubbleSort array) {
		for (int i = 0; i < size; i++) {
			long randomNumber = (long) (Math.random() * (size - 1));
			array.insertItem(randomNumber);
		}		
	}
	
	private static ArrayBubbleSort createInverselySortedArray(int maxSize) {
		ArrayBubbleSort array = new ArrayBubbleSort(maxSize);
		
		for (int i = 0; i < maxSize; i++) {
			array.insertItem(maxSize - i);
		}
		
		return array;
	}
}
