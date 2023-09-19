package br.com.caio.facade.subsistema.crm;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, Long cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(nome + "\n");
        System.out.println(cep + "\n");
        System.out.println(cidade + "\n");
        System.out.println(estado + "\n");

    }
}
