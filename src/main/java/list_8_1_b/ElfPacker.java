package list_8_1_b;

import list_8_1_b.paper.ArtPaper;
import list_8_1_b.paper.FlexiblePaper;
import list_8_1_b.paper.StiffPaper;
import list_8_1_b.paper.WrappingPaper;
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

    public WrappingPaper wrapPresent(Present presentToPack) {
        double packSurfaceAreaWithOverlaps = calculateSurfaceAreaConsideringOverlaps(presentToPack);

        if(packSurfaceAreaWithOverlaps <= artPaperThreshold) {
            return new ArtPaper(presentToPack);
        } else if (packSurfaceAreaWithOverlaps <= flexiblePaperThreshold) {
            return new FlexiblePaper(presentToPack);
        } else {
            return new StiffPaper(presentToPack);
        }
    }

    private static double calculateSurfaceAreaConsideringOverlaps(Present present) {
        double packSurfaceArea = present.calculateSurfaceArea();
        log.info("Pack type: {}, pack surface area: {}", present.getClass(), packSurfaceArea);
        return packSurfaceArea + OVERLAPS_PERCENTAGE * packSurfaceArea;
    }
}
