public class WhileBreak01 {
	public static void main(String[] args){
		double money = 100000;
		int count =0;
		while(money > 0){
			if (money>50000) {
				money*=(1-0.05);
			}else if(money>=1000){  //����1000�޷���·
				money-=1000;
			}else{
				break;
			}
			count++;
		} 
		System.out.println("ʣ�� "+money+" Ԫ�����Ծ��� " + count + "��·��");
	}
}