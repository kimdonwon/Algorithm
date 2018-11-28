package Algorithm;
//합병 정렬
//
//시간 복잡도 n*logn 을 보장함
//일단 반으로 쪼개고 나중에 합침
//
//1. 배열의 요소가 1개가 될 때까지 반으로 계속 쪼갬
//2. 배열의 두 덩어리를 비교하고 합침
//3. 반복
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
	//m 시작점, middle 중간점, n 끝점
	static void merge(int a[], int m,int middle, int n) {
		//비교할 첫번째 배열에 첫번째 값
		int i = m;
		//비교할 두번째 배열에 두번째 값
		int j = middle + 1;
		//비교값을 넣을 배열의 첫번째 값
		int k = m;
		
		// 작은 순서대로 배열에 삽입
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
		
		//남은 데이터 삽입
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
		
		//정렬된 배열을 삽입
		for(int t = m; t <= n ; t++) {
			a[t] = sorted[t];
		}
	}
	
	static void mergeSort(int a[],int m, int n) {
		//크기가 1보다 큰 경우
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
	}

}
