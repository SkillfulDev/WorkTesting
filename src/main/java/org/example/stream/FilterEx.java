package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FilterEx {
    public static void main(String[] args) {
        long [] numbers = {1,23,4,40,65,42,34,14,1,34,15,425,2};

 long result = Arrays.stream(numbers).reduce((res, el)->res*el).getAsLong();

        System.out.println(result);
    }
}
