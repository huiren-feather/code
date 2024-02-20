public class WhileBreak01 {
	public static void main(String[] args){
		double money = 100000;
		int count =0;
		while(money > 0){
			if (money>50000) {
				money*=(1-0.05);
			}else if(money>=1000){  //不足1000无法过路
				money-=1000;
			}else{
				break;
			}
			count++;
		} 
		System.out.println("剩下 "+money+" 元，可以经过 " + count + "次路口");
	}
}