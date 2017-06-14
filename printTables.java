/**
 * Created by kimmejares on 08/06/2017.
 */
public class printTables {

    public static void table (int t) {

        for  (int i=1; i <= 10; i++) {

            System.out.println(t * i);
        }
    }

    public static void main(String[] args) {

        table(10);
    }
}
