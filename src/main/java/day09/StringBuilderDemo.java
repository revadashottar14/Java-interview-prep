package day09;

public class StringBuilderDemo {
    public static void main(String[]args){
        long starttime = System.currentTimeMillis();
        String res = "";
        for(int i = 0; i<10000; i++){
            res = res + "x";
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Time: "+(endtime-starttime)+" ms");
        System.out.println("Length: " + res.length());

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<10000; i++){
            sb.append("x");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: "+(end-start)+" ms");
        System.out.println("Length: " + sb.length());
    }
}
