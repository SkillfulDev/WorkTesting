package org.example.stream;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

public class FilterEx {
    public static void main(String[] args) {
        int[] numbers = {3,8,1,5,9,12,4,21,81,7,18};

        int result = Arrays.stream(numbers).filter(el -> el % 2 != 0)
                .map(el -> el % 3 == 0 ? el /= 3 : el )
                .reduce((temp, el) -> temp += el).getAsInt();
        System.out.println(result);
    }
}

@ToString
@Getter
@Setter
@Builder
class Stud implements Comparable<Stud> {
    int age;
    String name;

    @Override
    public int compareTo(Stud o2) {
        return this.getAge() - o2.getAge();
    }
}
