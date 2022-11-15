package Exercícios;

public class InstagramNotificador implements Notificador {
    public String contaInstagram;

    public InstagramNotificador(String contaInstagram) {
        this.contaInstagram = contaInstagram;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("A conta " + contaInstagram + " te enviou uma mensagem: " + msg + "!");
    }

    public static void main (String[] args){
        InstagramNotificador celularFelipe = new InstagramNotificador("Gabriel98_");
        celularFelipe.notificar("Gostei muito da sua foto! Bela paisagem");
    }
}
