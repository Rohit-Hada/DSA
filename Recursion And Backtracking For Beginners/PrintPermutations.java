public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextline();
        
        printPermutations(str, "");


    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0  ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String roq = str.substring(0,i) + str.substring(i+1);
            printPermutations(roq,asf+ch);
        }    
    }

}
// -----------------------------------------------
// Using StringBuilder
public static void printPermutations(String qsf, String asf) {
    if(qsf.length() == 0){
        System.out.println(asf);
        return;
    }
    StringBuilder sb = new StringBuilder(qsf);

    for(int i = 0; i < qsf.length(); i++){
        char ch = qsf.charAt(i);
        sb.deleteCharAt(i);
        String roq = sb.toString();

        printPermutations(roq, asf+ch);

        sb.insert(i, ch);
    }
    
}
