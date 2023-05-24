public class Caneta {
    //Métodos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampa = tampa;
    }
    public void statusDaCaneta(){
        System.out.println("Modelo: " + modelo + "\nCor: " + cor + "\nPonta: " + ponta + "\nCarga: " + carga + "\nTampada? " + tampa);
    }
    public void escrever(){
        if (this.tampa == true){
            System.out.println("Não é possivel escrever, pois está tampada");
        }
        else{
            System.out.println("Escrevendo...");
        }
    }
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }
}
