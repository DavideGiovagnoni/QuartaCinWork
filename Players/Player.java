import java.io.FileWriter;
import java.io.IOException;

class Player {
    private String nome;
    private int valore;

    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    public String getNome() {
        return nome;
    }

    public int getValore() {
        return valore;
    }

    public void salvaValoreSuFile() {
        try (FileWriter writer = new FileWriter(nome + ".txt")) {
            writer.write("Valore giocatore: " + valore);
            System.out.println("Valore salvato in " + nome + ".txt");
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio del file: " + e.getMessage());
        }
    }
}