package administracao;

import administracao.funcionarios.Funcionario;
import administracao.funcionarios.FuncionarioComEnsinoBasico;
import administracao.funcionarios.FuncionarioComEnsinoMedio;
import administracao.funcionarios.FuncionarioComGraduacao;

public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionarioSemEscolaridade = new Funcionario("FUNCIONARIO SEM ESCOLARIDADE", 111, new semComissao());
        Funcionario funcionarioComEnsinoBasico = new FuncionarioComEnsinoBasico("FUNCIONARIO COM ENSINO BÁSICO", 222, "Escola Estadual Joaquim Silva", new semComissao());
        Funcionario funcionarioComEnsinoMedio = new FuncionarioComEnsinoMedio("FUNCIONARIO COM ENSINO MÉDIO", 333, "Colégio Estadual Antonio Dias Lima", new semComissao());
        Funcionario funcionarioComGraduacao = new FuncionarioComGraduacao("FUNCIONARIO GRADUADO", 444, "Colégio Estadual Roberto Montenegro", "Centro de Ensino Superior de Valença", new semComissao());

        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioComEnsinoBasico("Carlos Miguel", 1, "EMJA", new Gerente());
        funcionarios[1] = new FuncionarioComEnsinoBasico("Alex Santana", 2, "EEMC", new Supervisor());
        funcionarios[2] = new FuncionarioComEnsinoMedio("Raniele", 3, "CEAS", new Supervisor());
        funcionarios[3] = new FuncionarioComEnsinoMedio("Pedro Raul", 4, "CEAC", new Vendedor());
        funcionarios[4] = new FuncionarioComEnsinoBasico("Yuri Alberto", 5, "EMRB", new Vendedor());
        funcionarios[5] = new FuncionarioComEnsinoMedio("Ronaldo", 6, "CEBRB", new Vendedor());
        funcionarios[6] = new FuncionarioComEnsinoMedio("Rodrigo Garro", 7, "CEAC", new Vendedor());
        funcionarios[7] = new FuncionarioComGraduacao("Clodualdo", 8, "CERM", "UNIFAA", new Vendedor());
        funcionarios[8] = new FuncionarioComGraduacao("Igor Coronado", 9, "CESD", "UERRJ", new Vendedor());
        funcionarios[9] = new FuncionarioComEnsinoBasico("Lionel Messi", 10, "EEMA", new Supervisor());

        double totalSalarios = 0;
        double totalEnsinoBasico = 0;
        double totalEnsinoMedio = 0;
        double totalGraduacao = 0;

        double totalSalariosComissoes = 0;
        double totalGerentes = 0;
        double totalSupervisores = 0;
        double totalVendedores = 0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularRendaBase();
            totalSalarios += salario;

            if (f instanceof FuncionarioComGraduacao) {
                totalGraduacao += salario;
            } else if (f instanceof FuncionarioComEnsinoMedio) {
                totalEnsinoMedio += salario;
            } else if (f instanceof FuncionarioComEnsinoBasico) {
                totalEnsinoBasico += salario;
            }

            double salarioComissao = f.calcularRendaComissao();
            totalSalariosComissoes += salarioComissao;

            if (f.getComissao() instanceof Gerente) {
                totalGerentes += salarioComissao;
            } else if (f.getComissao() instanceof Supervisor) {
                totalSupervisores += salarioComissao;
            } else if (f.getComissao() instanceof Vendedor) {
                totalVendedores += salarioComissao;
            }
        }

        System.out.println("================================================================================================\n");
        System.out.println("Custo com um funcionário sem escolaridade, sem comissão: " + funcionarioSemEscolaridade.calcularRendaComissao());
        System.out.println("Custo com um funcionário com ensino básico, sem comissão: " + funcionarioComEnsinoBasico.calcularRendaComissao());
        System.out.println("Custo com um funcionário com ensino médio, sem comissão: " + funcionarioComEnsinoMedio.calcularRendaComissao());
        System.out.println("Custo com um funcionário graduado, sem comissão: " + funcionarioComGraduacao.calcularRendaComissao());
        System.out.println();

        System.out.println("Custo com os funcionários de ensino básico sem comissão da empresa: R$ " + totalEnsinoBasico);
        System.out.println("Custo com os funcionários de ensino médio sem comissão da empresa: R$ " + totalEnsinoMedio);
        System.out.println("Custo com os funcionários graduados sem comissão da empresa: R$ " + totalGraduacao);
        System.out.println("Custo total com salários sem comissão: R$ " + totalSalarios);
        System.out.println();

        System.out.println("Custo com os gerentes da empresa: R$ " + totalGerentes);
        System.out.println("Custo com os supervisores da empresa: R$ " + totalSupervisores);
        System.out.println("Custo com os vendedores da empresa: R$ " + totalVendedores);
        System.out.println("Custo total dos salários com comissões da empresa: R$ " + totalSalariosComissoes);
        System.out.println("\n================================================================================================");

        System.out.println("\nFuncionários da empresa:\n");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        System.out.println("\n================================================================================================");


    }
}

