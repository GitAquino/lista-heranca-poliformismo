package administracao.funcionarios;

import administracao.Comissao;

public class FuncionarioComEnsinoBasico extends Funcionario {
    private String escola;

    public FuncionarioComEnsinoBasico(String name, int codeFunctional, String escola, Comissao comissao) {
        super(name, codeFunctional, comissao);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public double calcularRendaBase() {
        return super.calcularRendaBase() * 1.10;
    }

    public double calcularRendaComissao() {
        return super.calcularRendaComissao();
    }
}
