package Algorithm;
// �ӵ��� ���� ��������� �� ���� 
// �������ĺ��� �޸� ���鿡�� ȿ���� ����
// �ӵ��� �׻� n * logn�� ������
public class heap {
	public static int [] heapsort(int heap[]) {
		//Ʈ���� �� ������ �ٲ�
				for(int i = 1 ; i < heap.length ; i++) {
					int c = i;
					do {
						//���� ���ҿ��� ������ ������ ���� ��尡 ��
						int root = (c-1) / 2;
						//�θ𺸴� �ڽ��� ũ�� �ٲ�
						if(heap[root] < heap[c]) {
							int temp = heap[root];
							heap[root] = heap[c];
							heap[c] = temp;
						}
						//c�� �ٲ��ָ鼭 ��������� ����
						c=root;
					}while( c!=0);
				}
				
				for(int i = heap.length -1 ; i >=0; i--) {
					//ù��° ���� ������ ���� �ٲ�
					int temp = heap[0];
					heap[0] = heap[i];
					heap[i] = temp;
					int root=0;
					int c=1;
					//���������� �� ���� �˰���
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
						//��������� ����
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
