package pp.earth.enums;

public class TreeName {
    public static final String PINE = "Pine";
    public static final String OAK = "Oak";
    public static final String BIRCH = "Birch";
    public static final String SPRUCE = "Spruce";
    public static final String MAPLE = "Maple";

    private static final String EXCEPTION_MESSAGE = "Utility class";

    private TreeName() {
        throw new IllegalStateException( EXCEPTION_MESSAGE );
    }
}
