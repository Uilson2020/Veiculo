public class Veiculo {
    public String nome;
    public Integer numRodas;
    public Double capTanque;
    public Double KmLitro;
    public Double quantidadeCombustivel;

    public void abastecer(String nome, Integer numRodas, Double capTanque, Double kmLitro){
        if(quantidadeCombustivel > 0 && quantidadeCombustivel <= capTanque){
            System.out.println("Tanque cheio");
        }
    }

    public void exibirAutonomia(){
        System.out.println("Autonomia:");
    }


}
