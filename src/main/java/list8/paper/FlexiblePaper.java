package list8.paper;

import list8.pack.Pack;

public class FlexiblePaper extends WrappingPaper {

    public FlexiblePaper(Pack packToWrap) {
        this.wrappedPack = packToWrap;
    }

    @Override
    public String toString() {
        return "FlexiblePaper{" +
                "wrappedPack=" + wrappedPack +
                "} " + super.toString();
    }
}
