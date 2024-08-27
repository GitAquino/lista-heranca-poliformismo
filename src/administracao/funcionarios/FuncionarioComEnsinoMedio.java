package administracao.funcionarios;

import administracao.Comissao;

public class FuncionarioComEnsinoMedio extends FuncionarioComEnsinoBasico {
    public FuncionarioComEnsinoMedio(String name, int codeFunctional, String escola, Comissao comissao) {
        super(name, codeFunctional, escola, comissao);
    }

    @Override
    public double calcularRendaBase() {

        return super.calcularRendaBase() * 1.50;
    }

    @Override
    public double calcularRendaComissao() {
        return super.calcularRendaComissao();
    }
}
