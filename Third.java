public class Third {
    static void third(String e){
        String[] g = e.split("\"");
        int f = 0;
        for (int i = 0; i < g[1].length(); i++) {
            f++;
        }
        g[2] = g[2].replaceAll("[ /]", "");
        g[1] = g[1].replaceAll("[ \"]", "");
        boolean as = num.bo(g[2]);
        if (as) {
            int arr = Integer.parseInt(g[2]);
            if (arr > 0 & arr <11) {
                int num = Integer.parseInt(g[2]);
                if (g[2] == "0") {
                    System.exit(0);
                }
                else{
                    f = f/num;
                    System.out.println("\""+g[1].substring(0, f)+"\"");
                } 
            }
            
        } 
        else{ 
                System.exit(0);
        }    
    }
}
