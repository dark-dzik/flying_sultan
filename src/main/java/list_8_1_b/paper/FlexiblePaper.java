package list_8_1_b.paper;

import list_8_1_b.Present;

public class FlexiblePaper extends WrappingPaper {

    public FlexiblePaper(Present packToWrap) {
        this.wrappedPresent = packToWrap;
    }

    @Override
    public String toString() {
        return "FlexiblePaper{" +
                "wrappedPack=" + wrappedPresent +
                "} " + super.toString();
    }
}
