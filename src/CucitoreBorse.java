public class CucitoreBorse implements Runnable{

    /**
     * CucitoreBorse simula la fase di cucitura e assmblaggio delle borse.
     */
    private String nome;

    //Costruttore
    public CucitoreBorse(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        try{
            System.out.println(nome + ": inizio a cucire la parte principale della borsa.");
            Thread.sleep(700);
            System.out.println(nome + ": finisco di cucire la parte principale.");

            System.out.println(nome + ": inizio ad aggiungere manici e dettagli.");
            Thread.sleep(500);
            System.out.println(nome + ": finisco di assemblare la borsa.");

        } catch (InterruptedException e) {
            System.out.println(nome + ": interrotto-" + e.getMessage());

        }
    }
}
