public class Animals {
    String name;
    private static int animalsCount = 0;
    public Animals() {
        animalsCount++;
    }

    public Animals(String name) {
        this.name = name;
        animalsCount++;
    }
    public static int getAnimalsCount() {
        return animalsCount;
    }


    public void run(int length) {
        System.out.println(name + " пробежал " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл " + length + " м.");
    }
}
