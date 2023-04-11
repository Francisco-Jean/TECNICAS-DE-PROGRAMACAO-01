abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    Pessoa (){
        this("Sem nome", 0, ' ');
    }

    Pessoa (String nome){
        this(nome, 0, ' ');
    }

    Pessoa (String nome, int idade){
        this(nome, idade, ' ');
    }

    Pessoa (String nome, int idade, char sexo){
        this(nome, idade, sexo);
    }

    

}