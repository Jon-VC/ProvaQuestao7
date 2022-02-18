import java.util.Scanner;

public class Metodos {
    public static void requisitaSenha(){
        
    }

    public static void validaUsuario() {
        int i = 3;
        System.out.println("Sigite o nome de usuário: ");
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        if(nome.equals(Registro.usuario)){
            return;
        }else{
            while(i > 0){
                System.out.println("Usuário incorreto! Tentativas restantes:" + i);
                System.out.println("Tente novamente: ");
                nome = s.nextLine();
                if(nome.equals(Registro.usuario)){
                    i = 5;
                    break;
                }else{
                    i--;
                }
            }
            if(i != 5){
                System.out.println("Tentativas esgotadas!");
                System.exit(0);
            }
        }
    }

    //Metodo que pergunta, recebe e estabelece a hora
    public static void PegaHora() {
        System.out.println("Digite a hora de entrada:");
        Scanner s = new Scanner(System.in);
        int hora = s.nextInt();
        if(6 >= hora && hora > 0){
            Registro.senhaDoMomento = Registro.senhas[0];
            Registro.comprimentoDoMomento = Registro.comprimento[0];
        }else if(12 >= hora && hora > 6){
            Registro.senhaDoMomento = Registro.senhas[1];
            Registro.comprimentoDoMomento = Registro.comprimento[1];
        }else if(18 >= hora && hora > 12){
            Registro.senhaDoMomento = Registro.senhas[2];
            Registro.comprimentoDoMomento = Registro.comprimento[2];
        }else{
            Registro.senhaDoMomento = Registro.senhas[3];
            Registro.comprimentoDoMomento = Registro.comprimento[3];
        }
    }

    //Metodo que valida a senha correspondente ao periodo
    public static void validaSenha() {
        int i = 3;
        System.out.println("Sigite a senha do turno: ");
        Scanner s = new Scanner(System.in);
        String senha = s.nextLine();
        if(senha.equals(Registro.senhaDoMomento)){
            return;
        }else{
            while(i > 0){
                System.out.println("Senha incorreta! Tentativas restantes:" + i);
                System.out.println("Tente novamente: ");
                senha = s.nextLine();
                if(senha.equals(Registro.usuario)){
                    i = 5;
                    break;
                }else{
                    i--;
                }
            }
            if(i != 5){
                System.out.println("Tentativas esgotadas!");
                System.exit(0);
            }
        }
    }

    public static void saudacao() {
        System.out.println(Registro.comprimentoDoMomento + ", você se logou ao nosso sistema.");
    }
}
