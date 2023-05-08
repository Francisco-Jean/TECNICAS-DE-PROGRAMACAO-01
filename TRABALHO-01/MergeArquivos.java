// java TRABALHO-01/MergeArquivos.java TRABALHO-01/ListaCPF01.txt TRABALHO-01/ListaCPF02.txt

import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.awt.Window.Type;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Collection;
import java.lang.Exception;
import java.io.IOException;

@SuppressWarnings("unchecked")
class MergeArquivos {
  public static void main(String[] args) throws Exception {
    try {
      FileInputStream registro1 = new FileInputStream(args[0]);
      FileInputStream registro2 = new FileInputStream(args[1]);
  
      InputStreamReader leitor1 = new InputStreamReader(registro1);
      InputStreamReader leitor2 = new InputStreamReader(registro2);
      
      BufferedReader buffer1 = new BufferedReader(leitor1);
      BufferedReader buffer2 = new BufferedReader(leitor2);
      
      HashMap<String, String> merge = new HashMap<String, String>();
  
      AdicionarDados(merge, buffer1);
  
      AdicionarDados(merge, buffer2);
  
      Collection<String> dados = merge.values();
      FileWriter saida = new FileWriter("Francisco-Jean-MergeCPFs.txt");
      for(String linha : dados){
        saida.write(linha + "\n");
      }
      saida.close();
    }
    catch (Exception e){
      e.getStackTrace();
    }
  }
  public static void AdicionarDados(HashMap map, BufferedReader b) throws IOException {
    String linha;
    while((linha = b.readLine()) != null){
      String cpf = linha.split(";")[0];
      if(map.containsKey(cpf) == false){
        map.put(cpf, linha);
      }
    }
  }
}