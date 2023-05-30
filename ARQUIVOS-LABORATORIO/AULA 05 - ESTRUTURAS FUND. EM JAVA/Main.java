class Main {
    public static void main(String[] args){
        Integer n = 0;
        boolean p = false;
        String s = "Text";
        System.out.println(n);
        System.out.println(p);
        System.out.println(s);

        String cor = "black";
        switch (cor){
            case "red":
                System.out.println("A cor escolhida foi vermelho");
                break;
            case "blue":
                System.out.println("A cor escolhida foi azul");
                break;
            case "black":
                System.out.println("A cor escolhida foi preto");
                break;
        }

        char vetor[] = new char[10];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = 'A';
            System.out.println(vetor[i]);
        }

        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while(x <= 10);
    }
    
}