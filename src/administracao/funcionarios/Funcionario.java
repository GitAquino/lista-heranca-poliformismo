package administracao.funcionarios;

import administracao.Comissao;

public class Funcionario {
    private String name;
    private int codeFunctional
;
    private Comissao comissao;

    public Funcionario(String name, int codeFunctional
, Comissao comissao) {
        this.name = name;
        this.codeFunctional
 = codeFunctional
;
        this.comissao = comissao;
    }

    public String getName() {
        return name;
    }

    public int getCodeFunctional
() {
        return codeFunctional
;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public double calcularRendaBase() {
        double rendaBase = 1000.00;
        return rendaBase;
    }

    public double calcularRendaComissao() {
        double rendaComissao = calcularRendaBase();
        rendaComissao += comissao.getValorComissao();
        return rendaComissao;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Salario base: R$ " + calcularRendaBase() + ", Comissão: R$ " +
                (comissao != null ? comissao.getValorComissao() : 0.00) + ", Salário Total: R$ " + calcularRendaComissao();
    }
}

