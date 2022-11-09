package Ex1_08_11_2022;

import java.io.IOException;
import java.util.ArrayList;

public class PrincipalArquivoEX1 {
    public static void main(String [] args) throws IOException{
        String path = "C:/Exercicio_08_11_2022/ArquivoNomes.txt";
        System.out.println("Nomes: ");
        String path3 = "C:/Exercicio_08_11_2022/NomeCompleto.txt";
        ArrayList<String> listaNomes = ManipuladorArquivoEX1.LeitorNomes(path);

        System.out.println();
        String path2 = "C:/Exercicio_08_11_2022/SobreNomes.txt";
        System.out.println("Sobrenomes:");
        ManipuladorArquivoEX1.LeitorSobreNomes(path2);

        ArrayList<String> listaNomeCompleto = new ArrayList<String>();

        for (int cont =0; cont<10; cont++) {
           String linhaNome  = (String)listaNomes.get(cont);
           //Sobrenome
            ManipuladorArquivoEX1.escritor(path3, linhaNome);

        }
    }
}
