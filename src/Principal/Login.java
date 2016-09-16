//fazendo um teste 12345
package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	private String usuario;
	private String senha;
	
	//Métodos Getters e Setters 
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString(){
		return usuario + "|" + senha;
	}
	
	
	//Metodo Login e Verificação 
	public void validacaoLogin(String usuario,String senha) throws IOException{
			
		Login loginLogin = new Login();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("**********CAMPO DE LOGIN**********\n");
		
		System.out.print("Usuário: ");
		loginLogin.setUsuario(ler.nextLine());
			
		System.out.print("Senha: ");
		loginLogin.setSenha(ler.nextLine());
		
		//Salvando os usuários em arquivos TXT - As classes foram importadas em passo a passo...
		File arq = new File("src/Principal/usuariosTabelioes/usuarios.txt"); //url - parâmetro de criação para File que representa o caminho do arquivo
		FileWriter escritor = new FileWriter(arq,true); // o valor true é para não apagar valor anterior existente.
		/*escritor.write(loginLogin.toString()+"\n"); //utiliza o modelo do toString criado
		//escritor.write(usua2.toString()+"\n");//utiliza o modelo do toString criado
		//escritor.write(usua3.toString()+"\n");//utiliza o modelo do toString criado
		escritor.flush(); //libera o buffer de memória
		escritor.close(); //fecha a escrita no arquivo*/
		
		//Recuperando os valores cadastrados em arquivo
		//Seria redundante (aqui!) utilizar outro objeto File - utilizaremos arq.
		FileReader leitor = new FileReader(arq);
		BufferedReader bufferLeitura = new BufferedReader(leitor);
		String linha; //Linha do arquivo
		//ArrayList<Login> acessos = new ArrayList<>();
		while((linha = bufferLeitura.readLine()) != null){//Irá repetir até que a linha do arquivo seja vazia
			String[] loginPassword = linha.split("\\|"); //Separa os valores da linha pelo separador |
			//System.out.println(loginPassword[0]+" ******** "+loginPassword[1]);
			if(loginLogin.usuario.equals(loginPassword[0]))&& (loginLogin.senha.equals(loginPassword[1])){
				
			}
			
		}
			
		/*if((loginLogin.getUsuario().equals(0)) && (loginLogin.getSenha().equals(1))){
			
			Menu listaMenu = new Menu();
			listaMenu.listaMenu();
			
			
		}else{
			
			System.out.print("\nUsuário e/ou Senha incorretos.");
		}
	}//fim validação login*/
	
	
}//fim da classe login


