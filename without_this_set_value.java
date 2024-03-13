
class Computer {
    private int age;

    public void setAge(int age, Computer obj) {
        Computer obj1 = obj;
        obj1.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class without_this_set_value {
    public static void main(String a[]) {
        Computer obj1 = new Computer();
        obj1.setAge(10, obj1);
        System.out.println(obj1.getAge());

    }

}
