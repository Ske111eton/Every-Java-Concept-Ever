package strings;

import java.util.Locale;

public class StringIntro {
    public static void main(String[] args) {

        String name = "Tushar";
        String name2 = "Tushar";
        String anotherName = new String("Anuj");


        System.out.println(name2 == name);

        name = "Chouhan";
        System.out.println(name);


        String animal = "Tushar";
        String animal2 = new String("Tushar");

        System.out.println(animal.charAt(5));
        System.out.println(animal.length());
        System.out.println(animal.substring(2));
        System.out.println(animal.substring(2,4));
        System.out.println(animal.contains("u"));
        System.out.println(animal.equals(animal2));

        String phone = "Redmi";
        phone = phone + " xiaomi";
        System.out.println(phone.isEmpty());
        System.out.println(animal.concat(phone));
        System.out.println(animal.concat(" Chouhan"));
        System.out.println(phone);

        String laptop = "Asus";
        System.out.println(laptop.replace("A","G"));

        String cars = "Hyundai,Maruti,Swift,Wagonr,Ferrari,Lamborghini";
        String [] allCars = cars.split(",");
        for(String c : allCars){
            System.out.println(c);
        }

        System.out.println();

        String names = "Tushar Anurag Adarsh Monty Amit";
        String [] friends = names.split(" ");
        for(String items : friends){
            System.out.println(items);
        }

        String lens = "lenskart";
        System.out.println(lens.indexOf('k'));
        System.out.println(lens.indexOf('z'));

        System.out.println(lens.toLowerCase());
        System.out.println(lens.toUpperCase());

        String machine = "      interlock            ";
        System.out.println(machine);
        System.out.println(machine.trim());

    }
}
