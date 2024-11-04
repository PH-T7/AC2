package AC2;

class Diretor extends FuncionarioBase implements Beneficios {
    private double bonusPercentual;
    private double auxilioMoradia;

    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, salarioBase);
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    // Sobrescrita do método
    @Override
    double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual) + calcularAuxilioMoradia(auxilioMoradia);
    }

    // Implementação de métodos da interface
    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual / 100;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }
}
