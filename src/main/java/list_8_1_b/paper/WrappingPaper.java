package list_8_1_b.paper;

import list_8_1_b.Present;

public abstract class WrappingPaper {

    protected Present wrappedPresent;

    public Present getWrappedPresent() {
        return wrappedPresent;
    }

    public void setWrappedPresent(Present wrappedPresent) {
        this.wrappedPresent = wrappedPresent;
    }

    @Override
    public String toString() {
        return "WrappingPaper{" +
                "wrappedPresent=" + wrappedPresent +
                '}';
    }
}
