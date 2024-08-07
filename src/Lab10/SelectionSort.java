package Lab10;

public class SelectionSort {

	public SelectionSort() {
    }

//    public int[] basicSelectionSort(int[] x) {
//        int pos, temp;
//        for (int i = 0; i < x.length; i++) {
//            pos = i;
//            for (int j = i + 1; j < x.length; j++) {
//                if (x[j] < x[pos]) {
//                    pos = j;
//                }
//            }
//            temp = x[pos];
//            x[pos] = x[i];
//            x[i] = temp;
//        }
//        return x;
//    }
    
	public int[] basicSelectionSort(int[] x) {
		int temp;
	    for (int i = 0; i < x.length; ++i) {
	        for (int j = i + 1; j < x.length; ++j) {
	            if (x[i] > x[j]) {
	                temp = x[i];
	                x[i] = x[j];
	                x[j] = temp;
	            }
	        }
	    } 
	    return x;
	}
	
    public void display(String testType, int[] x) {
    	System.out.print("Sorted result for :" + testType+ " :");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
