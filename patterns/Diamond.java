package patterns;

public class Diamond {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=n-i-1;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
