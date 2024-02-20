public class ArithmeticOperatorExercise{
	public static void main(String[] args){

		// 需求：
		// 59天放假，问：合计几个星期零几天
		// 思路：先算星期，在取模天数
		int days = 59;
		int week = days / 7;
		int d =  days % 7;

		System.out.println("合计"+ week + "星期零" + d + "天");  

	}
}