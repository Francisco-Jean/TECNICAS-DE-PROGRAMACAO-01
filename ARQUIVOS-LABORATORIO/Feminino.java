class Feminino extends Pessoa{

    Feminino (){
        super();
    }

    Feminino (String nome){
        super(nome);
    }

    Feminino (String nome, int idade){
        super(nome, idade, 'F');
    }
}