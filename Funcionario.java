package AC2;

class Funcionario extends FuncionarioBase {
    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Sobrescrita do método
    @Override
    double calcularSalario() {
        return salarioBase;
    }
}