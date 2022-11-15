package Exercícios;

public class TelefoneNotificador implements Notificador {

    public int numeroTelefone;

    public TelefoneNotificador(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void notificar(String msg){
        System.out.println("O número " + numeroTelefone + " te deixou um recado: " + msg + "!");
    }

    public static void main (String[] args){
        TelefoneNotificador celularIsabel = new TelefoneNotificador(76543190);
        celularIsabel.notificar("Isabel, me ligue, é URGENTE!");
    }

}
