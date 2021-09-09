package pp.earth.model;

import pp.earth.enums.LeafType;

public abstract class AbstractConifer implements TreeIf {
    private static final LeafType leafType = LeafType.LEAF;
    protected int height;
    private Trunk trunk;
    private int branchNumber;

    protected AbstractConifer( Trunk aTrunk, int aBranchNumber, int aHeight ) {
        trunk = aTrunk;
        branchNumber = aBranchNumber;
        height = aHeight;
    }

    @Override
    public void grow() {
        var grownBranches = drawNumberOfBranches();
        branchNumber += grownBranches;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getBranchNumber() {return branchNumber;}

    public Trunk getTrunk() {
        return trunk;
    }
}
