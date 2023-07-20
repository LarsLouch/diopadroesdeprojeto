/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema2.cep;

/**
 *
 * @author Igor
 */
public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Sorocaba";
    }
    
    public String recuperarEstado(String cep){
        return "SP";
    }
}
