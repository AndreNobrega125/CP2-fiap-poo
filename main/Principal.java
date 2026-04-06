package br.com.fiapdelivery.main;

// Importando as classes que estão no pacote model
import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Sistema FiapDelivery (Refatorado) ---\n");

        // 1. Criação do veículo
        Caminhao caminhao1 = new Caminhao("ABC-1234", 500.0, 4);
        
        // 2. Criação do Pacote
        Pacote pacote1 = new Pacote("BR999", 10.5);

        // 3. Montagem da Rota associando o Pacote ao Veículo
        Rota rotaDeEntrega = new Rota(pacote1, caminhao1);
        
        // 4. Executando a entrega
        rotaDeEntrega.iniciarRota();
        
        // Atualizando o status
        pacote1.atualizarStatus("Em Trânsito");
        System.out.println("Status atual: " + pacote1.getStatus());
    }
}