public class Exercicio07 {
    public static void main (String[] args){
        System.out.println("========Veja o quanto seu veiculo gasta de combustivel =========");

        Veiculo carro = new Veiculo();

        carro.abastecer("Civic", 4, 65.00, 8.5);
        carro.exibirAutonomia();
    }
}
