public class HighArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;
		HighArray arr = new HighArray(maxSize);
		
		arr.insert(11);
		arr.insert(26);
		arr.insert(54);
		arr.insert(53);
		arr.insert(12);
		arr.insert(23);
		arr.insert(99);
		arr.insert(53);
		arr.insert(30);
		arr.insert(96);
		arr.insert(42);
		arr.insert(51);
		arr.insert(2);
		arr.insert(2);
		arr.insert(53);
		
		arr.display();
		arr.removeDuplicates();
		arr.display();
		
//		HighArray arrSorted = new HighArray(maxSize);
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		arrSorted.insert(arr.removeMax());
//		 
//		arrSorted.display();
		
//		int searchKey = 30;
//		if (arr.find(searchKey)) {
//			System.out.println("Found " + searchKey);
//		} else {
//			System.out.println("Can't find " + searchKey);
//		}
//		
//		arr.delete(30);
//		arr.delete(11);
//		
//		arr.display();
//		System.out.println(arr.removeMax());
//		arr.display();
	}
}
