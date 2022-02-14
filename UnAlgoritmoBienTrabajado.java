import java.util.Scanner;
public class UnAlgoritmoBienTrabajado{
    public static int menu(Scanner reader){
        int opt=0;
        System.out.println("Que deseas hacer?"+
            "\n1) Imprimir hello world"+
            "\2) Imprimir bye world");
        return opt;
    }

    public static void main (String[]args){
        Scanner reader=new Scanner (System.in);
        int opt1=0;
        opt1=menu(reader);
        switch (opt1){
            case 1: System.out.println("hello World!");
            break;
            case 2: System.out.println("Bye World!");
            break;
        }
    }
}