
public class ArrayBubbleSort {
	
	private long[] array;
	private int nElems;
	
	public ArrayBubbleSort(int maxSize) {
		array = new long[maxSize];
		nElems = 0;
	}
	
	public void insertItem(long value) {
		array[nElems] = value;
		nElems++;
	}
	
	public void displayContents() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void bubbleSort() {
		int out;
		int in;
		
		for (out = nElems - 1; out > 0; out--) {
			for (in = 0; in < out; in ++) {
				if (array[in] > array[in + 1]) {
					swap(in, in + 1);
				}
			}
		}
	}
	
	private void swap(int first, int second) {
		long temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
}
