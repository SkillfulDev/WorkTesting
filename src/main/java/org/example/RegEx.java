package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String addbook = "Krasavin Ivan, Urkaine, Kiev, Geroiv street, 32, Flat 44, " +
                "email: krasavin@gmail.com, Postcode: FF88, Phone Number: +12345646;" +
                "Nikitin Vladimir, Urkaine, Lviv, Hadii street, 12, Flat 344, " +
                "email: Nikitin@gmail.com, Postcode: 5FG8, Phone Number:+754543861;" +
                "Vankuver Elena, Urkaine, Dnipro, Malinovisha street, 01, Flat 14, " +
                "email: vankuver@gmail.com, Postcode: 11P8, Phone Number: +46431879;";


        Pattern pattern = Pattern.compile("Postcode");
        Matcher matcher = pattern.matcher(addbook);

        while (matcher.find()){
            System.out.println(matcher.start()+":"+ matcher.group());
        }

    }
}
