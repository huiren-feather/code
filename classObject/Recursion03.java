
// 迷宫问题
// 1.小球得到的路径，和程序员设置的找路策略有关：找路的上下左右的顺序相关
// 2.再得到小球路径时，可以先使用（下右上左），再改成（上右下左），看看路径是否有变化
// 3.测试回溯现象
// 4.扩展思考：如何求出最短路径


public class Recursion03 {
	public static void main(String[] args){
 		// 思路
 		// 1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7]
 		// 2.先规定 map 数组的元素值：0 表示可以走 1 表示障碍物
		int[][] map =new int[8][7];
		// 3.将最上面的一行和最下面的一行，全部设置为1
		for (int i=0;i<7 ;i++ ) {
			map[0][i]=1;
			map[7][i]=1;
		}
		// 4.将第一列和最后一列，全部设置成1
		for (int i=0;i<8 ;i++ ) {
			map[i][0]=1;
			map[i][6]=1;
		}
		// 5.设置障碍物为1
		map[3][1]=map[3][2]= 1;
		for (int i=0;i<map.length ; i++) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
 		
 		T t = new T();
 	// 	t.findway(map,1,1);
		
		// System.out.println("找路后的地图");

		// for (int i=0;i<map.length ; i++) {
		// 	for (int j=0;j<map[i].length ;j++ ) {
		// 		System.out.print(map[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		t.findway2(map,1,1);
		
		System.out.println("改变策略后，找路后的地图");

		for (int i=0;i<map.length ; i++) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
 
 

class T {
	// 使用递归回溯的思想来解决老鼠出迷宫
	// 解读
	// 1.findway方法就是专用来找出迷宫的路径
	// 2.如果找到，返回true，否则返回false
	// 3.map就是二维数组，即表示迷宫
	// 4.i,j就是老鼠的位置，初始化为（1,1），我认为此处可以添加老鼠对象
	// 5.因为我们是递归找路，所以我先规定map数组的各个值的含义：
	//   0 表示可以走 1表示障碍物 2表示走过 3表示走过但走不通
	// 6.当map[6][5]=2 就说明找到通路，就可以结束，否则继续找
	// 7.先确定来时找路策略 下--> 右--> 上--> 左 
	public boolean findway(int[][] map , int i,int j){
		if (map[6][5]==2) {
			return true;
		}else{
			if (map[i][j]==0) {//只有0表示可以走
				map[i][j]=2;
				// 使用找路策略，来确定该位置是否真的可以走通
				if (findway(map,i+1,j)) {
					return true;
				}else if (findway(map,i,j+1)) {
					return true;
				}else if (findway(map,i-1,j)) {
					return true;
				}else if (findway(map,i,j-1)) {
					return true;
				}else{
					map[i][j]=3;
					return false ;
			    }	
			}else{// 1,2,3都无法走了
				return false ;
			}	
		} 
	}

	// 改变找路策略： 上右下左
	public boolean findway2(int[][] map , int i,int j){
		if (map[6][5]==2) {
			return true;
		}else{
			if (map[i][j]==0) {//只有0表示可以走
				map[i][j]=2;
				// 使用找路策略，来确定该位置是否真的可以走通
				if (findway2(map,i-1,j)) {
					return true;
				}else if (findway2(map,i,j+1)) {
					return true;
				}else if (findway2(map,i+1,j)) {
					return true;
				}else if (findway(map,i,j-1)) {
					return true;
				}else{
					map[i][j]=3;
					return false ;
			    }	
			}else{// 1,2,3都无法走了
				return false ;
			}	
		} 
	}
}