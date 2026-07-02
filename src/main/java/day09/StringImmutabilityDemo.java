package day09;

public class StringImmutabilityDemo {
    public static void main(String[]args){
        String s1 = "Hello";
        String s2 = s1;
        System.out.println("s1 "+s1+" s2 "+s2);
        System.out.println("s1 and s2 point to same object? " + (s1 == s2));
        s2 = s2+" World";
        System.out.println("s1 "+s1+" s2 "+s2);
    }
}
