import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Copia {
  public static void main(String[] args) {
    File entrada, saida = null;

    entrada = new File("entrada.txt");
    saida = new File("saida.txt");
    try {
      FileInputStream fi = new FileInputStream(entrada);
      FileInputStream fo = new FileInputStream(saida);
    }
    catch (FileNotFoundException e){
      System.out.println("Arquivo " + entrada + "Inexistente");
      System.exit(0);
    }
    int c;
    while ((c = fi.read()) != -1){
      fo.write(c);
      System.out.println(c);
      
    }
  }
}