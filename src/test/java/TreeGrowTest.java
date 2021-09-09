import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pp.earth.enums.GrowSpeed;
import pp.earth.factory.ConiferFactory;
import pp.earth.factory.HardwoodFactory;
import pp.earth.factory.TreeFactory;
import pp.earth.model.TreeIf;

import static org.mockito.Mockito.when;
import static pp.earth.enums.TreeName.BIRCH;
import static pp.earth.enums.TreeName.OAK;
import static pp.earth.enums.TreeName.PINE;

public class TreeGrowTest {

    private static final Integer grownBranches = 3;
    private final TreeFactory hardwoodFactory = new HardwoodFactory();
    private final TreeFactory coniferFactory = new ConiferFactory();

    @Test
    void pineShouldGrowFast() {
        // given
        TreeIf pine = coniferFactory.createTree( PINE );
        int pineHeight = pine.getHeight();

        // when
        pine.grow();

        // then
        Assertions.assertEquals( pineHeight + GrowSpeed.FAST, pine.getHeight() );
    }

    @Test
    void oakShouldGrowSlow() {
        // given
        TreeIf oak = hardwoodFactory.createTree( OAK );
        int oakHeight = oak.getHeight();

        // when
        oak.grow();

        // then
        Assertions.assertEquals( oakHeight + GrowSpeed.SLOW, oak.getHeight() );
    }

    @Test
    void birchShouldGrowFast() {
        // given
        TreeIf birch = hardwoodFactory.createTree( BIRCH );
        int birchHeight = birch.getHeight();

        // when
        birch.grow();

        // then
        Assertions.assertEquals( birchHeight + GrowSpeed.MEDIUM, birch.getHeight() );
    }

    @Test
    void treeShouldGrowBranches() {
        // given
        TreeIf birch = Mockito.spy( hardwoodFactory.createTree( BIRCH ) );
        when( birch.drawNumberOfBranches() ).thenReturn( grownBranches );
        int birchBranchNumber = birch.getBranchNumber();

        // when
        birch.grow();

        // then
        Assertions.assertEquals( birchBranchNumber + grownBranches, birch.getBranchNumber() );
    }

}
