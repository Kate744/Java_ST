package sfwtesting.autojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main (String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP" };


        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");


        /*for (int i = 0; i < langs.length; i ++) {
            System.out.println("I want to know " + langs[i]);
        }

        for (int i = 0; i < languages.size(); i++) {
            System.out.println("I want to know " + languages.get(i));
        }*/
        for (String l : languages) {
            System.out.println("I want to know " + l);
        }

        List languages1 = Arrays.asList("Java", "C#", "Python", "PHP");
        for (Object l : languages1) {
            System.out.println("I want to know " + l);
        }
    }
}
