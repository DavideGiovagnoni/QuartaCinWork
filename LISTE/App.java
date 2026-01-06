public class App {
public static void main(String[] args) {
   Lista l = new Lista();
   l.addTail(new Nodo("Dario"));
   l.addTail(new Nodo("Davide"));
   l.addHead(new Nodo("Franco"));
        l.add("bologna alè");
System.out.println(l);
}
}