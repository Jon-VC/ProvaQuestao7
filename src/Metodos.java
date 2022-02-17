import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Metodos {
    public static void requisitaSenha(){
        
    }

    public static void validaUsuario() {
        int i = 0;
        System.out.println("Sigite o nome de usuário: ");
        Scanner s = new Scanner(System.in);
        String nome = s.next();
        if(nome != Registro.usuario){
            while(i < 3){
                System.out.println("Senha incorreta! Tente Novamente: ");
                nome = s.next();
                if(nome == Registro.usuario){
                    break;
                }else{
                    i++;
                }
            }
        }
    }

    public static void PegaHora() {
        SimpleDateFormat hora = new SimpleDateFormat("hh");

    }
}
