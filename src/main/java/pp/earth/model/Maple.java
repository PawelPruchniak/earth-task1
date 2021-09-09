package pp.earth.model;

import java.util.Random;

import static pp.earth.enums.GrowSpeed.SLOW;


public class Maple extends AbstractHardwood {
    private static final Integer MAX_GROWN_BRANCHES = 3;
    private static final Random random = new Random();

    public Maple( Trunk aTrunk, int aBranchNumber, int aHeight ) {
        super( aTrunk, aBranchNumber, aHeight );
    }

    @Override
    public void grow() {
        height += SLOW;
    }

    @Override
    public int drawNumberOfBranches() {
        return random.nextInt( MAX_GROWN_BRANCHES );
    }
}
