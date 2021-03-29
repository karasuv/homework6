public class Animal {
      protected   String name;
      protected String color;
     static int countAnimals=0;
Animal(){
    countAnimals++;
}

    public void swim (int d) {
        System.out.println("animal is swimming...");
    }
    public void run (int d) {
        System.out.println("animal is running...");
    }


}
