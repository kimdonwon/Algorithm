package Algorithm;
// �ӵ��� ���� ��������� �� ���� 
// �������ĺ��� �޸� ���鿡�� ȿ���� ����
// �ӵ��� �׻� n * logn�� ������
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
				//��������� ����
				root=c;
			}
			
		}while( root>k || root==c);
	}
	public static int [] heapsort(int heap[]) {
		//Ʈ���� �� ������ �ٲ�
			for(int i = 0 ; i <heap.length/2; i++) {
					heapAlgorithm(heap,i,heap.length);
				}
			
				for(int i = heap.length -1 ; i >=0; i--) {
					//ù��° ���� ������ ���� �ٲ�
					int temp = heap[0];
					heap[0] = heap[i];
					heap[i] = temp;
					//���������� �� ���� �˰���
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
