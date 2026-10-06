
public class Main {
    public static void main(String[] args) {
        Animals dogBobik = new Dog("Бобик");
        Animals catBarsik = new Cat("Барсик");

        dogBobik.run(150);
        dogBobik.swim(10);
        dogBobik.swim(15);

        catBarsik.run(200);
        catBarsik.swim(5);
        catBarsik.swim(5);

        System.out.println("Всего животных: " + Animals.getAnimalsCount());

        Cat.addFoodToPlate(30);

        Cat catAppetite1 = new Cat("Мурзик");
        catAppetite1.setAppetite(10);

        Cat catAppetite2 = new Cat("Пушок");
        catAppetite2.setAppetite(15);

        Cat catAppetite3 = new Cat("Рыжик");
        catAppetite3.setAppetite(12);

        Cat[] cats = { catAppetite1, catAppetite2, catAppetite3 };

        for (Cat cat : cats) {
            cat.eat();
            System.out.println(cat.name + " сыт: " + cat.isFull());
        }

        //Второе задание
        Circle circle = new Circle(5.0, "Красный", "Черный");
        System.out.println("Фигура: " + circle.getName());
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Цвет фона: " + circle.getFillColor());
        System.out.println("Цвет границ: " + circle.getBorderColor());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
        System.out.println("Фигура: " + rectangle.getName());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Цвет фона: " + rectangle.getFillColor());
        System.out.println("Цвет границ: " + rectangle.getBorderColor());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");
        System.out.println("Фигура: " + triangle.getName());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Цвет фона: " + triangle.getFillColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());
    }
}