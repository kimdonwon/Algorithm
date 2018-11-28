package Algorithm;
//�պ� ����
//
//�ð� ���⵵ n*logn �� ������
//�ϴ� ������ �ɰ��� ���߿� ��ħ
//
//1. �迭�� ��Ұ� 1���� �� ������ ������ ��� �ɰ�
//2. �迭�� �� ����� ���ϰ� ��ħ
//3. �ݺ�
public class Merge {
	static int n = 8;
	static int sorted[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sorted = new int [n];
		int data[] = {7,6,5,8,3,5,9,1};
		mergeSort(data,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.println(data[i]);
		}
		
		
	}
	//
	//m ������, middle �߰���, n ����
	static void merge(int a[], int m,int middle, int n) {
		//���� ù��° �迭�� ù��° ��
		int i = m;
		//���� �ι�° �迭�� �ι�° ��
		int j = middle + 1;
		//�񱳰��� ���� �迭�� ù��° ��
		int k = m;
		
		// ���� ������� �迭�� ����
		while( i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}
			else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		
		//���� ������ ����
		if (i>middle) {
			for(int t=j;t<=n;t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		else {
			for(int t=i;t<=middle;t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		//���ĵ� �迭�� ����
		for(int t = m; t <= n ; t++) {
			a[t] = sorted[t];
		}
	}
	
	static void mergeSort(int a[],int m, int n) {
		//ũ�Ⱑ 1���� ū ���
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
	}

}
