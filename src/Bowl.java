public class Bowl {
    private int foodAmount;

    public Bowl(int initialAmount) {
        this.foodAmount = Math.max(initialAmount, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}