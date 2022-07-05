package dsa.algo.sorting.heapsort;

public class HeapSort {
	
	static int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
	static int heapSize = A.length;
	
	static int parent(int[] A, int i) {
		return ((int) Math.floor((i +1)/2) - 1);
	}
	
	static int left(int[] A, int i) {
		return ((i + 1) * 2) - 1;
	}
	
	static int right(int[] A, int i) {
		return ((i + 1) * 2) + 1 - 1;
	}
	
	static void swap(int[] A, int i, int largest) {
		A[i] = A[i] + A[largest];
		A[largest] = A[i] - A[largest];
		A[i] = A[i] - A[largest];
	}
	//MAXHEAPIFY ASSUMES THAT THE LEFT AND RIGHT SUBTREES OF THE NODE ON WHICH WE ARE CHECKING
	//HEAP PROPERTY ARE ALREADY MAXHEAPS AND ONLY THE NODE MIGHT VIOLATE MAXHEAP PROPERTY
	static void maxHeapify(int[] A, int i) {
		int l = left(A, i);
		System.out.println("l = " + l );
		int r = right(A, i);
		System.out.println("r = " + r);
		int largest = Integer.MIN_VALUE;
		
		if((l < (heapSize)) && A[l] > A[i])
			largest = l;
		else
			largest = i;
		if((r < (heapSize)) && A[r] > A[largest])
			largest = r;
		System.out.println("largest = " + largest);
		if(largest != i) {
			swap(A, i, largest);
			maxHeapify(A, largest);
		}
	}
	
	static void buildMaxHeap(int[] A) {
		//GET THE FIRST INTERNAL NODE.
		int i = parent(A, heapSize - 1);
		//FROM FIRST INTERNAL NODE TILL ROOT NODE.
		for(; i >= 0; i--) {
			maxHeapify(A, i);
		}
	}
	
	static void heapSort(int [] A) {
		//GET THE MAX VALUE AT ROOT.
		buildMaxHeap(A);
		while(heapSize > 1) {
			//PUT THE MAX VALUE AT LAST NODE AND THEN REDUCE HEAP SIZE.
			swap(A, 0, heapSize - 1);
			//REMOVE THE MAX ELEMENT FROM THE HEAP.
			heapSize--;
			//HAEAPIFY ROOT AGAIN AS IT IS THE ONLY NODE WHOSE MAX
			//HEAP PROPERTY MAY HAVE BEEN DISTURBED.
			maxHeapify(A, 0);
		}
	}

	public static void main(String[] args) {
		//maxHeapify(A, 2);
		//buildMaxHeap(A);
		heapSort(A);
		for(int a : A)
			System.out.print(a + " ");
		System.out.println();
	}

}



//TRY TO CODE THIS WITH START AND END RANGE AND NOT THE ENTIRE ARRAY.
//CHECK FOR DISPLACEMENT AND GENERALIZE FUNCTOINS parent(), left(), right().