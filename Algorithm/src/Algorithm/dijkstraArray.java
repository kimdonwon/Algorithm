package Algorithm;

// ���ͽ�Ʈ�� �˰��� �迭 ���
// �迭�� ����ϰ� �迭 ������ �����ϱ� ������ �ð� ���⵵�� N^2���� ������.

// 1. ó�� 0�� ��忡 ����� ������ �Ÿ��� ����
// 2. 0�� ��忡 ����� �� �� �� �ּ� �Ÿ��� ��带 ����
// 3. �ּ� �Ÿ� ��带 �̿��Ͽ� ���ο� �Ÿ��� ����
// EX) a���� b�� �ٷ� ���� 7, a���� c�� ���ٰ� b�� ���� 3 -> a���� b�� �Ÿ��� 7���� 3���� �ٲ�

public class dijkstraArray {

	static boolean v[];
	static int d[];
	static int num=6; //����
	static int INF = 1000000000; //����
	static int a[][]= {
			{0,2,5,1,INF,INF},
			{2,0,3,2,INF,INF},
			{5,3,0,3,1,5},
			{1,2,3,0,1,INF},
			{INF,INF,1,1,0,2},
			{INF,INF,5,INF,2,0}
	};//�׷��� �Ÿ��� �ʱ�ȭ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		v=new boolean[6];//�湮�� ���
		d=new int[6];//�ִ� �Ÿ�
		dijkstra(0);
		for(int i=0;i<num;i++)
			System.out.println(d[i]);
		
		
	}
	// ���� ª�� �Ÿ��� ��带 ã��
	static int getSmallIndex() {
		int min = INF;
		int index=0;
		for(int i=0;i<num;i++) {
			if(d[i]<min && !v[i]) {
				min=d[i];
				index=i;
			}
		}
		return index;
	}
	
	static void dijkstra(int start) {
		for(int i=0;i<num;i++) {
			d[i]=a[start][i];
		}
		v[start]=true;
		for(int i=0;i<num;i++) {
			int current = getSmallIndex();
			// ���� ª�� ��带 �湮 ó����
			v[current]=true;
			for(int j=0;j<num;j++) {
				if(!v[j]) {
					//���� ª�� ��带 ���ļ� ���°� �� ������ �Ÿ� ���� ��������
					if(d[current] + a[current][j]<d[j]) {
						d[j]=d[current]+a[current][j];
					}
				}
			}
		}
		
	}
	
	
}
