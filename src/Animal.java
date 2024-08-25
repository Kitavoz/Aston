public class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    private static int count = 0;
    public Animal(String name, int runLimit, int swimLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }
    public void run(int dist){
        if(dist<=runLimit){
            System.out.println(name + " пробежал " + dist + " метров.");
        }
        else{
            System.out.println(name + " не пробежал " + dist + " метров.");
        }
    }
    public void swim(int dist){
        if(dist<=swimLimit){
            System.out.println(name + " проплыл " + dist + " метров.");
        }
        else{
            System.out.println(name + " не проплыл " + dist + " метров.");
        }
    }
    public static int getCount(){
        return count;
    }
}
