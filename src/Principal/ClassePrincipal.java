package Principal;

import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String args[]){
		
		Scanner ler = new Scanner(System.in);
		Login login = new Login();
		
		//Chama o metodo Valida��o Login
		login.validacaoLogin(null, null);

	}
}
