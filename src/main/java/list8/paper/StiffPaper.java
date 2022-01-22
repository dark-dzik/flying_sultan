package list8.paper;

import list8.pack.Pack;

public class StiffPaper extends WrappingPaper {

    public StiffPaper(Pack presentToPack) {
        this.wrappedPack = presentToPack;
    }

    @Override
    public String toString() {
        return "StiffPaper{} " + super.toString();
    }
}
