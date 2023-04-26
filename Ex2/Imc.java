package Ex2;

public class Imc {
    public static void main(String[] args) {
    double  peso =99.50 , altura = 1.68 , imc;
    imc = peso / (altura*altura);
    if(imc < 18.5){
        System.out.print("Magreza");
        }else if(imc>18.5&& imc<=24.9){
        System.out.print("normal");
    }else if(imc>=25 && imc<=29.9){;
        System.out.print("sobrepeso I");
    }else if(imc>=30&& imc<=39.9){;
        System.out.print("obesidadeII");
    }else if(imc>=40){
        System.out.print("obesidade III");
    }else{
    System.out.print("Não identificado");}

    }
}
