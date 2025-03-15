package teste.java.singleton;


import main.java.singleton.Mercado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoTeste {

    @Test
    public void deveRetornarProduto() {
        Mercado.getInstance().setProduto("Arroz");
        assertEquals("Arroz", Mercado.getInstance().getProduto());
    }

    @Test
    public void deveRetornarCodigoBarras() {
       Mercado.getInstance().setCodigoBarras("codigo1");
        assertEquals("codigo1", Mercado.getInstance().getCodigoBarras());
    }

}
