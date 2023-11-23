package patterns;

public class Righttriangle {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
