package list8.paper;

import list8.pack.Pack;

public class FlexiblePaper extends WrappingPaper {

    public FlexiblePaper(Pack packToWrap) {
        super(packToWrap);
    }

    @Override
    public String toString() {
        return "FlexiblePaper{" +
                "wrappedPack=" + wrappedPack +
                "} " + super.toString();
    }
}
