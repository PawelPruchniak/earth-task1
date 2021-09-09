package pp.earth.enums;

public class GrowSpeed {
    public static final Integer SLOW = 1;
    public static final Integer MEDIUM = 2;
    public static final Integer FAST = 3;

    private static final String EXCEPTION_MESSAGE = "Utility class";

    private GrowSpeed() {
        throw new IllegalStateException( EXCEPTION_MESSAGE );
    }
}
