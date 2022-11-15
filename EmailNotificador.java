package Exercícios;

public class EmailNotificador implements Notificador {
    public String email;

    public EmailNotificador(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String msg) {
        System.out.println("O email " + email + " te enviou um email: " + msg + "!");
    }

    public static void main (String[] args){
        EmailNotificador celularAntonia = new EmailNotificador("bomdiaecompanhia@gmail.com");
        celularAntonia.notificar("Oi Antonia, você passou em nosso teste!! Para mais informações ligue 40028922!");
    }
}
