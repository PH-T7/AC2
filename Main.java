package AC2;

public class Main {
    public static void main(String[] args) {
        // Instancia o departamento Tecnologia
        Departamento tecnologia = new Departamento("Tecnologia");

        // Adiciona os funcionários ao departamento
        Funcionario joao = new Funcionario("João", 3000);
        Gerente maria = new Gerente("Maria", 5000, 20);
        Diretor carlos = new Diretor("Carlos", 10000, 30, 2000);

        tecnologia.adicionarFuncionario(joao);
        tecnologia.adicionarFuncionario(maria);
        tecnologia.adicionarFuncionario(carlos);

        // Calcula e imprime a folha de pagamento total
        System.out.println("Folha de pagamento total: " + tecnologia.calcularFolhaPagamentoTotal());

        // Imprime o nome e o salário de cada funcionário
        tecnologia.imprimirSalariosFuncionarios();
    }
}
