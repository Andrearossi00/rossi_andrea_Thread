

public class GestoreProcesso {

    /**
     * GestoreProcesso agisce come un processo padre che avvia e attende che finiscano i thread figli
     */

    //Costruttore
    public GestoreProcesso(){
        System.out.println("Costruttore e GestoreProcesso: pronto per avviare la produzione di borse. ");
    }

    /**
     * Avvia la produzione: crea due thread che lavorano in parallelo e li attende con join().
     */

    public void avviaProduzione(){
        Thread cucitore = new Thread(new CucitoreBorse("Cucitore"));
        Thread lucidatore = new Thread(new LucidatoreBorse("Lucidatore"));

        System.out.println("GestoreProcesso: avvio della produzione di borse.");

        cucitore.start();
        lucidatore.start();

        try {
            cucitore.join();
            lucidatore.join();
        } catch (InterruptedException e) {
            System.out.println("GestoreProcesso: interrotto-" + e.getMessage());

        }

        System.out.println("GestoreProcesso: produzione completata. Borse pronte.");

    }
}
