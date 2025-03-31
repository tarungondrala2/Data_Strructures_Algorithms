package Heaps;

public class MinHeaps {
	
//	public void insert(int value) {
//	        
//	        heap.add(value);
//	        int current = heap.size() - 1;
//	        
//	        while(current > 0 && heap.get(current) < heap.get(parent(current))) {
//	            swap(current, parent(current));
//	            current = parent(current);
//	        }
//	            
//	        
//	    }
	
//	 public Integer remove() {
//	        
//	        if(heap.size() == 0) return null;
//	        
//	        if(heap.size() == 1) return heap.remove(0);
//	        
//	        Integer minValue = heap.get(0);
//	        heap.set(0, heap.remove(heap.size() - 1));
//	        sinkDown(0);
//	        
//	        return minValue;
//	        
//	    }
	
//	public void sinkDown(int index) {
//	        
//	        int minIndex = index;
//	        int leftIndex = leftChild(index);
//	        int rightIndex = rightChild(index);
//	        
//	        if(leftIndex < heap.size() && heap.get(leftIndex) < heap.get(minIndex)) {
//	            minIndex = leftIndex;
//	        }
//	        
//	        if(rightIndex < heap.size() && heap.get(rightIndex) < heap.get(minIndex)) {
//	            minIndex = rightIndex;
//	        }
//	        
//	        if(minIndex != index) {
//	            swap(index, minIndex);
//	            index = minIndex;
//	        }
//	        else {
//	            return;
//	        }
//	    }

}
