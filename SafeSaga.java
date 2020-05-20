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
        String enter;

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
    
            //Talvez adicionar um "enter".
            {
            System.out.println("Pressione o enter para continuar:");
            enter = entrada.nextLine();
            }
            //Ver algo para limpar a tela antes de exibir esta.
             System.out.println("                Como jogar");
            
             System.out.println("Safe Saga é um jogo bem simples de ser\n"
             + " jogado, basta seguir as instruções de parágrafo que o livro\n"+
               "mandar você e à medida que vai avançando entenderá melhor e\n"
             + " vera que é bem simples de jogar à medida que alcançar a fase\n"
             + " dos desafios poderá utilizar suas habilidades escolhidas, use\n"
             + " a ficha do personagem para manter sempre atualizado as\n"
             + " informações de como está indo no jogo, a cada desafio que você\n"
             + " perde para o hacker, 25% dos seus dados serão disponibilizados\n"
             + " para todas as pessoas que queiram na internet, o objetivo é\n"
             + " chegar ao final do livro perdendo o mínimo possível de dados e\n"
             + " a única maneira de isso acontecer e você errando o mínimo\n"
             + " possível durante o desenrolar de nossa história, o mais legal\n"
             + " de tudo isso e você se sentir parte dessa história, e o intuito\n"
             + " desse jogo é para que você possa se divertir muito, recomendado\n"
             + " a todos os públicos.");
             System.out.println();
             System.out.println("Este livro será compartilhado em um PDF\n"
             + " editável na ficha do personagem para que possam manter as\n" +
               "anotações necessárias durante todo jogo.");
    }       
}
