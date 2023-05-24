public class Mouse {
    //Métodos
    String modelo;
    String cor;
    boolean conexao;
    int dpi;
    int bateria;

    public Mouse(String modelo, String cor, boolean conexao,int bateria) {
        this.modelo = modelo;
        this.cor = cor;
        this.conexao = conexao;
//        this.dpi = dpi;
        this.bateria = bateria;

    }
    public void statusMouse(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Conexão: " + (conexao ? "Ativa" : "Inativa"));
        System.out.println("Bateria: " + bateria + "%");
    }
    public void clique(){
        if (conexao == true && bateria > 0){
            System.out.println("Click efetuado!!!");
        }
        else {
            System.out.println("Mouse desconectado!!!");
        }
    }
    public void carregarMouse(){
        if(bateria < 100){
            bateria = 100;
            System.out.println("Carregando!!");
        }
        else {
            System.out.println("Carregado!!!");
        }
    }
    public void velocidadeDoCursor(int dpi){
        if (dpi == 1200){
            System.out.println("DPI Baixa!!!");
        } else if (dpi == 2600) {
            System.out.println("DPI Média!!!");
        } else if (dpi == 3200) {
            System.out.println("DPI Alta!!!");
        }else{
            System.out.println("Numero Inserido Incorreto!");
        }
    }
}
