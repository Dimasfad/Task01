import java.util.Scanner;
public class Main {
    private static char operation;
    public static void first() {}

    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            String txt = sc.nextLine()+"\"";
            String[] Array = txt.split("\"");

            for (int i = 0; i < Array.length; i++) {
                if (Array[i].length() > 11) {
                    System.exit(0);
                }
            }

            String[] ArrayOp = Array[2].split("[+-/*]");
            operation = Array[2].charAt(ArrayOp[0].length());
            if ( Array.length == 4) {
                boolean number1 = num.bo(Array[1]);
                boolean number2 = num.bo(Array[3]);
                if(operation == '+') {
                    if(((number1 & !number2)|(!number1 & number2))){
                        System.exit(0);
                        break;
                    }
                    else{
                        String str = Array[1].concat(Array[3]);
                        System.out.println("\""+str+"\"");
                    }
                }
                else if(operation == '-'){
                    String a = Array[3];
                    String b = Array[1].replace(a, "");
                    System.out.println(b);
                }
                else{
                    System.exit(0);
                }
            }
            else if(operation == '*'){
                Second.second(txt);
            }
            else if(operation == '/'){
                Third.third(txt);
            }
        }
    }
}
