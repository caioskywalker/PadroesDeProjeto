package br.com.caio.facade.subsistema.cep;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstanceCepAPI() {
        return instance;
    }
    public String recuperarCidade(Long cep){
        return "rj";
    }

    public String recuperarEstado(Long cep){
        return "RIO DE JANEIRO";
    }
}


