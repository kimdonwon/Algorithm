package Algorithm;
// 속도는 퀵이 평균적으로 더 빠름 
// 병합정렬보단 메모리 측면에서 효율을 보임
// 속도는 항상 n * logn을 보장함
public class heap {
	public static int [] heapsort(int heap[]) {
		//트리를 힙 구조로 바꿈
				for(int i = 1 ; i < heap.length ; i++) {
					int c = i;
					do {
						//현재 원소에서 절반을 나누면 보모 노드가 됨
						int root = (c-1) / 2;
						//부모보다 자식이 크면 바꿈
						if(heap[root] < heap[c]) {
							int temp = heap[root];
							heap[root] = heap[c];
							heap[c] = temp;
						}
						//c를 바꿔주면서 재귀적으로 진행
						c=root;
					}while( c!=0);
				}
				
				for(int i = heap.length -1 ; i >=0; i--) {
					//첫번째 값과 마지막 값을 바꿈
					int temp = heap[0];
					heap[0] = heap[i];
					heap[i] = temp;
					int root=0;
					int c=1;
					//위에서부터 힙 정렬 알고리즘
					do {
						c=2*root+1;
						if(c<i-1 && heap[c] < heap[c+1] ) {
							c++;
						}
						if(c<i && heap[root] < heap[c]) {
							temp = heap[root];
							heap[root] = heap[c];
							heap[c]=temp;
						}
						//재귀적으로 진행
						root=c;
					}while(c<i);
				}
				return heap;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heap[]= {7,6,5,8,3,5,9,1,6};
		int a[] = heapsort(heap);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
