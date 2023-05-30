class Carro {

  String chassi;
  Integer cor;
  String Motor;
  int qtdGasolina;

  public String getChassi() {
    return this.chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public Integer getCor() {
    return this.cor;
  }

  public void setCor(Integer cor) {
    this.cor = cor;
  }

  public String getMotor() {
    return this.Motor;
  }

  public void setMotor(String Motor) {
    this.Motor = Motor;
  }

  public int getQtdGasolina() {
    return this.qtdGasolina;
  }

  public void setQtdGasolina(int qtdGasolina) {
    this.qtdGasolina = qtdGasolina;
  }
  
  boolean temGasolina(){
    return (this.getQtdGasolina() > 0);
  }

  void andar(int km){
    if(km > this.getQtdGasolina()){
      System.out.println("Seu carro andou " + (this.getQtdGasolina()) + "km e ficou sem gasoina.");
      this.setQtdGasolina(0);
    }
    else{
      this.setQtdGasolina(this.getQtdGasolina() - (km));
    }
  }


  
}