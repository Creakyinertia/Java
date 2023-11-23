package patterns;

public class Numpat1 {

	public static void main(String[] args) {
		int n=6;
		int c=1;
		for(int i=1;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
