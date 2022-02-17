import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Metodos {
    public static void requisitaSenha(){
        
    }

    public static void validaUsuario() {
        int i = 0;
        System.out.println("Sigite o nome de usuário: ");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        if(nome.equals(Registro.usuario)){
            return;
        }else{
            while(i < 3){
                System.out.println("Usuário incorreto! Tente Novamente: ");
                nome = s.nextLine();
                if(nome.equals(Registro.usuario)){
                    i = 5;
                }else{
                    i++;
                }
            }
            if(i != 5){
                System.exit(0);
            }
        }
    }

    public static void PegaHora() {
        System.out.println("Digite a hora de entrada:");
        Scanner s = new Scanner(System.in);
        int hora = s.nextInt();
        if(6 > hora && hora > 0){

        }
    }
}
