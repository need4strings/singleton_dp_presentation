package academy.mindswap.implementations;

// BIG NO NO
public class Eager {

    private static final Eager intance = new Eager();

    private Eager(){}

    public static Eager getInstance() {
        return intance;
    }
}
