import java.util.Scanner;

class questão01{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int i=0;
        String entrada=sc.nextLine();
        String[] dados= entrada.split(" ");
        for(i=0;i<dados.length;i++);
        System.out.println(dados[i-1]);
        System.out.println(dados[i-1].length());
    }
}