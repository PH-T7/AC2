package AC2;

class Gerente extends FuncionarioBase implements Beneficios {
    private double bonusPercentual;

    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    // Sobrescrita do método
    @Override
    double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual);
    }

    // Implementação de métodos da interface
    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual / 100;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0; // Gerente não tem auxílio-moradia
    }
}
