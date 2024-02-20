public class HanoiTower {
	public static void main(String[] args){
		Tower t = new Tower();
		t.move(4,'A','B','C');		
	}
}

class Tower {

	// 方法
	// num 表示要移动的个数 ,a,b,c分别表示A塔B塔C塔
	public void move(int num ,char a ,char b, char c){
		// 如果只有一个盘  num=1
		if (num==1) {
			System.out.println(a +" -> "+ c);
		}else{
			// 如果有多个盘，可以看成两个，最下面的和上面所有盘（num-1）
			// 1.先移动上面num-1个盘到b,借助c
			move(num-1,a,c,b);
			// 2.再移动最后一个盘到c
			System.out.println(a + " -> " + c);
			// 3.最后把 b 塔的所有盘，移动到c ，借助a
			move(num-1,b,a,c);
		}

	}
}