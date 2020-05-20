import java.util.Scanner;

/*
 Projeto Integrador: Desenvolvimento de lógica

 */

/**
 * Autores:
• Alexsandro da Silva Ramos
• Carlos Henrique Pavão Inácio
• Patricia Ferreira de Sousa
• Renan Ferreira Novaes
• Rodrigo Dias
• Vinicius Da Silva Alves
 */
public class NewClass {
        public static void main(String[] args) {
        
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("                Bem Vindo ao Safe Saga.");
        System.out.println();
        System.out.println();
        System.out.println("Introdução: ");
        System.out.println();
        System.out.println();
        System.out.println("A história do jogo se passa no início dos" +
        " anos 2003, no início da popularização dos\n"+"computadores no Brasil,"
         + " a história se passa na cidade de São Paulo.\n"
         + "Safe Saga conta a história de um jovem que vive um grande desafio em sua\n" +
"vida pois acaba tendo suas informações roubadas por um hacker mais o\n"
                + "grande diferencial é que o hacker deseja apenas ensinar ao personagem\n" +
"medidas de segurança da informação. Venha embarcar nesses desafios e\n"
                + "aprender também sobre segurança da informação através de um jogo para\n" +
"que consiga aplicar na sua própria vida os princípios ensinados aqui.\n"
         + "O objetivo é ensinar a todos como manter nossas informações seguras em\n" +
"tempos que cada vez mais estamos expostos a ataques hackers e perda de\n"
                + "nossos dados que cada dia que passa se torna mais e mais importante.");
            System.out.println();
            System.out.println("       Venha se divertir com essa história envolvente.");
            System.out.println();
    
            //Talvez adicionar um "enter" para mudar de tela.
            System.out.println("Pressione o enter para continuar:");
            entrada.nextLine();
            
            //Ver algo para limpar a tela antes de exibir esta.
            System.out.println("                Como jogar");
    }       
}
