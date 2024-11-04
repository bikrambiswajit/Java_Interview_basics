package Java_interview.Java_interview;

public class maxMin2DArray {

	public static void main(String[] args) {
		
		int a[][] = {{1,4,7},{5,7,2},{6,15,9}};
		int min=0;
		int max=0;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				if(a[i][j]<min){
					min=a[i][j];
				}
				if(a[i][j]>max){
					max=a[i][j];
				}
			}
		}
		System.out.println("MAX: "+max);
		System.out.println("Min: "+min);

	}

}
