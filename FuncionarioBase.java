package AC2;

abstract class FuncionarioBase {
    protected String nome;
    protected double salarioBase;

    // Construtor
    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato para cálculo de salário
    abstract double calcularSalario();

    // Sobrecarga do método calcularSalario com bônus adicional opcional
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }

    // Getter
    public String getNome() {
        return nome;
    }
}