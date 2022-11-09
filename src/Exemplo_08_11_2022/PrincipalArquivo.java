package Exemplo_08_11_2022;

import java.io.IOException;

public class PrincipalArquivo {
    public static void main(String [] args) throws IOException {
        String path = "C:/Exemplo_08_11_2022/Teste.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}
