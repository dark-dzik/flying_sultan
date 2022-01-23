package list_11.a;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;

@Slf4j
public class Kettle {

    private static final long WATER_POURING_TIME = 2000;

    private static final long WATER_BOILING_TIME = 10000;

    private final int maximumCapacity;

    private int currentWaterAmount;

    private boolean boilingWater;

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

    public boolean isBoilingWater() {
        return boilingWater;
    }

    public void boilWater() throws InterruptedException {
        log.info("Kettle starts boiling water.");
        boilingWater = true;
        Thread.sleep(WATER_BOILING_TIME);
        boilingWater = false;
        log.info("Kettle has boiled the water.");
    }

    public void fill() {
        currentWaterAmount = maximumCapacity;
    }



}
