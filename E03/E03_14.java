package E03;

public class E03_14 {

	public static void main(String[] args) {
		for(int i=1;i<10000;i++) {
			int num=0;
			for(int j=1;j<i;j++) {
				if (i%j==0) {
					num+=j;
				}
			}
			if (num==i) {
				System.out.println(i);
			}
		}
	}

}
