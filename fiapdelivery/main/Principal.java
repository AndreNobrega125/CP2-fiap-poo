package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

    public static void main(String[] args) {
        System.out.println("--- Sistema FiapDelivery ---\n");

        Caminhao caminhao1 = new Caminhao("ABC-1234", 500.0, 4);
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Rota rota1 = new Rota(pacote1, caminhao1);

        rota1.iniciarRota();

        pacote1.atualizarStatus("Em Transito");
        System.out.println("\nNovo status do pacote: " + pacote1.getStatus());

        System.out.println("\n--- Teste da heranca com Moto ---");
        Moto moto1 = new Moto("XYZ-9999", 40.0, true);
        System.out.println("Placa da moto: " + moto1.getPlaca());
        System.out.println("Capacidade da moto: " + moto1.getCapacidade() + " kg");
        System.out.println("Possui bau: " + moto1.isPossuiBau());
    }
}