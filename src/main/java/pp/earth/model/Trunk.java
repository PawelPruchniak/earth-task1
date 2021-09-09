package pp.earth.model;

import pp.earth.enums.BarkColor;

public class Trunk {
    private final BarkColor barkColor;

    public Trunk( BarkColor aBarkColor ) {
        barkColor = aBarkColor;
    }

    public BarkColor getBarkColor() {
        return barkColor;
    }
}
