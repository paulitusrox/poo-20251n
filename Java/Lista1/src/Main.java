public class Main {
    public static void main(String[] args) {
        //criação dos objetos da Classe carro
        //instanciando a classe carro
        Carro obj1 = new Carro();
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.exibirDetalhes ();
        obj1.acelerar(50);
        obj1.exibirDetalhes ();

        Carro obj2 = new Carro(2023,0,"Fiat","Argo");

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();

    }
}