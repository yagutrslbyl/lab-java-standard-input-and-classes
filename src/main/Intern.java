package main;

public class Intern extends Employee {
    private final double MAX_INTERN_SALARY=20000;

    public Intern(String name, String email, int age, double salary){ super(name,email,age,salary);
    if(salary>MAX_INTERN_SALARY){
        System.err.println("Intern salary should not above 20000");
    }

    }

    public void setSalary(double salary){
        if(salary>MAX_INTERN_SALARY){
            System.err.println("Intern salary should not above 20000");

        }
        else{
           super.setSalary(salary);
        }
    }

    public double getInternSalary(){
        return salary;
    }

    public double getMAX_INTERN_SALARY(){
        return MAX_INTERN_SALARY;
    }

}
