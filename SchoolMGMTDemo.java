import java.util.ArrayList;

public class SchoolMGMTDemo {
    public static void main(String[] args) { 
        // create the parameters needed to create an instance of school class
        ArrayList<Teachers> cppTeachers= new ArrayList<Teachers>(); 
        ArrayList<Students> cppStudents= new ArrayList<Students>();
        School calpolypomona = new School ("Cal Poly Pomona", cppTeachers,cppStudents); 
        // create instances of teachers and students then add them into their resprective arraylists
        Teachers neb = new Teachers ("Neb", 60000,98066); 
        Teachers sam = new Teachers ("sam", 85000,97766); 
        Teachers janice = new Teachers ("Janice", 80000,1122723); 
        cppTeachers.add(neb); 
        cppTeachers.add(sam); 
        cppTeachers.add(janice); 
        Students francisco= new Students("Francsico", "RS 3030, CS1400, CS1300", 3700,13000);
        Students tim= new Students("Tim", "BIO 3010, CS3010", 1500,20000);
        Students vanessa= new Students("Vanessa", "BIO 1110, BIO 1110-L, CS1300", 6400,25000);
        cppStudents.add(francisco); 
        cppStudents.add(tim); 
        cppStudents.add(vanessa); 
        // toString method to demonstrate how it works
        System.out.println(calpolypomona.toString()); 
    }
    
}
