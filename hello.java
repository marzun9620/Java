
class Marzun{
      public void printF(){
        System.out.println("I am Marzun::");
      }

}


class Hello {
    public static void main(String arr[]) // String[] arr
    {
        // int x=10;
        // int y=10;
        // boolean res= x==y;
        // System.out.println(res);

        int x = 10;
        int y = 9;
        int a = 10;
        int b = 10;

        // logical operator
        boolean res = (x == y) || (a == b);
        System.err.println(res);

        // ternary operator
        int result = a == b ? 10 : 11;
        System.err.println(result);

        // switch statement

        int n = 1;
        switch (n) {
            case 1:
                System.err.println(1);
                break;
            case 2:
                System.err.println(1);
                break;
            default:
                System.err.println("Default");
                break;
        }

        Marzun m= new Marzun();
        m.printF();
    }
}