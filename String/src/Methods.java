import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "Ipsita Mohanty";
        System.out.println(Arrays.toString(name.toCharArray()));
        //converts the strings into characters
        System.out.println(name.length());
        //returns the length of the string
        System.out.println(name.charAt(0));
        //returns the character at the specified index
        System.out.println(name.toLowerCase());
        //converts the string into lowercase
        System.out.println(name.toUpperCase());
        //converts the string into uppercase
        System.out.println(name.indexOf('y'));
        //returns the index of the specified character
        System.out.println(Arrays.toString(name.split("")));
        //splits the string into an array of characters

    }
}
