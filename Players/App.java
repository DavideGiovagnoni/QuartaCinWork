public class App {
    public static void main(String[] args) throws Exception {

        Player p = new Player("Davide");
        Player p2 = new Player("Luca");
        
        //p2.setValore(150);
        p2.load();

        System.out.println(p);
        System.out.println(p2);
        p.save();
        p2.save();
    }
}