package April4;
public class StringMethods {
    public static void main(String[] args) {

        String name="Meghna Gupta";
        //String name=new String("Meghna"); can be written as this

        //using methods on String
        //.length() method to find the length of the string
        System.out.println("Length of string is: "+name.length());

        //.toLower Case method to convert every case of the string to lower case
        System.out.println("String in lower case is: "+name.toLowerCase());

        //to upper case - converts every case of the string to upper case
        System.out.println("String in upper case is: "+name.toUpperCase());

        //as string is immutable, so we can't make changes in it.
        //eg- String str1=name.toLowerCase();,this will hold the string in lower case
        //we can either print the string by applying method to it.
        //We need to create a new string to save any changes made in the string and print it.

        //trim()-removes all the leading and trailing spaces from the string
        String NonTrimmedString="   Meghna   ";
        System.out.println(NonTrimmedString);
        System.out.println(NonTrimmedString.trim());

        //subString(start index)- this returns the substring starting
        //it will start from the given index and print till end
        //note index start from 0
        System.out.println(name.substring(3));
        System.out.println(name.substring(0));//redundant

        //substring(start,end)-here also the substring is returned based on given start and end
        //here the start value is included and end is excluded
        System.out.println(name.substring(3,6));

        /*replace() method- this method returns the string by replacing
        two characters in a string  with each other*/
        //this will replace al a in the string with n
        System.out.println(name.replace('a','n'));
        //we can also replace strings within this method
        System.out.println(name.replace("hna","an"));

        //startsWith('')- this method checks whether the string starts with given char or not
        //returns true or false
        System.out.println(name.startsWith("Na")); //false
        System.out.println(name.startsWith("M")); //true

        //ensWith()- checks if string ends with given char(s),returns T or F
        System.out.println(name.endsWith("Me")); //false
        System.out.println(name.endsWith("ta")); //true and case sensitive

        //charAt(index)- this returns the character that is at the given index of a string
        System.out.println(name.charAt(3));//character at 3rd index of 'Meghna' is h

        //indexOf(String)- returns the index of the given,substring at its 1st
        //it searches from left to right
        System.out.println(name.indexOf('a'));//index is 5
        System.out.println(name.indexOf("na"));//returns first occurance index
        //we can also give it the index to start finding from that index till end
        //if match is not found it will return -1
        System.out.println(name.indexOf('a',6));

        //lastIndexOf(stringName)- returns the last index of the character,string
        //searches from right to left
        System.out.println(name.lastIndexOf("a"));
        //we can also provide an index to search from
        System.out.println(name.lastIndexOf('a',6));

        //equals(str)- checks if the string is equal to the given string or not
        //and is case sensitive
        System.out.println(name.equals("Meghna")); //not equal(false)
        System.out.println(name.equals("Meghna Gupta"));//is equal(true)

        //equalsIgnoreCase(Str)- if you want to compare two strings by ignoring case sensitivity
        System.out.println(name.equalsIgnoreCase("meghna gupta"));//true
        System.out.println(name.equalsIgnoreCase("meghna ")); //false

        //to print a new line- \n
        System.out.println("My Name Is \nMeghna");//Meghna will be printed in the next line
        //to insert tab in between -\t
        System.out.println("My name is \t \tMeghna");//createsv space in between using \t

        //escape sequence characters- sequence od charcters after \backslash
        //consists of more than 1 characters but represents 1 character when used in strings
        // \n ,\t ,\' ,\\-but only represent one character
        //double quote- \"
        System.out.println("\"My name is Meghna\"");//double quotes will be inserted
        //to print backslash-\\
        System.out.println("I want to print backslash- \\");//one backslash will be printed






















    }
}
