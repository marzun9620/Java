class Mobile {
    String Name;
    int price;
    static String company;
    static {
        company = "SAMSUNG";
    }

    public static void returnName(Mobile obj) {
        System.out.println(obj.company);
    }

}

public class java_static_methods {
    public static void main(String a[]) {
        Mobile m = new Mobile();
        m.Name = "J10";
        m.price = 1200;
        m.company = "APPLE";

        m.returnName(m);

    }

}
