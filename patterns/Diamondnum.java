package patterns;

public class Diamondnum {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k>0;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
