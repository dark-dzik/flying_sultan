package list8;

import list8.pack.Pack;
import list8.paper.ArtPaper;
import list8.paper.FlexiblePaper;
import list8.paper.StiffPaper;
import list8.paper.WrappingPaper;
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

    public WrappingPaper wrapPresent(Pack packWithPresent) {
        double packSurfaceAreaWithOverlaps = calculateSurfaceAreaConsideringOverlaps(packWithPresent);

        if(packSurfaceAreaWithOverlaps <= artPaperThreshold) {
            return new ArtPaper(packWithPresent);
        } else if (packSurfaceAreaWithOverlaps <= flexiblePaperThreshold) {
            return new FlexiblePaper(packWithPresent);
        } else {
            return new StiffPaper(packWithPresent);
        }
    }

    private static double calculateSurfaceAreaConsideringOverlaps(Pack packWithPresent) {
        double packSurfaceArea = packWithPresent.calculateSurfaceArea();
        log.info("Pack type: {}, pack surface area: {}", packWithPresent.getClass(), packSurfaceArea);
        return packSurfaceArea + OVERLAPS_PERCENTAGE * packSurfaceArea;
    }
}
