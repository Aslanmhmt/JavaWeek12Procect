package accesModifierReview;

public class EmployeeClass {
    public String name, jobtitle;
    public int ID;
    public double salary;
    public static  String companyName;

    static {
        companyName = "Microsoft";
    }


    public EmployeeClass(){
        salary = 10000;

    }

    public EmployeeClass(String n, String jobTitle, int ID, double salary){
        name = n;
        this.jobtitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }
}
