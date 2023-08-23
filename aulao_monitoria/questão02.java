import java.util.Scanner;



class questão02 {

    public static String reverse(String str){
        String resposta="";
        for(int i=0;i<str.length();i++){
            resposta += str.charAt(str.length()-i-1);
        }
        return resposta;
    }

    /*public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String t= sc.nextLine();
        int inicio_parentese= t.indexOf("(");
        int fim_parentese= t.lastIndexOf(")");
        String str= t.substring(inicio_parentese+1, fim_parentese);
        System.out.println(str);
        str=reverse(str);
        String resposta= t.substring(0,inicio_parentese) + "(" + str + ")";
        System.out.println(resposta);
    }
}
