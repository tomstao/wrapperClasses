
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

// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}