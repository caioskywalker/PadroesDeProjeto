package br.com.caio.facade;

import br.com.caio.facade.subsistema.cep.CepAPI;
import br.com.caio.facade.subsistema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, Long cep){

        String cidade = CepAPI.getInstanceCepAPI().recuperarCidade(58495L);
        String estado = CepAPI.getInstanceCepAPI().recuperarEstado(6364364L);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }












}
