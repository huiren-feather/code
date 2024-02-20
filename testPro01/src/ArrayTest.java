import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        MyTools mytools = new MyTools();
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 1};
        mytools.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
    }
}
class Person{
    String name;
    int age;
//    构造器--alt + insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
class MyTools {
    //    冒泡排序
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}