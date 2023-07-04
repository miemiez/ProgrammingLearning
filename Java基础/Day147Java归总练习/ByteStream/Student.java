package Day147Java归总练习;

import java.io.Serial;
import java.io.Serializable;
import java.rmi.server.UID;

/*
 Serializable接口里面是没有抽象方法的，标记型接口，
 一旦实现了这个接口，那么热就表示当前的Student类可以背序列化

 理解：
 一个物品的合格证一样，有了就可以被序列化
 */

public class Student implements Serializable {
    private static final long serialVersionUID = 8994036118221621211L;
    private String name;
    private int age;

    //private static final long serialVersionUID = 122l;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

