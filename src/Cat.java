public class Cat extends Animal{
    private static int catCount =0;
    private boolean isFull = false;
    public Cat(String name){
        super(name,200,0);
        catCount++;
    }
    public static int getCatCount(){
        return catCount;
    }
    @Override
    public void swim(int dist){
        System.out.println(name + " не умеет плавать.");
    }
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не поел, еды недостаточно.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
