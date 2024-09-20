public class Activity{
    public static void main(String[] args) {
    
    Dog puppy = new Dog();

    puppy.setName("Richelle");

    System.out.println(puppy.showName());

    puppy.bark();

    puppy.listofpuppies = new String[] {"Herssy", "Kisses", "Septic", "Lucia"};
    
    int shownumber = puppy.show_numofpuppies();

    System.out.println("Number of Puppies: " + shownumber);

    puppy.show_numofpuppies();

    puppy.showpuppies();
    

    }
}

