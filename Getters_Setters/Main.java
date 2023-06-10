package Getters_Setters;


public class Main {
    public static void main(String[] args) {
        Car Nissan = new Car("Nissan", 10000, 2020, "Green");

        Car Nissan2 = new Car(Nissan);

        Nissan2.setColor("Yellow");
        Nissan2.setColor("Orange");
        Nissan2.setColor("Blue");
        Nissan2.setColor("Purple");
        Nissan2.setColor("Fuchsia");
        Nissan2.setColor("Beige");

        //System.out.println(Nissan2.getColor() + "\n" + Nissan2.getColor());

        Car Datsun = new Car("Datsun", 11000, 2023, "Blue");


        //System.out.println("This " + Nissan.getMake() + " is worth $" + Nissan.getPrice() + ". It was built in " + Nissan.getYear() + ". It is " + Nissan.getColor() + ".\n" );
        //System.out.println("This " + Datsun.getMake() + " is worth $" + Datsun.getPrice() + ". It was built in " + Datsun.getYear() + ". It is " + Datsun.getColor() + ".\n" );

        //Nissan.setColor("Matte Black");
        //Datsun.setColor("Crimson Red");

        //Nissan.setPrice(12300);
        //Datsun.setPrice(14200);

        //Nissan.setYear(2021);
        //Datsun.setYear(2019);

        //System.out.println("Updated Values -|-" + "\n");

        System.out.println("This " + Nissan.getMake() + " is worth $" + Nissan.getPrice() + ". It was built in " + Nissan.getYear() + ". It is " + Nissan.getColor() + ".\n" );
        System.out.println("This " + Datsun.getMake() + " is worth $" + Datsun.getPrice() + ". It was built in " + Datsun.getYear() + ". It is " + Datsun.getColor() + ".\n" );
    }
}
