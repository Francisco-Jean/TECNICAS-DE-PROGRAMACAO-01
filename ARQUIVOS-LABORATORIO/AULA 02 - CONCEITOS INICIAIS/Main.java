class Main {
    public static void main(String [] args){
        Carro carro1 = new Carro();
        carro1.setQtdGasolina(100);
        int kmAndados = 0;
        while (carro1.getQtdGasolina() != 0){
            System.out.println("Gasolina atual: " + carro1.getQtdGasolina());
            carro1.andar(1);
            kmAndados++;
        }

        System.out.println("Seu carro andou " + kmAndados + " km e ficou com " + carro1.getQtdGasolina() + " litros de gasolina.");
       
    }
}