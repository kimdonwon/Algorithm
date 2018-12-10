package Algorithm;

//퀵 정렬
//시간 복잡도 n*logn
//정렬 중에 평균적으로 가장 빠름 (logn은 거의 상수)
//
//이미 정렬이 된 배열은 최악의 경우 n^2이 나옴
//정렬이 어느정도 되어있으면 삽입 정렬이 더 빠름
//-> 그냥 sort함수가 제일 빠름
//
//1. 첫번 째 값을 기준으로 정함
//2. 기준보다 큰 값을 왼쪽에서부터 찾음
//3. 기준보다 작은 값을 오른쪽에서부터 찾음
//4. 찾은 값들이 엇갈리지 않았으면 값 끼리 바꿈
//5. 엇갈렸으면 작은값과 기준을 바꿈
//6. 기준으로 왼쪽은 작은값 오른쪽은 큰값으로 정렬됨
//7. 기준으로 왼쪽과 오른쪽을 다시 퀵 정렬

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
