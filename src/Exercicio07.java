public class Exercicio07 {
    public static void main (String[] args){
        System.out.println("\n============ VEJA A AUTONOMIA DO SEU CARRO ============\n");

        Veiculo carro = new Veiculo("Civic", 4, 60.5, 8.1,15.0);
        Veiculo carro2 = new Veiculo("Onix",4,47.2,11.5,7.6);

        carro.abastecer(61.09);
        carro2.abastecer(36.55);

    }
}