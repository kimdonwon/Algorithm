package Algorithm;

public class Insert {
	
	public static void insertsort(int []data) {
		int i,j,temp;
		for(i=0;i<9;i++) {
			j=i;
			while(j>=0 && data[j] > data[j+1]) {
				temp = data[j];
				data[j] = data[j+1];
				data[j+1] = temp;
				j--;
			}
		}
	}
	public static void main(String arg[]) {
		int i;
		int data[]= {10,1,5,8,7,6,4,3,2,9};
		
		insertsort(data);
		for(i=0;i<10;i++) {
			System.out.println(data[i]);
		}
	}
}
