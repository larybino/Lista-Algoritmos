public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        int valor1= 30;
        int valor2=80;
        System.out.println(valor1);
        saque(valor1);
        System.out.println(valor2);
        saque(valor2);
    }

    public static void saque(int valor){
        int[] notas={100, 50, 20, 10};
        int[] contadorNotas= new int[notas.length];
        for(int i=0; i<notas.length; i++){
            if(valor>=notas[i]){
                contadorNotas[i]= valor/notas[i];
                valor%=notas[i];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (contadorNotas[i] != 0) {
                System.out.println(contadorNotas[i]+ " nota de " + notas[i] );
            }
        }
    }
}
