package list_8_1_a;

import list_8_1_a.pack.Pack;
import list_8_1_a.paper.ArtPaper;
import list_8_1_a.paper.FlexiblePaper;
import list_8_1_a.paper.StiffPaper;
import list_8_1_a.paper.WrappingPaper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ElfPacker {

    private static final double OVERLAPS_PERCENTAGE = 0.05;

    private double artPaperThreshold;

    private double flexiblePaperThreshold;

    public ElfPacker(double artPaperThreshold, double flexiblePaperThreshold) {
        this.artPaperThreshold = artPaperThreshold;
        this.flexiblePaperThreshold = flexiblePaperThreshold;
    }

    public double getArtPaperThreshold() {
        return artPaperThreshold;
    }

    public void setArtPaperThreshold(double artPaperThreshold) {
        this.artPaperThreshold = artPaperThreshold;
    }

    public double getFlexiblePaperThreshold() {
        return flexiblePaperThreshold;
    }

    public void setFlexiblePaperThreshold(double flexiblePaperThreshold) {
        this.flexiblePaperThreshold = flexiblePaperThreshold;
    }

    public Present wrapPresent(String content, Pack pack) {
        Present present = new Present();
        present.setContent(content);
        present.setPack(pack);
        present.setPaper(pickWrappingPaper(pack));
        return present;
    }

    private WrappingPaper pickWrappingPaper(Pack packWithPresent) {
        double packSurfaceAreaWithOverlaps = calculateSurfaceAreaConsideringOverlaps(packWithPresent);

        if(packSurfaceAreaWithOverlaps <= artPaperThreshold) {
            return new ArtPaper();
        } else if (packSurfaceAreaWithOverlaps <= flexiblePaperThreshold) {
            return new FlexiblePaper();
        } else {
            return new StiffPaper();
        }
    }

    private static double calculateSurfaceAreaConsideringOverlaps(Pack packWithPresent) {
        double packSurfaceArea = packWithPresent.calculateSurfaceArea();
        double packSurfaceAreaWithOverlaps = packSurfaceArea + OVERLAPS_PERCENTAGE * packSurfaceArea;
        log.info("Pack type: {}, pack surface area with overlaps: {}", packWithPresent.getClass(), packSurfaceArea);
        return packSurfaceAreaWithOverlaps;
    }
}
