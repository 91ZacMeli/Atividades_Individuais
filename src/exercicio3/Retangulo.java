package exercicio3;

public class Retangulo {
    public void calculaArea(double A, double B){
        System.out.println("\n A área é = " + A*B + " metros quadrados.\n");
    }
    public void calculaPerimetro(double A,double B ){
        System.out.println(" O perímetro é = " + ((2*A)+(2*B))+ " metros.\n");
    }
    public Double quantidadeDePiso(double areaLajotaEmMtsQuadrados,double areaTotalEmMtsQuadrados){
        double qtddLajotas = areaTotalEmMtsQuadrados/areaLajotaEmMtsQuadrados;
        System.out.println(" A quantidade de Lajotas Necessárias para o piso é igual a : " + qtddLajotas);
        return qtddLajotas;
    }
    public Double quantidadeRodape(double comprimentoLajotaEmMetros, double perimetroEmMetros){
        double qtddLajotas = perimetroEmMetros/comprimentoLajotaEmMetros;
        System.out.println("\n A quantidade de Lajotas Necessárias para o rodapé é igual a : " + qtddLajotas);
        return qtddLajotas;
    }

}
