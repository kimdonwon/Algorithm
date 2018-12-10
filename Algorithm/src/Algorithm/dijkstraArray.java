package Algorithm;

// 다익스트라 알고리즘 배열 사용
// 배열을 사용하고 배열 순으로 진행하기 때문에 시간 복잡도는 N^2으로 느리다.

// 1. 처음 0번 노드에 연결된 노드들의 거리를 받음
// 2. 0번 노드에 연결된 것 들 중 최소 거리의 노드를 구함
// 3. 최소 거리 노드를 이용하여 새로운 거리를 구함
// EX) a에서 b로 바로 가면 7, a에서 c를 갔다가 b를 가면 3 -> a에서 b의 거리를 7에서 3으로 바꿈

public class dijkstraArray {

	static boolean v[];
	static int d[];
	static int num=6; //개수
	static int INF = 1000000000; //무한
	static int a[][]= {
			{0,2,5,1,INF,INF},
			{2,0,3,2,INF,INF},
			{5,3,0,3,1,5},
			{1,2,3,0,1,INF},
			{INF,INF,1,1,0,2},
			{INF,INF,5,INF,2,0}
	};//그래프 거리를 초기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		v=new boolean[6];//방문한 노드
		d=new int[6];//최단 거리
		dijkstra(0);
		for(int i=0;i<num;i++)
			System.out.println(d[i]);
		
		
	}
	// 가장 짧은 거리의 노드를 찾음
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
			// 가장 짧은 노드를 방문 처리함
			v[current]=true;
			for(int j=0;j<num;j++) {
				if(!v[j]) {
					//가장 짧은 노드를 거쳐서 가는게 더 빠르면 거리 값을 갱신해줌
					if(d[current] + a[current][j]<d[j]) {
						d[j]=d[current]+a[current][j];
					}
				}
			}
		}
		
	}
	
	
}
