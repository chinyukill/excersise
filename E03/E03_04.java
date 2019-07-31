package E03;

import java.util.Scanner;

public class E03_04 {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÕË»§Ãû£¡");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("ÇëÊäÈëÃÜÂë£¡");
		String password=sc.next();
		if("admin".equals(name)&&"123".equals(password)) {
			System.out.println("µÇÂ¼³É¹¦");
		}else {
			System.out.println("µÇÂ¼Ê§°Ü");
		}
	}
}
