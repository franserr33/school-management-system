public class Students {
    private String name; 
    private String classes; 
    private int feesOwed; 
    private int feesPaid;
    private double GPA; 
    private int studentID;

/**
 * Creating a new student and holding their attributes
 * @param name to hold each student's ID 
 * @param classes to hold their course load
 * @param feesOwed to store how much each currently owes
 * @param feesPaid to track how much each has paid
 * @param GPA holds their cummulative GPA
 * @param studentID unique numerical identifier
 */
// Standard constructor i will be using
 public Students(String name, String classes, int feesOwed, int feesPaid) { 
    this.name=name; 
    studentID=0; 
    GPA=0.0; // set GPA after first term then use the set method to change accordingly 
    this.feesOwed=feesOwed; 
    this.feesPaid=feesPaid;
    this.classes=classes;
    School.addToCollected(feesPaid);
 }
 public Students() { 
    name=null; 
    studentID=0;
    GPA=0.0; 
    feesOwed=0;
    feesPaid=0;
    classes=null;
 }
// standard setters and getters to change or retriece object attributes
public void setName(String name) { 
        this.name=name; 
    }
public String getName() { 
        return name; 
    }
public void setClasses(String classes ) { 
        this.classes=classes; 
    }
public String getClasses() { 
        return classes; 
    }
public void setfeesOwed(int feesOwed) { 
        this.feesOwed=feesOwed; 
    }
public int getfeesOwed() { 
        return feesOwed; 
    }
public void setfeesPaid(int feesPaid) { 
        this.feesPaid=feesPaid; 
    }
public int getfeesPaid() { 
        return feesPaid; 
    }
public void setGPA(double GPA) { 
        this.GPA=GPA; 
    }
public double getGPA() { 
        return GPA; 
    }
public void setID(int studentID) { 
        this.studentID=studentID; 
    }
public int getID() { 
        return studentID; 
    }
// now update attribute by passing what was just added to their account 
public void increaseBalance(int newfee) { 
    feesOwed+=newfee; 
}
// making a static method call in the payment method so I can update the total funds collected
public void payment(int newpayment) { 
    feesPaid+=newpayment; 
    feesOwed-=newpayment;
    School.addToCollected(newpayment);
}
    
}
