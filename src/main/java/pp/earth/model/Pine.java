package pp.earth.model;

import java.util.Random;

import static pp.earth.enums.GrowSpeed.FAST;

public class Pine extends AbstractConifer {
    private static final Integer MAX_GROWN_BRANCHES = 3;
    private static final Random random = new Random();

    public Pine( Trunk aTrunk, int aBranchNumber, int aHeight ) {
        super( aTrunk, aBranchNumber, aHeight );
    }

    @Override
    public void grow() {
        height += FAST;
    }

    @Override
    public int drawNumberOfBranches() {
        return random.nextInt( MAX_GROWN_BRANCHES );
    }

}
