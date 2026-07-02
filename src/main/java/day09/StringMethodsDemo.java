package day09;

public class StringMethodsDemo {
    public static void main(String[]args){
        String s = "Hello World";
        System.out.println("length: "+s.length());
        System.out.println("substring: "+s.substring(0,5));
        System.out.println("substring single: "+s.substring(6));
        System.out.println("contains World: "+s.contains("World"));
        System.out.println("equals: "+s.equals("hello world"));
        System.out.println("equal ignore case : "+s.equalsIgnoreCase("hello world"));
        System.out.println("index of: "+s.indexOf("l"));
        System.out.println("replace: "+s.replace("Hello", "hellow"));
        String csv = "apple,banana,guava";
        String [] sb = csv.split(",");
        for(String fruits : sb){
        System.out.println("fruits ->"+fruits);}
        String padded = " hello ";
        System.out.println("Trimmed: '" + padded.trim() + "'");
        System.out.println("Uppercase:"+s.toUpperCase());
        System.out.println("Lowercase:"+s.toLowerCase());

        String a = "payment@email.com";
        String[] sp = a.split("@");

            System.out.println("answer -> "+sp[0]);

    }
}
