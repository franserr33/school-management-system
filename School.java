import java.util.ArrayList;
public class School {
    private static int totalMoneyCollected; 
    private static int totalMoneySpent; 
    private ArrayList <Teachers> ourTeachers; 
    private ArrayList<Students> ourStudents;
    private String schoolName;  
    /**
     * Create a class for Schools to hold some basic information
     * @param totalMoneyCollected to hold all the money the school collected through fees
     * @param totalMoneySpent to hold all the money the school spends on instruction for the scope of this program
     * @param ourTeachers to hold all the teachers/professors/instructors
     * @param ourStudents to hold the student body 
     * @param schoolName to hold the school's name 
     */
// Default constructor 
    public School() { 
        totalMoneyCollected=0; 
        totalMoneySpent=0; 
        ourTeachers= new ArrayList<Teachers>(); 
        ourStudents= new ArrayList<Students>();
        schoolName=null; 
    }
// constructor
    public School (String schoolName,ArrayList<Teachers> ourTeachers , ArrayList<Students> ourStudents) { 
        this.schoolName=schoolName;
        this.ourTeachers=ourTeachers; 
        this.ourStudents=ourStudents; 
        totalMoneyCollected=0;
        totalMoneySpent=0; 

    }
    // standard setters and getters
    public void setTotalCollected(int totalMoneyCollected) { 
        School.totalMoneyCollected=totalMoneyCollected; 
    }
    public int getTotalCollected() { 
        return totalMoneyCollected; 
    }
    public void updateMoneyCollected(int moneycollected) { 
        totalMoneyCollected+=moneycollected; 
    }
    public void setMoneySpent(int totalMoneySpent) { 
        School.totalMoneySpent=totalMoneySpent; 
    }
    public int getMoneySpent() { 
        return totalMoneySpent; 
    }
    public void updateMoneySpent(int moneySpent) { 
        totalMoneySpent+=moneySpent;
    }
    public void setTeachers(ArrayList<Teachers> ourTeachers) { 
        this.ourTeachers=ourTeachers; 
    }
    public ArrayList<Teachers> getTeachers() { 
        return ourTeachers; 
    }
    public void setStudents(ArrayList<Students> ourStudents) { 
        this.ourStudents=ourStudents; 
    }
    public ArrayList<Students> getStudents() { 
        return ourStudents; 
    }
    public static void addToCollected(int studentFeePaid) { 
        totalMoneyCollected+=studentFeePaid;
    }
    public static void addToSpend(int costOfInstruction ) { 
        totalMoneySpent+= costOfInstruction; 
    }
    // wrote my own toString method
    @Override 
    public String toString() { 
        String description = " We at "+schoolName+", have spent: "+totalMoneySpent+
        "\n We have earned: "+ totalMoneyCollected;
        return description;
    }










    
    
}
