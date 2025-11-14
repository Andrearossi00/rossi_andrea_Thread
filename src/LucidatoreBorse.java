public class LucidatoreBorse implements Runnable {

    /**
     * LucidaturaBorse simula la fase di lucidatura e controllo qualità.
     */
    private String nome;

    //Costruttore
    public LucidatoreBorse(String nome){
        this.nome = nome;

    }

    @Override
    public void run (){
        try {
            System.out.println(nome + ": preparo le borse per la lucidatura.");
            Thread.sleep(300);
            System.out.println(nome + ": inizio lucidatura delle borsa.");
            Thread.sleep(800);
            System.out.println(nome + "finisco l lucidatua e controllo la qualità.");

        } catch (InterruptedException e){
            System.out.println( nome + ":interrotto-" + e.getMessage());
        }
    }


}
