package pp.earth.factory;

import pp.earth.model.Trunk;

import static pp.earth.enums.BarkColor.DARK_BROWN;
import static pp.earth.enums.BarkColor.DARK_GREY;
import static pp.earth.enums.BarkColor.GREY;
import static pp.earth.enums.BarkColor.RED_BROWN;
import static pp.earth.enums.BarkColor.WHITE;
import static pp.earth.enums.TreeName.BIRCH;
import static pp.earth.enums.TreeName.MAPLE;
import static pp.earth.enums.TreeName.OAK;
import static pp.earth.enums.TreeName.PINE;
import static pp.earth.enums.TreeName.SPRUCE;

public class TrunkFactory {
    private static final String EXCEPTION_MESSAGE = "There is no trunk with that name";
    private static final String CONSTRUCTOR_MESS_EXC = "Utility class";

    private TrunkFactory() {
        throw new IllegalStateException( CONSTRUCTOR_MESS_EXC );
    }

    public static Trunk createTrunk( String aTree ) {
        switch ( aTree ) {
            case PINE:
                return new Trunk( RED_BROWN );
            case SPRUCE:
                return new Trunk( GREY );
            case OAK:
                return new Trunk( DARK_BROWN );
            case BIRCH:
                return new Trunk( WHITE );
            case MAPLE:
                return new Trunk( DARK_GREY );
            default:
                throw new IllegalArgumentException( EXCEPTION_MESSAGE );
        }
    }
}
