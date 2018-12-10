package Algorithm;

//�� ����
//�ð� ���⵵ n*logn
//���� �߿� ��������� ���� ���� (logn�� ���� ���)
//
//�̹� ������ �� �迭�� �־��� ��� n^2�� ����
//������ ������� �Ǿ������� ���� ������ �� ����
//-> �׳� sort�Լ��� ���� ����
//
//1. ù�� ° ���� �������� ����
//2. ���غ��� ū ���� ���ʿ������� ã��
//3. ���غ��� ���� ���� �����ʿ������� ã��
//4. ã�� ������ �������� �ʾ����� �� ���� �ٲ�
//5. ���������� �������� ������ �ٲ�
//6. �������� ������ ������ �������� ū������ ���ĵ�
//7. �������� ���ʰ� �������� �ٽ� �� ����

public class Quick {
	static int n = 10;
	static int data[] = {8,10,5,8,7,6,4,3,2,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quick(data,0,n-1);
		for(int i=0;i<10;i++)
		System.out.println(data[i]);

	}
	
	static void  quick(int []data, int start, int end) {
		//���Ұ� 1���� ���
		if (start >= end) {
			return;
		}
		int key = start; //Ű�� ù��° ����
		int i = start + 1;
		int j = end;
		int temp;
		
		//������ ������ �ݺ�
		while (i <= j) {
			//Ű ������ ū ���� ���� ������ ����
			while(data[i] <= data[key]&& i<end) {
				i++;
			}
			//Ű ������ ���� ���� ���� ������ ����
			while(data[j] >= data[key] && j>start) {
				j--;
			}
			//���� ������ ���¸� Ű ���� ��ü
			if(i >= j ) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}
			//�� ������ �ʾҴٸ� i�� j�� ��ü
			else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			
		}
		quick(data,start,j-1);
		quick(data,j+1,end);
	}

}
