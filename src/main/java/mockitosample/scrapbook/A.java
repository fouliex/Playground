package mockitosample.scrapbook;

/**
 * Created by 212361198 on 8/20/16.
 */
public class A {

    private B b;

    public A(B b) {
        this.b = b;
    }

    public int useVoidMethod() {
        try {
            b.voidMethod();
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return 1;
    }
}
