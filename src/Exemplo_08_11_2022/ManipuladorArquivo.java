package Exemplo_08_11_2022;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String Linha = "";
        while(true) {
            if(Linha!=null)
                System.out.println(Linha);
            else
                break;
            Linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String Linha = "";
        Scanner in = new Scanner (System.in);
        System.out.println("Escreva algo: ");
        Linha = in.nextLine();
        buffWrite.append(Linha + "\n");
        buffWrite.close();
    }
}

