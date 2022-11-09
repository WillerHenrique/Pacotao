package Ex1_08_11_2022;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivoEX1 {
    public static  ArrayList<String> LeitorNomes(String path) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader(path));
        String linha = "";

        ArrayList<String> listaNomes = new ArrayList<String>();

        for(int cont =0; cont<10; cont++) {
            linha = buffReader.read();
            listaNomes.add(linha);
        }
        buffReader.close();
        return listaNomes;

    }
    public static void LeitorSobreNomes(String path2) throws IOException {
        BufferedReader buffReader = new BufferedReader(new FileReader(path2));
        String Linha = "";

        ArrayList<String> listaSobreNomes = new ArrayList<String>();

        while (true) {
            if(Linha!=null)
                System.out.println(Linha);
            else
                break;
            Linha = buffReader.readLine();
        }
        buffReader.close();
    }
    public static void escritor(String path3, String linha) throws IOException {
        //String Linha = "";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path3));
        buffWrite.append(linha);
        buffWrite.close();
    }
}
