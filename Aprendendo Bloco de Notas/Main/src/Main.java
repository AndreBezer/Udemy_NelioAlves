import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto File
        File file = new File("/home/bezer/Documentos/Programação/Udemy/Estudos - Nelio Alves/BlocoNotas/Aprendendo Bloco de Notas/Main/src/texto.txt");
        Scanner sc = null;

        // Lendo o Arquivo
        try{
            sc = new Scanner(file);

            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }

        // Tratando a exceção
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        // Fechando o Scanner
        finally{
            if(sc != null){
                sc.close();
            }
        }

    }
    
}