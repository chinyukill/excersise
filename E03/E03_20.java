package E03;

public class E03_20 {

	public static void main(String[] args) {
		int sum = 0;//���ӵ�����
		int cnt = 0;//һ�����˼���
		outer: for (int i = 6; i < 10000; i++) {
			sum = i;
			cnt = 0;
			for (int j = 0; j < 5; j++) {
				if (sum % 5 == 1) {
					sum = sum - ((sum / 5) + 1);
					cnt++;
					if (cnt == 5) {
						System.out.println(i);
						break outer;
					}
				} else {
					break;
				}
			}

		}
	}

}
