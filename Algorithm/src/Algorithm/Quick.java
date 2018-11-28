package Algorithm;

//평균 속도가 가장 빠름

public class Quick {
	static int n = 10;
	static int data[] = {1,10,5,8,7,6,4,3,2,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quick(data,0,n-1);
		for(int i=0;i<10;i++)
		System.out.println(data[i]);

	}
	
	static void  quick(int []data, int start, int end) {
		//원소가 1개인 경우
		if (start >= end) {
			return;
		}
		int key = start; //키는 첫번째 원소
		int i = start + 1;
		int j = end;
		int temp;
		
		//엇갈리 때까지 반복
		while (i <= j) {
			//키 값보다 큰 값을 만날 때까지 수행
			while(data[i] <= data[key]&& i<end) {
				i++;
			}
			//키 값보다 작은 값을 만날 때까지 수행
			while(data[j] >= data[key] && j>start) {
				j--;
			}
			//현재 엇갈린 상태면 키 값과 교체
			if(i >= j ) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}
			//엇 갈리지 않았다면 i와 j를 교체
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
