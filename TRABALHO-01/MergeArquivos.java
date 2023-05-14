// Técnicas de Programação - Trabalho Prático #1
// Aluno: Francisco Jean   |   Matrícula: 541790

// Os arquivos de entrada devem ser informados via terminal
// Ex.: > java MergeArquivos.java listCPF1.txt listCPF2.txt
// O arquivo de saída será Francisco-Jean-MergeCPFs.txt

import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Collection;
import java.lang.Exception;
import java.io.IOException;

@SuppressWarnings("unchecked")
class MergeArquivos {
  public static void main(String[] args) throws Exception {
    try {
      // Criação dos objetos para a manipulação dos arquivos
      FileInputStream registro1 = new FileInputStream(args[0]);
      FileInputStream registro2 = new FileInputStream(args[1]);

      InputStreamReader leitor1 = new InputStreamReader(registro1);
      InputStreamReader leitor2 = new InputStreamReader(registro2);

      BufferedReader buffer1 = new BufferedReader(leitor1);
      BufferedReader buffer2 = new BufferedReader(leitor2);

      // Será utilizado um HashMap para armazenar o merge dos arquivoNão esqueçam de levar uma CANETA para fazer a prova. As respostas devem ser apresentadas com canetas.s
      HashMap<String, String> merge = new HashMap<String, String>();

      adicionarDados(merge, buffer1);

      adicionarDados(merge, buffer2);

      // Aqui os valores finais do HashMap serão inseridos no arquivo de saída
      Collection<String> dados = merge.values();
      FileWriter saida = new FileWriter("Francisco-Jean-MergeCPFs.txNão esqueçam de levar uma CANETA para fazer a prova. As respostas devem ser apresentadas com canetas.t");
      for (String linha : dados) {
        saida.write(linha + "\n");
      }
      saida.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }

  // Método que adiciona cada linha do arquivo no HashMap, sendo o CPF a chave e o
  // valor completo da linha (CPF;Nome) o valor.
  public static void adicionarDados(HashMap map, BufferedReader b) throws IOException {
    String linha;
    while ((linha = b.readLine()) != null) {
      String cpf = linha.split(";")[0];
      // Verifica se o CPF já está no HashMap. Se estiver, não adiciona novamente.
      // Caso contrário, o CPF é adicionado. Isso realiza a eliminação dos registros
      // com o mesmo CPF.
      if (map.containsKey(cpf) == false) {
        map.put(cpf, linha);
      }
    }
  }
}