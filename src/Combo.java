import java.util.ArrayList;
import java.util.List;

public class Combo {
    private List<Produto> itensCombo;

    public Combo() {
        this.itensCombo = new ArrayList<>();
    }

    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            // Combo Master: Inclui um sanduíche de 200g, uma sobremesa grande e uma bebida de 500ml
            itensCombo.add(new Produto("Sanduíche 200g", 10.0));
            itensCombo.add(new Produto("Sobremesa Grande", 5.0));
            itensCombo.add(new Produto("Bebida 500ml", 3.0));
        } else if (tipo == 2) {
            // Super Combo: Inclui um sanduíche de 150g, uma sobremesa média e uma bebida de 300ml
            itensCombo.add(new Produto("Sanduíche 150g", 8.0));
            itensCombo.add(new Produto("Sobremesa Média", 4.0));
            itensCombo.add(new Produto("Bebida 300ml", 2.0));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Itens do Combo:\n");
        for (Produto produto : itensCombo) {
            builder.append(produto.getDescricao()).append(" - R$").append(produto.getPreco()).append("\n");
        }
        return builder.toString();
    }
}
