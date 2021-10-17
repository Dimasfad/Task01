import java.util.*;
public class Second {
    public static void second(String e){

            String c = e +="\"";
            String[] d = c.split("\"");
            d[2] = d[2].replaceAll("[ *]","");
            boolean sa = num.bo(d[2]);
            if (sa) {
                int a = Integer.parseInt(d[2]);
                if (a  > 0 && a  <=10) {
                    String repeated = d[1].repeat(a);
                    String s = d[1].repeat(a);
                    if (s.length()>40) {
                        System.out.print(s.substring(0,40)+"...");
                    }
                    else{
                        System.out.print(s);}
                    System.out.print("\n");
                }
            }
            else{
                    System.exit(0);
            }
    }
}
