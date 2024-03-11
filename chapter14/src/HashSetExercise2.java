import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("sun",7778,new Mydate(2000,10,31)));
        hashSet.add(new Employee2("xy",7778,new Mydate(2000,10,31)));
        hashSet.add(new Employee2("sun",7778,new Mydate(2000,10,31)));
//        3个元素
        System.out.println("hashset="+hashSet);
    }
}

class Employee2 {
   private String name;
   private double sal;
   private Mydate birthday;

    public Employee2(String name, double sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }
    //     如果name,birthday和sal值相同，则返回相同的hash值


    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Double.compare(employee2.sal, sal) == 0 &&
                Objects.equals(name, employee2.name) &&
                Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }
}

class Mydate{
    private int year;
    private int month;
    private int day;

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return year == mydate.year &&
                month == mydate.month &&
                day == mydate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}