package list_8_1_b.paper;

import list_8_1_b.Present;

public class StiffPaper extends WrappingPaper {

    public StiffPaper(Present presentToPack) {
        this.wrappedPresent = presentToPack;
    }

    @Override
    public String toString() {
        return "StiffPaper{} " + super.toString();
    }
}
