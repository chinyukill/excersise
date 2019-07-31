package E01;
public class E01_02
{
	public static void main(String[] args){
		int sum1=0;
		for(int i=1;i<7;i++){
			sum1+=i;	
		}
		System.out.println(sum1);
		System.out.println("*********");
		//for方法
		int sum2=0;
		int j=0;
		while(j<7){
			sum2+=j;
			j++;
		}
		System.out.println(sum2);
		System.out.println("*********");
		//while方法


		int sum3=0;
		int k=0;
		do{
			sum3+=k;
			k++;
		}while(k<7);
		System.out.println(sum3);
		System.out.println("*********");


	}
}