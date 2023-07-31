package org.example.reflection;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    public int id;

    public String name;

    public String department;

    private double salary;

    public void changeDepartment (String department){
        this.department=department;
        System.out.println("New department is "+department);
    }
}
