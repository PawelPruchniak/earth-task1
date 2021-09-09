package pp.earth.factory;

import pp.earth.model.AbstractHardwood;
import pp.earth.model.Birch;
import pp.earth.model.Maple;
import pp.earth.model.Oak;

import static pp.earth.enums.TreeName.BIRCH;
import static pp.earth.enums.TreeName.MAPLE;
import static pp.earth.enums.TreeName.OAK;

public class HardwoodFactory implements TreeFactory {
    private static final String EXCEPTION_MESSAGE = "There is no tree with that name";

    public AbstractHardwood createTree( String aName ) {
        switch ( aName ) {
            case OAK:
                return new Oak( TrunkFactory.createTrunk( OAK ), 7, 1 );
            case BIRCH:
                return new Birch( TrunkFactory.createTrunk( BIRCH ), 5, 2 );
            case MAPLE:
                return new Maple( TrunkFactory.createTrunk( MAPLE ), 4, 2 );
            default:
                throw new IllegalArgumentException( EXCEPTION_MESSAGE );
        }
    }
}
