package Algorithm;
// 속도는 퀵이 평균적으로 더 빠름 
// 병합정렬보단 메모리 측면에서 효율을 보임
// 속도는 항상 n * logn을 보장함
public class heap {
	public static void heapAlgorithm(int heap[],int i,int k) {
		int root=i;
		int temp;
		int c;
		do {
			c=2*root+1;
			if(c<k-1 && heap[c] < heap[c+1] ) {
				c++;
			}
			if(c<k && heap[root] < heap[c]) {
				temp = heap[root];
				heap[root] = heap[c];
				heap[c]=temp;
				//재귀적으로 진행
				root=c;
			}
			
		}while( root>k || root==c);
	}
	public static int [] heapsort(int heap[]) {
		//트리를 힙 구조로 바꿈
			for(int i = 0 ; i <heap.length/2; i++) {
					heapAlgorithm(heap,i,heap.length);
				}
			
				for(int i = heap.length -1 ; i >=0; i--) {
					//첫번째 값과 마지막 값을 바꿈
					int temp = heap[0];
					heap[0] = heap[i];
					heap[i] = temp;
					//위에서부터 힙 정렬 알고리즘
					heapAlgorithm(heap,0,i);
				}
				return heap;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heap[]= {6,10,4,8,3,5,9,1,6};
		int a[] = heapsort(heap);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}
