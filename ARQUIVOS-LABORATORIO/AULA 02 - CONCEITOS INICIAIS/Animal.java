import java.time.LocalDate;

class Animal {
  private String especie;
  private LocalDate dataNascimento;
  private int idade = 0;

  String getEspecie(){
    return this.especie;
  }

  LocalDate getDataNascimento(){
    return this.dataNascimento;
  }

  int getIdade(){
    return this.idade;
  }

  boolean setEspecie(String newEspecie){
    this.especie = newEspecie;
  }


  
}