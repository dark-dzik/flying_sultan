package list_8_1_b.paper;

import list_8_1_b.Present;

public class ArtPaper extends WrappingPaper {

    public ArtPaper(Present packToWrap) {
        this.wrappedPresent = packToWrap;
    }

    @Override
    public String toString() {
        return "ArtPaper{" +
                "wrappedPack=" + wrappedPresent +
                "} " + super.toString();
    }
}
