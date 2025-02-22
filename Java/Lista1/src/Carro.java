public class Carro {
    //variáveis
    //cujo tipo de dados são primitivos
    public int ano;
    public float velocidade;
    //cujo tipo de dados são Classes
    public String marca, modelo;
    //método construtor
    public Carro(){
        this.marca = "marca não definida";
        this.modelo = "modelo não definido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }


    //métodos

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);
    }
    //acelerar o carro em x unidades
    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }
        //frear o carro em x unidades
        //velocidade nao pode ficar negativa apos a freagem
        public void frear ( float x){
            if (this.velocidade >= x) {
            } else {
                System.out.println("velocidade não pode ser negativa");
            }
        }
    }
