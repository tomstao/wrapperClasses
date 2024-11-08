
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// wrapper class =  provides a way to use primitive data types as reference data types
//     reference data types contain useful methods
//     can be used with collections (ex.ArrayList)

//primitive  //wrapper
//---------  //-------
// boolean  Boolean
// char   Character
// int   Integer
// double  Double

import java.util.ArrayList;

// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
public class Main {
    public static void main(String[] args) {
        // autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        if (a == true){
            System.out.println("true");
        }

        // Array list
        // it's a resizable array
        // Elements can be added and remove after compilation phase
        // store reference data type
        ArrayList<String> food = new ArrayList<String>();
        food.add("Apple");
        food.add("Banana");
        food.add("Bread");
        food.set(0,"Sushi");
        // replace element
        food.remove(2);
        for (int i= 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        food.clear();
        boolean foods = food.isEmpty();
        System.out.println(foods);



    }
}