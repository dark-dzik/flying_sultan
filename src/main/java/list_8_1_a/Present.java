package list_8_1_a;

import list_8_1_a.pack.Pack;
import list_8_1_a.paper.WrappingPaper;

public class Present {

    private String content;

    private Pack pack;

    private WrappingPaper paper;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public WrappingPaper getPaper() {
        return paper;
    }

    public void setPaper(WrappingPaper paper) {
        this.paper = paper;
    }

    @Override
    public String toString() {
        return "Present{" +
                "content='" + content + '\'' +
                ", pack=" + pack +
                ", paper=" + paper +
                '}';
    }
}
