package administracao;

public class Vendedor implements Comissao {
    @Override
    public double getValorComissao() {
        return 250.00;
    }
}
