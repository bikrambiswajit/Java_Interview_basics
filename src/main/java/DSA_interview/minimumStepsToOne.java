package DSA_interview;

public class minimumStepsToOne {

	public static void main(String[] args) {
		int n=7;
		int[] bu = new int[n+1];
        bu[0] = 0;
        bu[1] = 0;
        for(int i=2;i<=n;i++) {
                int r = 1+bu[i-1];
                if(i%2 == 0) r = Math.min(r,1+bu[i/2]);
                if(i%3 == 0) r = Math.min(r,1+bu[i/3]);
                bu[i] = r;
        }
        System.out.println(bu[n]);

        // Example bu[] value for n=7			        
        //        [0,0,1,1,2,3,2,3]
        //        r=3 


	}

}
