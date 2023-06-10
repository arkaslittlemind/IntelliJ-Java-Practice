package Getters_Setters;

class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }
     public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name = name;
     }

     public String getNationality() {
        return nationality;
     }

     public void setNationality(String nationality) {
        this.nationality = nationality;
     }

     public String getDateOfBirth() {
        return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
     }

     public int getSeatNumber() {
        return seatNumber;
     }

     public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
     }
}

public class task {
    public static void main(String[] args) {
        Person person = new Person("Yash Runnoo", "Mauritian", "01/01/2011", 5);

        person.setSeatNumber(10);

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    }

}
