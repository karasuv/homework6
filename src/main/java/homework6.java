public class homework6 {



    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик","Белый");
        Cat cat2 = new Cat("Пушок","Рыжий");
        Dog dog1 = new Dog("Зевс","черный");
        Dog dog2 = new Dog("Шарик","Серый");
        Dog dog3 = new Dog("Бобик","Серобуромалиновый");
        Animal animal1 = new Animal();


        cat1.swim(15);
        cat1.run(100);
        cat1.run(250);
        System.out.println();
        dog1.swim(5);
        dog1.swim(50);
        dog1.run(400);
        dog1.run(1000);
        System.out.println();
        animal1.swim(1);
        animal1.run(1);


        ///скорее всего я не понял задачу про просчет созданных животных\котов\собак
        ///либо не очень понимаю как просчет можно сделать другим способом...

        System.out.println("кол-во животных: " + Animal.countAnimals+ " кол-во котов: " + Cat.countCats+ " кол-во собак: " + Dog.countDogs);

    }
}
