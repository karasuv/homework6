public class Dog extends Animal{
     static int countDogs=0;
    public Dog(String name,String color) {
        this.name=name;
        this.color=color;
        countDogs++;
    }

    @Override
    public void swim(int d) {
        if (d<10) System.out.println(this.name+ " проплыл "+ d +" метров");
        else System.out.println(this.name + " не может бежать, слишком большое расстояние");
    }
    public void run(int d) {
        if (d<500) System.out.println(this.name+ " пробежал "+ d +" метров");
        else System.out.println(this.name + " не может бежать, слишком большое расстояние");
    }

}
