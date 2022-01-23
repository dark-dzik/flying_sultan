package list_11.a;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cup {

    private final int maximumCapacity;

    private int currentDrinkAmount;

    public Cup(int maximumCapacity, int currentDrinkAmount) {
        this.maximumCapacity = maximumCapacity;
        this.currentDrinkAmount = currentDrinkAmount;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public int getCurrentDrinkAmount() {
        return currentDrinkAmount;
    }

    public void setCurrentDrinkAmount(int currentDrinkAmount) {
        this.currentDrinkAmount = currentDrinkAmount;
    }

    public void fill() {
        currentDrinkAmount = maximumCapacity;
    }
}
