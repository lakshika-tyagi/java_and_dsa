package interfaces.nested;

public class A {
    //    nested interface
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
