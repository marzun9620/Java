
class Computer {
    int array[] = new int[5];
    public void playMusic() {};
    String name;

}

public class java_1 {
    public static void main1(String a[]) {

        Computer c1=new Computer();
        Computer c2=new Computer();
        Computer c3=new Computer();

        c1.name="HP";
        c2.name="SONY";
        c3.name="ASUS";

        Computer cs[]=new Computer[3];
        cs[0]=c1;
        cs[1]=c2;
        cs[2]=c3;

        for(Computer n: cs){
            System.out.println(n.name+" ");
        }
        

    }

}
