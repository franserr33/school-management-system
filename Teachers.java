public class Teachers {
    private String name; 
    private int salary;  
    private int incomeEarned; 
    private int facultyID; 
    /**
     * Create instance of a teacher and hold their attribute
     * @param name name of professor/instructor/teacher
     * @param salary their yearly salary 
     * @param facultyID unique numerical identifier for the teacher 
     */
// standard constructor I will use
    public Teachers(String name, int salary, int facultyID) { 
        this.name=name; 
        this.salary=salary; 
        this.facultyID=facultyID; 
        this.incomeEarned=0; 
        // making a static method call so i can add to the school's (estimated/assumed) expenses with each hire
        School.addToSpend(salary);

    }
// default constructor
    public Teachers(){
        name=null; 
        salary=0; 
        facultyID=0; 
    }
// standard setters and getters
    public void setName(String name) { 
        this.name=name; 
    }
    public String getName() { 
        return name; 
    }
    public void setSalary(int salary) { 
        this.salary=salary; 
    }
    public int getSalary() { 
        return salary; 
    }
    public void setID(int facultyID) { 
        this.facultyID=facultyID; 
    }
    public int getID() { 
        return facultyID; 
    }
    public void salaryRaise(int raise) { 
        salary+=raise;
        School.addToSpend(raise);
    }
    public void addEarnedIncome(int monthlyDepsoit) { 
        incomeEarned+=monthlyDepsoit;
    }
    public int getEarnedIncome() { 
        return incomeEarned;
    }









    
}
