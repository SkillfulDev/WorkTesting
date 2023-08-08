package org.example.reflection;

import lombok.*;

@Builder
@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    {
        id=1;
        name="nulli";
        department ="Some Dep";
        salary = 3.14;
    }
    public int id;

    public String name;

    public String department;

    private double salary;

    public void changeDepartment (String department){
        this.department=department;
        System.out.println("New department is "+department);
    }
   public Employee(String name, long id){}

//   public  Employee(){}

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
}
