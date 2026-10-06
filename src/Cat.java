public class Cat extends Animals {
    private static int plateFood = 0;
    private boolean isFull = false;
    private int appetite = 0;

    public Cat(String name) {
        super(name);
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public static void addFoodToPlate(int amount) {
        if (amount > 0) {
            plateFood += amount;
            System.out.println("Добавлено " + amount + " еды. Всего: " + plateFood);
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat() {
        if (this.appetite <= plateFood) {
            plateFood -= this.appetite;
            this.isFull = true;
        } else {
            System.out.println("Мало еды");
        }
    }

    @Override
    public void run(int length) {
        // Ограничение бега для кота: 200 м.
        if (length <= 200) {
            super.run(length);
        } else {
            System.out.println(name + " не может пробежать более 200м");
        }
    }

    @Override
    public void swim(int length) {
        // Кот не умеет плавать
        System.out.println(name + " не умеет плавать!");
    }
}
