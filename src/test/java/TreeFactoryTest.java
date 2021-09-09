import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pp.earth.factory.ConiferFactory;
import pp.earth.factory.HardwoodFactory;
import pp.earth.factory.TreeFactory;
import pp.earth.model.Oak;
import pp.earth.model.Pine;
import pp.earth.model.TreeIf;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static pp.earth.enums.TreeName.OAK;
import static pp.earth.enums.TreeName.PINE;

public class TreeFactoryTest {
    private static final String UNKNOWN_TREE = "Unknown Tree";
    private final TreeFactory hardwoodFactory = new HardwoodFactory();
    private final TreeFactory coniferFactory = new ConiferFactory();

    @Test
    void factoryShouldCreatePineClassObject() {
        // given
        TreeIf pine = coniferFactory.createTree( PINE );

        // then
        Assertions.assertEquals( pine.getClass(), Pine.class );
    }

    @Test
    void factoryShouldCreateOakClassObject() {
        // given
        TreeIf oak = hardwoodFactory.createTree( OAK );

        // then
        Assertions.assertEquals( oak.getClass(), Oak.class );
    }

    @Test
    void factoryShouldThrowException() {
        assertThrows( IllegalArgumentException.class, () -> hardwoodFactory.createTree( UNKNOWN_TREE ) );
        assertThrows( IllegalArgumentException.class, () -> coniferFactory.createTree( UNKNOWN_TREE ) );
    }
}
