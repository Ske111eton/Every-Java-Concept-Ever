package oops.packages;


import oops.packages.models.*;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Student obj = new Student("Tom");
        System.out.println(obj.name);
//        obj.getPassword();
        Teacher teacher = new Teacher();
        Scanner sc = new Scanner(System.in);
    }
}
