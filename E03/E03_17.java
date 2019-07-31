package E03;

public class E03_17 {

	public static void main(String[] args) {

		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int m=0;m<i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int m=0;m<i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int m=0;m<i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
