package E02;
public class E02_02
{
	public static void main(String[] args){
		//long time=System.currentTimeMills();
		long time1=System.currentTimeMillis();
		System.out.println(time1);
		long miaozs=time1/1000;

		long cmiao=miaozs%60;

		long fenzs=miaozs/60;

		long cfen=fenzs%60;

		long hourzs=fenzs/60;
		long chour=hourzs%24;
		System.out.println(chour+":"+cfen+":"+cmiao);
	}
}