public class Veiculo {
    protected String nome;
    protected Integer numRodas;
    protected Double capTanque;
    protected Double litros;
    protected Double quantidadeCombustivel;
    protected Double combustivelNoTanque;

    public Veiculo(String nome, Integer numRodas, Double capTanque, Double litros, Double combustivelNoTanque) {
        this.nome = nome;
        this.numRodas = numRodas;
        this.capTanque = capTanque;
        this.litros = litros;
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public void abastecer(double quantidadeCombustivel) {
        if (quantidadeCombustivel <= capTanque && quantidadeCombustivel > 0) {
            combustivelNoTanque += quantidadeCombustivel;
            System.out.println("\tSeu veiculo foi abastecido! Quantidade no tanque: " + combustivelNoTanque + " Litros");
        } else {
            System.out.println("\tEssa quantidade excede o limite do seu tanque: " + capTanque + ", Coloque uma quantidade menor.");
        }
        autonomia();
    }

    public void autonomia(){
        System.out.println("\tSeu veiculo roda aproximadamente: " + (litros * combustivelNoTanque) + " KM com o combustivel que está no tanque!\n");
    }
}