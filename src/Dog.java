public class Dog extends Animals {

    public Dog(String name){
        super(name);
    }

    @Override
    public void run(int length) {
        // Ограничение бега для собаки: 500 м.
        if (length <= 500) {
            super.run(length);
        } else {
            System.out.println(name + " не может пробежать " + length + " м. (Максимум: 500 м.)");
        }
    }

    @Override
    public void swim(int length) {
        // Ограничение плавания для собаки: 10 м.
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println(name + " не может проплыть " + length + " м. (Максимум: 10 м.)");
        }
    }
}
