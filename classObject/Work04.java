// �и���Tom ������ĳ�Ա���� ��Ա���� 
// �õ��Բ�ȭ��ÿ�ζ����������0��1,2
// 0��ʾʯͷ 1��ʾ�� 2��ʾ��
// ��Ҫ��ʾTom����Ӯ����
// 
// 
import java.util.Scanner;
public class Work04{
	public static void main(String[] args){
		Stone s = new Stone();
		s.win();
	}
}
// 1.��ʾ����
// 2.������
// 3.���������
// 4.���бȽϣ������� �����+1����TomӮ��Ӯ����+1�����������棩
// 5.��ʾ�Ƿ������Ϸ
// 6.������y/n
// 7.  ����y :�ظ���1��   ����n :����ѭ��������ʾ��Ϸ��������� ��Ӯ����
class Stone {
	char yn;
	int person;
	int computer;
	int winnum=0;
	int losenum=0;
	Scanner myScanner = new Scanner(System.in);
	public void win(){
		do{
			System.out.println("������ʯͷ��������");
			person=myScanner.nextInt();
			System.out.println("Tom��ֵ�� "+person);
			computer=(int)(Math.random()*3);
			System.out.println("���Ե�ֵ�� "+computer);

			if (person==computer) {
				System.out.println("����ƽ�֣�TomӮ�� "+winnum+"��,����"+losenum+"��");
			}else if(person==0 && computer==1 || person==1 && computer==2 ||
				person==2 && computer==0 ){
				winnum++;
				System.out.println("����TomӮ��TomӮ�� "+winnum+"��,����"+losenum+"��");
			}else if(person==0 && computer==2 || person==1 && computer==0 ||
				person==2 && computer==1 ){
				losenum++;
				System.out.println("���ε���Ӯ��TomӮ�� "+winnum+"��,����"+losenum+"��");
			}else{
				System.out.println("Tom ���������");
			}
			System.out.println("�Ƿ������Ϸ��y/n");
			yn=myScanner.next().charAt(0);
		}while(yn=='y');
		System.out.println("��Ϸ����");
	} 
}