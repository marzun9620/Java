public class try_catch {
    public static void main1(String a[]) {
        int i = 9;
        int j = 0;
        try {
            int res = i / j;
        } catch (ArithmeticException e) {

            System.out.println("null");
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (Exception e) {
            System.err.println(e);
        }

    }

}
