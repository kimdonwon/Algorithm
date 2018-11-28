package Algorithm;

public class Insert {
	public static void main(String arg[]) {
		int i,j,temp;
		int data[]= {1,10,5,8,7,6,4,3,2,9};
		for(i=0;i<9;i++) {
			j=i;
			while(data[j] > data[j+1]) {
				temp = data[j];
				data[j] = data[j+1];
				data[j+1] = temp;
				j--;
			}
		}
		for(i=0;i<10;i++) {
			System.out.println(data[i]);
		}
	}
}
