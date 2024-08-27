package administracao.funcionarios;

import administracao.Comissao;

public class FuncionarioComGraduacao extends FuncionarioComEnsinoMedio {
    private String universidade;

    public FuncionarioComGraduacao(String name, int codeFunctional, String escola, String universidade, Comissao comissao) {
        super(name, codeFunctional, escola, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRendaBase() {
        return super.calcularRendaBase() * 2.00;
    }
    @Override
    public double calcularRendaComissao() {
        return super.calcularRendaComissao();
    }
}
