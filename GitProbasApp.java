package gitprobas;

import java.util.Date;

public class GitProbasApp {

	public static void main(String[] args) {

		String nomeApp = GitProbasApp.class.getCanonicalName();
		String data = String.valueOf(new Date(2021, 12, 27));
		System.out.println("Clase executábel de probas para Git");
		System.out.println(nomeApp);
		System.out.println(data);
	}
}
