/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariosenha;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UsuarioSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarando variaveis
        String usuario;
        String senha;
        
        //Capturando as informção do digitadas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        usuario = teclado.next();
        System.out.print("Digite sua senha: ");
        senha = teclado.next();
        
       
        
       
        //Validand as informações do usuário
        if (usuario.equals("Henrique") && senha.equals("teste")){
            System.out.println("Usuario e senha validados");
        }else{
            System.out.println("Usuario e senha incorretos");
        }
        
        // if (usuario.equals("??") == senha.equals("??")){
           // System.out.println("Invalido");
       // }else{
          //  System.out.println("Ok");
        //}
            
        
                
            
        
        
    }
    
}
