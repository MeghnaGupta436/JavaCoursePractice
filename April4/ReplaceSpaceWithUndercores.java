package April4;

public class ReplaceSpaceWithUndercores {
    public static void main(String[] args) {

        String str="My Name Is Meghna";
        //String str= new String("My Name is Meghna"); can be written as this

        //replace(char,char) is used to replace space with underscore
        System.out.println(str.replace(' ','_'));
    }
}
