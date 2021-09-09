package pp.earth.model;

import java.util.Random;

import static pp.earth.enums.GrowSpeed.MEDIUM;

public class Birch extends AbstractHardwood {
    private static final Integer MAX_GROWN_BRANCHES = 4;
    private static final Random random = new Random();

    public Birch( Trunk aTrunk, int aBranchNumber, int aHeight ) {
        super( aTrunk, aBranchNumber, aHeight );
    }

    @Override
    public void grow() {
        super.grow();
        height += MEDIUM;
    }

    @Override
    public int drawNumberOfBranches() {
        return random.nextInt( MAX_GROWN_BRANCHES );
    }
}
