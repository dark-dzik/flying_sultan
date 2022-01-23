package list_11.b;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Kettle {

    private static final long WATER_POURING_TIME = 2000;

    private static final long WATER_BOILING_TIME = 10000;

    private final int maximumCapacity;

    private int currentWaterAmount;

    public Kettle(int maximumCapacity, int currentWaterAmount) {
        this.maximumCapacity = maximumCapacity;
        this.currentWaterAmount = currentWaterAmount;
    }

    public int getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(int currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }

    public void fillAndBoil() throws InterruptedException {
        log.info("Kettle starts boiling water.");
        Thread.sleep(WATER_BOILING_TIME);
        currentWaterAmount = maximumCapacity;
        log.info("Kettle has boiled the water.");
    }

}
