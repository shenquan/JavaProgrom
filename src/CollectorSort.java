import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2016/5/1.
 */
public class CollectorSort {

    public static void main(String[] args) {
        Person p1 = new Person(18, "男");
        Person p2 = new Person(16, "女");
        Person p3 = new Person(20, "女");
        Person p4 = new Person(19, "男");
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Collections.sort(list);
//        倒序
//        Collections.sort(list,Collections.reverseOrder());
        for(Person p :list){
            System.out.println(p.getAge());
        }

    }
}

class Person implements Comparable<Person> {
    private int age;
    private String sex;

    public Person() {
    }

    public Person(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();
    }
}