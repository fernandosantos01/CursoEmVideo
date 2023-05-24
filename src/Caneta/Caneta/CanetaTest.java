public class CanetaTest {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.78f, 85, true);
        c1.destampar();
        c1.escrever();
        c1.statusDaCaneta();
    }
}
