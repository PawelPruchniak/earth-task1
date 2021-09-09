package pp.earth.factory;

import pp.earth.model.AbstractConifer;
import pp.earth.model.Pine;
import pp.earth.model.Spruce;

import static pp.earth.enums.TreeName.PINE;
import static pp.earth.enums.TreeName.SPRUCE;

public class ConiferFactory implements TreeFactory {
    private static final String EXCEPTION_MESSAGE = "There is no tree with that name";

    public AbstractConifer createTree( String aName ) {
        switch ( aName ) {
            case PINE:
                return new Pine( TrunkFactory.createTrunk( PINE ), 3, 3 );
            case SPRUCE:
                return new Spruce( TrunkFactory.createTrunk( SPRUCE ), 10, 2 );
            default:
                throw new IllegalArgumentException( EXCEPTION_MESSAGE );
        }
    }
}
