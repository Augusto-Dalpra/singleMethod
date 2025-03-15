package main.java.singleton;

public class Mercado {


        private Mercado() {};
        private static Mercado instance = new Mercado();
        public static Mercado getInstance() {
            return instance;
        }

        private String produto;
        private String codigoBarras;

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public String getCodigoBarras() {
            return codigoBarras;
        }

        public void setCodigoBarras(String codigoBarras) {
            this.codigoBarras = codigoBarras;
        }
    }

