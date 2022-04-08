// demonstrates array class with high-level interface
public class HighArray {
	private long[] array;
	private int nElems;
	
	public HighArray(int max) {
		array = new long[max];
		nElems = 0;
	}
	
	public boolean find(long searchKey) {
		for (int i = 0; i < nElems; i++) {
			if (array[i] == searchKey) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(long value) {
		array[nElems] = value;
		nElems++;
	}
	
	public boolean delete(long value) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (value == array[i]) {
				break;
			}
		}
		
		if (i == nElems) { // can't find it
			return false;
		} else { // found it
			for (int j = i; j < nElems; j++) { // move bigger ones down
				array[j] = array[j + 1];
			}
			
			nElems--;
			return true;
		}
	}
	
	public long removeMax() {
		if (nElems == 0) {
			return -1; // we assume that all values are positive numbers
		}
		
		long maxValue = array[0];
		
		for (int i = 0; i < nElems; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i]; // set new maxValue
			}
		}
		
		this.delete(maxValue);
		return maxValue;
	}
	
	public void removeDuplicates() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					this.delete(array[i]);
				}
			}
		}
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}
}
