
public class ArraySelectionSort {
	
	private long[] array;
	private int nElems;
	
	public ArraySelectionSort(int max) {
		array = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		array[nElems] = value;
		nElems++;
	}
	
	public void displayContents() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void selectionSort() {
		int out;
		int in;
		int minimumValue;
		
		for (out = 0; out < nElems - 1; out++) {			// outer loop
			minimumValue = out;
			
			for (in = out + 1; in < nElems; in++) {			// inner loop
				if (array[in] < array[minimumValue]) {		// check if in value is the new minimum
					minimumValue = in;
				}
				
				swap(out, minimumValue);					// swap
			}
		}
	}
	
	public void swap(int first, int second) {
		long temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

}
