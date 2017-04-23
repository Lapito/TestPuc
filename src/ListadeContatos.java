import java.util.ArrayList;
import java.util.Iterator;

public class ListadeContatos {

	private static ArrayList<Contato> al = new ArrayList<Contato>();
	
	public static void addAl(String nome, String email, String numero) {
		al.add(new Contato(nome, email, numero));
	}
	
	public static void removeAl(int opcao) {
		al.remove(opcao);
	}
	
	public static void listAl() {
		int i = 0;
		Iterator<Contato> it = al.iterator();
		while(it.hasNext()) {
			Contato aux = it.next();
			System.out.println("Contato " + i);
			i++;
			System.out.println(aux);
		}
	}
	
	public static void listcontAl(int num) {
		System.out.println(al.get(num).toString());
	}
}
