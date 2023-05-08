import java.io.File;

class Arquivo {
  public static void main(String[] args) {
    File arq = new File("ARQUIVOS-LABORATORIO/ENTRADA_SAIDA/Arquivo.java");

    System.out.println(arq.exists());
    System.out.println(arq.isFile());
  }
}