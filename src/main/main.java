package main;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class main {

    public static void main() throws IOException {
        Employee[] employees=new Employee[10];
        employees[0]=new Employee("Yaqut","yaqut@gmail.com", 20, 3000);

        employees[1]=new Employee("Aysun","aysun@gmail.com", 20, 3000);
        employees[2]=new Employee("Vusale","vusu@gmail.com", 20, 20);
        employees[4]=new Employee("Nezrin","nezrin@gmail.com", 20, 2500);
        employees[5]=new Employee("Murad","murad@gmail.com", 15, 1500);
        employees[6]=new Employee("konbili","konbili@gmail.com", 20, 3000);
        employees[7]=new Employee("gunay","gunay@gmail.com", 20, 30);
        employees[8]=new Employee("nihad","nihad@gmail.com", 20, 600);
        employees[9]=new Employee("emin","emin@gmail.com", 20, 700);

        try (FileWriter writer = new FileWriter("employees.txt")){
            for(int i=0; i<10; i++){
                writer.write("name"+employees[i].getName()+"\n");
                writer.write("email"+employees[i].getEmail()+ "\n");
                writer.write("age"+employees[i].getAge()+ "\n");
                writer.write("Salary"+employees[i].getSalary()+ "\n");

            }
        }


    }
}
