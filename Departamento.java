package AC2;

class Departamento {
    private String nome;
    private FuncionarioBase[] funcionarios;
    private int totalFuncionarios;

    // Define o tamanho máximo de funcionários no departamento
    private static final int MaxFuncionarios = 100;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new FuncionarioBase[MaxFuncionarios];
        this.totalFuncionarios = 0;
    }

    // Adiciona um funcionário
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        if (totalFuncionarios < MaxFuncionarios) {
            funcionarios[totalFuncionarios] = funcionario;
            totalFuncionarios++;
        } else {
            System.out.println("Limite de funcionários atingido no departamento.");
        }
    }

    // Remove um funcionário
    public void removerFuncionario(FuncionarioBase funcionario) {
        boolean found = false;
        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i] == funcionario) {
                for (int j = i; j < totalFuncionarios - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[totalFuncionarios - 1] = null;
                totalFuncionarios--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Funcionário não encontrado no departamento.");
        }
    }

     // Calcula a folha de pagamento total
     public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (int i = 0; i < totalFuncionarios; i++) {
            total += funcionarios[i].calcularSalario();
        }
        return total;
    }

    // Imprime os salários dos funcionários
    public void imprimirSalariosFuncionarios() {
        for (int i = 0; i < totalFuncionarios; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + ", Salário: " + funcionarios[i].calcularSalario());
        }
    }
}

