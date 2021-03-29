public class Cat extends Animal{
     static int countCats=0;

    public Cat(String name,String color) {
        this.name=name;
        this.color=color;
        countCats++;
    }

    @Override
    public void swim(int d) {
         System.out.println("кот не умеет плавать");
    }
    public void run(int d) {
        if (d<200) System.out.println(this.name+ " пробежал "+ d +" метров");
        else System.out.println(this.name + " не может бежать, слишком большое расстояние");
    }



}
