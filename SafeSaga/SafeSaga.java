import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

/*
 Projeto Integrador: Desenvolvimento de lógica
 */

/**
 * Autores: • Alexsandro da Silva Ramos • Carlos Henrique Pavão Inácio •
 * Patricia Ferreira de Sousa • Renan Ferreira Novaes • Rodrigo Dias • Vinicius
 * Da Silva Alves
 */
  static int menu() {
    System.out.println("                   Bem Vindo ao Safe Saga.");
    System.out.println("\n                  =========================");
    System.out.println("                  |       1 - Jogar       |");
    System.out.println("                  |     2 - instruções    |");
    System.out.println("                  |      3 - Creditos     |");
    System.out.println("                  |        4 - Sair       |");
    System.out.println("                  =========================\n");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt();

  }

  public static void habilidade() {
    System.out.println(
        "\nEscolha  ate 5 habilidades dentre essas abaixo:\n Uma habilidade pode ser escolhida mais de uma vez.");
    System.out.println();
    System.out.println("1 - Pular - Caso não saiba a resposta pula o desafio do Hacker.");
    System.out.println("2 - Sorte - Jogue dois dados se o resultado for maior que 7 você passa esse desafio.");
    System.out.println("3 - Tente Novamente - você tem a oportunidade de responder novamente caso errou.");
    System.out.println("4 - Bônus por acerto - Permite pular uma questão após 3 acertos consecultivos.");
    System.out.println("5 - Ajuda dos Universitarios - Fica somente Duas alternativas do desafio.");
    System.out.println("6 - Visão além do alcance - revela a resposta correta.");
  }
  static int inicioJogo(){
    System.out.println("Você está no seu ambiente de trabalho, localizado no centro da cidade. "+ 
    "São 17h30 de uma sexta-feira, do dia 07/03/2003 e seu expediente está para terminar. Porém, "+
    "seu chefe te passa uma tarefa de última hora e lhe da a opção de permanecer até mais tarde "+
    "ou terminar a atividade em casa. Em seguida seus amigos te convidam para um happy hour. "+
    "Sua demanda no trabalho para a próxima semana será muito grande e você pensa seriamente "+ 
    "se deve ficar até mais tarde para adiantar o serviço. Mas você não consegue tirar da "+
    "cabeça o fato de que você está morrendo de fome e quer aproveitar o seu novo computador.");
    System.out.println("1- ) Ficar até mais tarde no trabalho."); 
    System.out.println("2- ) Sair no horário e passar no Mc2000 para comprar um Big2000."); 
    System.out.println("3- ) Happy hour. "); 
    System.out.println("4- ) Ir para casa e terminar a tarefa designada a você."); 
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt();
  }
  static int primeiraEscolha(){
    System.out.println("Ao sair tarde do trabalho (Por volta das 22h00), você lembra que precisava "+
            "comprar o CD para o novo jogo que você gostaria de jogar, mas que agora era tarde para encontrar "+
            "uma loja aberta. Coincidentemente, ao andar algumas quadras até a estação do metro, você é  "+
            "abordado por um vendedor ambulante que lhe oferece alguns programas de computador e jogos "+ 
            "lançamentos. Entre eles, está seu tão aguardado jogo. Sem pensar duas vezes, você compra o jogo "+ 
            "do vendedor. (Vamos fazer o teste de sorte para ver se consegue um desconto na mídia).\n "+
            "Chegando em casa você não pensa duas vezes e já inicia a instalação do jogo e faz o procedimento "+
            "para 'crackear'. Porém, você lembra que havia marcado um horário no chat online com uma pessoa na"+
            "qual você conheceu na internet a alguns dias. Sendo assim, você vai para seu encontro virtual.\n" +
            "Lá estava sua/seu correspondente te esperando. Entre uma longa conversa, chega um momento em que "+ 
            "sua/seu correspondente lhe pede seu e-mail para que possa enviar fotos intimas, assim você poderá "+ 
            "saber como de fato ela/ele é.");  
            System.out.println("O que você quer fazer? "); 
            System.out.println("1-)Passa seu e-mail, pois está super curioso. ");
            System.out.println("2-)Da uma desculpa que precisar ir embora pois tem que testar um novo 'programa'"+
            "que acabou de instalar no computador, mas que vai pensar se encaminha o e-mail no próximo encontro.");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a opção desejada");
            return entrada.nextInt(); 
              
  }
  public static void decisao1Escolha1(){
    System.out.println(" Poucos minutos depois você recebe um e-mail. Ansioso para ver o resultado, "+
              "clica no arquivo e é quando você recebe uma mensagem: 'Identificamos que você instalou um programa "+
              "no qual te deixou totalmente vulnerável. Vários dos seus dados foram roubados. Para que eu não libere' " +
              "para o mundo, vamos fazer um jogo");
  }
  static int inicioQuiz(){
    System.out.println("As regras são simples. Farei uma série de perguntas pra testar seus conhecimentos sobre segurança da informação;"+
    " sendo assim, tome muito cuidado ao dar suas respostas, seus dados dependem disso."+ 
    " Acredito que você não tenha nenhuma habilidade especial para passar pelo meu “Quis da Redenção” isso poderia estragar meus planos"+
     " de me divertir com você.\n Você está preparado para começar?\n"+
    "1-)	Sim, vamos lá.\n"+
    "0-)	Não, quero sair correndo\n");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt(); 
  }
  public static void decisao1Alternatica2(){
    System.out.println("Ao encerrar o chat, você percebe que sua tela congela e um bloco de notas abre no seu monitor com a seguinte mensagem"+
    " Não precisamos mais do seu e-mail, identificamos que você instalou um programa no qual te deixou totalmente vulnerável. Vários dos seus"+
    " dados foram roubados. Para que eu não libere para o mundo, vamos fazer um jogo"+
    " Você fica completamente desesperado; todos os seus dados, como: Cartão de crédito, senha de banco, senha de redes sociais, e-mail,"+
     " fotos intimas que você havia mandado para outras pretendentes entre pequenas outras coisas haviam sido roubados.\n\n");
    System.out.println(" '- Hacker:'  Não somos pessoas tão ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma lição para"+
    " que algumas coisas não se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de não perder seus dados e que você possa sair"+
    " bem com tudo isso, mais forte!!"
    );

  }
  static int decisao2(){
    System.out.println("Ao sair mais cedo do trabalho, você vai correndo comprar seu lanche no Mc2000. Chegando lá, você vê que a fila enorme "+
    "por conta do horário. Bom, você resolve esperar pacientemente para ser atendido. Neste meio período, você percebe é uma bela garota/garoto "+
    "abordando as pessoas para fazer uma pesquisa e você até que fica empolgado para poder bater um papo com ela/ele. Chegada a sua vez, ela "+ 
    "pergunta se você teria interesse em participar de uma pesquisa sobre provedores de internet e que no final da pesquisa haverá um brinde.\n "+
    "Você começa a conversar com ela/ele e você sente uma “química” entre vocês dois.\n"+ 
    "1-) Preencher todos os dados da pesquisa, pois você quer agradá-la/lo e não poderá fazer essa desfeita.\n"+
    "2-) Diz que não quer preencher a pesquisa, mas que isso não deveria interferir em uma decisão para um encontro.\n");
    Scanner entrada = new Scanner (System.in);
    System.out.println("Qual sua decisão?");
      
    return entrada.nextInt();
  }
  public static void decisao2Escolha1(){
    System.out.println("Ela/Ele agradece muito de passa pela gentileza e diz que irá te mandar uma mensagem de texto para marcar combinar um "+
    "encontro. Você recebe ao final da pesquisa um CD de provedor de internet. Ela/Ele diz que é uma novidade e que você deveria ver como ela "+
    "é super simples e leve de ser usado em qualquer máquina. Você não vê problema algum, afinal, isso tudo estava acontecendo dentro de uma "+
    "grande rede de fast-food.\n ");
    
  }
  public static void decisao2Escolha2(){
    System.out.println("Ela/Ele fica um pouco chateado/a com sua resposta, mas diz que gostou muito de você e que, e mesmo assim, lhe dará o "+
    "brinde sem preencher os dados e que passará o telefone dela/dele. Ele/ela te entrega um CD de provedor e, junto, um papel com o telefone. "+
    "Você fica muito feliz com a atitude dela/dele e lembra de que de fato queria trocar seu provedor. Você não vê problema algum, afinal, isso "+
    "tudo estava acontecendo dentro de uma grande rede de fast-food.");;
  }
  public static void decisao2Final(){
    System.out.println("Você finalmente consegue comprar seu combo na lanchonete e vai correndo para casa aproveitar seu computador. Claro que "+
    "você não poderia deixar de instalar o novo CD que você ganhou, porque quando você fosse conversar com ela/ele, teria que ter já algum "+
    "assunto para iniciar.\n"+
    "Ao finalizar a instalação, é onde seu pesadelo começa a acontecer. Seu computador congela e aparece uma mensagem 'Seu computador acaba de "+
    "ser invadido e todos os seus dados foram roubados. Para que eu não libere para o mundo, vamos fazer um jogo'\n"+
    " - Hacker: 'Não somos pessoas tão ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma lição para que algumas coisas não "+
    "se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de não perder seus dados e que você possa sair bem com tudo isso, "+
    "mais forte!!");
  }
  static int decisao3() {
      System.out.println("Você sai do serviço às 18:00 e vai com seus amigos"
              + " para aquele momento happy hour e decide executar a tarefa dada"
              + " em casa no final de semana, pois ninguém é de ferro. Depois de"
              + " algumas bebidas você vai para o banheiro e lá você encontra um"
              + " CD em uma capa com a etiqueta “presente de grego”. E você pensa... ");
      System.out.println();
      System.out.println(" Você pegar ou não o CD? ");
      System.out.println("1-) Você pega o CD.");
      System.out.println("2-) Você não pega o CD. ");
          Scanner entrada = new Scanner (System.in);
          
    return entrada.nextInt();
     }
  public static void decisao3Escolha1(){
      System.out.println(" Você pega o CD e nem comenta para seus amigos sobre"
              + " ele. Depois mais algumas bebidas você sente que chegou no seu"
              + " limite e se despede dos parceiros e vai para sua casa, curioso"
              + " para saber o que poderia ter de conteúdo no CD. Na sua casa"
              + " você já vai para o seu computador e vai logo ler o CD "
              + "encontrado e de inicio é iniciado um programa de instalação de"
              + " um jogo que por coincidência você estava louco para comprar."
              + " Você inicia a instalação do jogo normalmente e no final da "
              + "instalação o programa pede para reiniciar o computador. Após"
              + " iniciado o sistema operacional você percebe que tem algo de"
              + " muito estranho, várias janelas sendo abertas e fechadas "
              + "automaticamente durante inicialização do sistema operacional."
              +" E do nada o sistema abre o bloco de notas com a"
              + " mensagem “Olá fulano seu computador foi hackeado e para"
              + " libera-lo você terá que pagar um valor de 5.000 mil reais”."
              + " Você desesperado responde ao hacker que é novo no trabalho e"
              + " tinha completado 2 meses recentemente e tem uma tarefa do"
              + " serviço para fazer se não fizer pode até ser mandado embora"
              + " como está no período de avaliação. O hacker pensou e decidiu"
              + " propor um desafio para liberar o seu computador.");
  }
  public static void decisao3Escolha2(){
      System.out.println(" Você decide não pegar o CD, usa o banheiro e retorna"
              + " para as bebidas juntos com os amigos. Logo depois de um tempo"
              + " um de seus amigos vai ao banheiro e encontra o CD leva-o para"
              + " a roda de amigos e fala sobre ele. E de todos os que estavam"
              + " na mesa você era o único com computador em casa e logo você"
              + " decide ficar com a mídia.Na sua casa você já vai para o seu"
              + " computador e vai ler o CD encontrado e logo é iniciado um"
              + " programa de instalação de um jogo que por coincidência você"
              + " estava louco para comprar. A instalação do jogo fluí"
              + " normalmente e no final da instalação o programa pede para"
              + " reiniciar o computador. Após iniciado o sistema operacional"
              + " você percebe tem algo muito estranho.  E do nada o sistema"
              + " abre o bloco de notas com a mensagem “Olá fulano seu "
              + "computador foi hackeado e para libera-lo você terá que"
              + " pagar uma quantia de 5.000 mil reais”. Você desesperado"
              + " responde ao hacker que é novo no trabalho e tinha completado"
              + " 2 meses recentemente e tem uma tarefa do serviço para fazer"
              + " se não fizer pode até pode ser mandado embora como está no"
              + " período de avaliação. O hacker pensou e teve dó de você e"
              + " decidiu propor um desafio para liberar o seu computador.");
  }
  static int decisao4(){
      System.out.println(" Você dispensa o happy hour com os amigos e alega que"
              + " é novo no serviço e precisa mostrar trabalho. E durante o "
              + "caminho você lembra que precisa comprar um jogo para testar "
              + "seu novo computador.");
                System.out.println(" E fica a dúvida passar ou não na loja"
                        + " para comprar um jogo? ");
                Scanner entrada = new Scanner (System.in);
                               
                System.out.println("1-) Vai na loja de games.  ");
                System.out.println("2-) Direto para a sua casa  ");
                
                return entrada.nextInt();
  }
  public static void decisao4Escolha1(){
      System.out.println(" Na loja de games você nota que o preço do jogo"
              + " interessado era muito alto e no momento estava sem dinheiro"
              + " para compra-lo devido sua recente compra do computador."
              + "Você abandona a loja e volta para o caminho da sua casa e lá"
              + " lembra do CD que seu amigo achou no banheiro do boteco. "
              + "Chegando na sua casa você corre para ver o conteúdo da mídia e"
              + " logo percebe que se trata-se de um jogo. E logo o jogo que"
              + " você queria comprar, ansioso você nem pensa duas vezes para"
              + " instala-lo. A instalação do jogo fluí normalmente e no final"
              + " da instalação o programa pede para reiniciar o computador."
              + " Após iniciado o sistema operacional você percebe tem algo"
              + " muito estranho, várias janelas pretas sendo abertas e fechando"
              + " sozinho.  E do nada o sistema abre o bloco de notas com a"
              + " mensagem “Olá fulano seu computador foi hackeado e para "
              + "libera-lo você terá que pagar uma quantia de 5.000 mil reais”."
              + " Você desesperado responde ao hacker que não tem o dinheiro e "
              + "que é novo no trabalho e tinha completado 2 meses recentemente "
              + "e tem uma tarefa do serviço para fazer se não fizer pode até "
              + "pode ser mandado embora como está no período de avaliação. "
              + "O hacker pensou e teve dó de você e decidiu propor um desafio "
              + "para liberar o seu computador.");
  }
  public static void decisao4Escolha2(){
      System.out.println("Você foi direto para a sua casa e decide logo jantar "
              + "para matar a fome que o incomodava. Após a refeição você decide"
              + " ver o conteúdo da mídia no seu PC. De imediato foi executado "
              + "um pacote de instalação de um jogo e você estava ansioso para "
              + "testar o desempenho do seu novo computador e um jogo era tudo o"
              + " que você queria. Você inicia a instalação sem nem pensar duas "
              + "vezes e no final o programa pede para reiniciar o computador. "
              + "Após iniciado o sistema operacional você percebe tem algo muito"
              + " estranho, várias telas pretas aparecem durante a inicialização do"
              + " Windows.  E do nada o sistema abre o bloco de notas com a "
              + "mensagem “Olá fulano seu computador foi hackeado e para libera-lo"
              + " você terá que pagar uma quantia de 5.000 mil reais”."
              + "Você em um primeiro momento não acredita e pediu provas para o"
              + " hacker e ele solicitou para você tentar abrir um documento e "
              + "o documento solicitado era justo o trabalho que seu chefe tinha"
              + " solicitado para você fazer. Em choque você entra em desespero "
              + "e responde ao hacker que não tem o dinheiro e como é novo no "
              + "trabalho e só tinha 2 meses serviço e este documento tem que "
              + "ser entregue na segunda-feira se não pode até ser mandado "
              + "embora como está no período de experiência."
              +" O hacker pensou e teve dó de você e decidiu propor um desafio"
              + " para liberar o seu computador. ");
  }
  
  public static boolean pergunta1(){ 
    Scanner entrada = new Scanner (System.in);
    
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Confidencialidade; integridade; disponibilidade; autenticidade"); //resposta correta
        alternativas.add("Confidencialidade; não repúdio; disponibilidade; autenticidade"); 
        alternativas.add("Confidencialidade; disponibilidade; autenticidade"); 
        alternativas.add("Integridade; disponibilidade; autenticidade"); 
        
        Collections.shuffle(alternativas);
        do{
        System.out.println();
        
    System.out.println("Quais dessas alternativas sãos os princípios básicos da Segurança da informação:");
    
      System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Confidencialidade; integridade; disponibilidade; autenticidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Confidencialidade; integridade; disponibilidade; autenticidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Confidencialidade; integridade; disponibilidade; autenticidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Confidencialidade; integridade; disponibilidade; autenticidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
               }
         }while(!acertou);
         
        return acertou;
  }
    
  public static boolean pergunta2(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("disponibilidade"); //resposta correta
        alternativas.add("autenticidade"); 
        alternativas.add("confidencialidade"); 
        alternativas.add("integridade"); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("Para que você possa ter alguma chance, vai uma questão fácil"
            + " para você responder. Qual o princípio básico de Segurança\n"
            + " da informação que garante o sigilo de uma informação."
            + " Para garantir, utilizamos algum processo de criptografia de informações.");
            
            System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("confidencialidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("confidencialidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("confidencialidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("confidencialidade")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
        }
        }while(!acertou);
        
        return acertou;
  }
  
  public static boolean pergunta3(){ 
    Scanner entrada = new Scanner (System.in);
    
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos."); //resposta correta
        alternativas.add("Proteção da informação contra reprodução não autorizada."); 
        alternativas.add("Certeza absoluta de que uma informação provém das fontes anunciadas e não foi modificada ao longo do processo."); 
        alternativas.add("Qualidade ou estado legal; conformidade com a lei; legitimidade."); 
        alternativas.add("Prover a informação no momento em que for requerida por quem é de direito."); 
        
        Collections.shuffle(alternativas);
        
        do{
        System.out.println();
        
    System.out.println("Qual das opções abaixo, melhor define Confidencialidade?");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        System.out.println("5 -" + alternativas.get(4));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Proteção da informação contra reprodução não autorizada.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Proteção da informação contra reprodução não autorizada.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Proteção da informação contra reprodução não autorizada.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Proteção da informação contra reprodução não autorizada.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 5:
         if(alternativas.get(3).equals("Proteção da informação contra reprodução não autorizada.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                
               }
        
        }while(!acertou);
        
        
        return acertou;
  }
    
  public static boolean pergunta4(){ 
    Scanner entrada = new Scanner (System.in);
    
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Certeza absoluta de que uma informação provém das fontes anunciadas e não foi modificada ao longo do processo."); //resposta correta
        alternativas.add("Proteção da informação contra reprodução não autorizada."); 
        alternativas.add("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos."); 
        alternativas.add("Característica relacionada ao fornecimento de informações apropriadas no momento certo por sistemas ou processos para a tomada de decisões dos gestores."); 
        
        Collections.shuffle(alternativas);
        
    do{
        
        System.out.println();
        
    System.out.println("Mais uma questão para te dar chance de não perder seus preciosos dados. Qual das opções abaixo, melhor define Integridade?");
        
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Propriedade relacionada à precisão da informação, bem como sua validade de acordo com os padrões e expectativas estabelecidos.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
        }
        
     }while(!acertou);
        
        
        return acertou;
  }
  
  public static boolean pergunta5(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Verifica se uma entidade é realmente o que diz ser."); //resposta correta
        alternativas.add("Protege as informações contra alterações não autorizadas."); 
        alternativas.add("Evita que uma entidade negue que foi ela quem executou determinada ação."); 
        alternativas.add("Permite que uma entidade se identifique."); 
        alternativas.add("Determina as ações que uma entidade pode executar."); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
        System.out.println("Vamos ver se você chegou a, pelo menos fazer alguma pesquisa na internet\n"
            + " antes de responder essa questão. Considerando os requisitos ou princípios básicos de \n"
            + "segurança, assinale a alternativa que melhor descreve o requisito de Autorização.");
    
        System.out.println();
        
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        System.out.println("5 -" + alternativas.get(4));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Determina as ações que uma entidade pode executar.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Determina as ações que uma entidade pode executar.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Determina as ações que uma entidade pode executar.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Determina as ações que uma entidade pode executar.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
            case 5:
         if(alternativas.get(3).equals("Determina as ações que uma entidade pode executar.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
        
        }
          }while(!acertou);
        
        
        return acertou;
  }
  
  public static boolean pergunta6(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Biometria"); //resposta correta
        alternativas.add("Senha com oito caracteres (letras maiúsculas, minúsculas e caracteres especiais)"); 
        alternativas.add("Captcha"); 
        alternativas.add("Geração automática de login para acesso"); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("Na Internet, um usuário pode se apossar indevidamente do\n"
            + " login e da senha de outra pessoa para acessar o sistema em seu lugar.\n"
            + " Assinale a opção que indica uma tecnologia utilizada para impedir esse\n"
            + " tipo de acesso indevido.");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Biometria")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Biometria")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Biometria")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Biometria")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
               }
        
        }while(!acertou);
        
        return acertou;
  }
  
  public static boolean pergunta7(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Certo"); //resposta correta
        alternativas.add("Errado"); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("Estou com tanta pena de você que vou entrar uma questão \n"
            + "muito fácil. A respeito da segurança da informação, julgue os itens\n"
            + " subsequente: A descoberta, por hackers, de senha que contenha números,\n"
            + " letras minúsculas e maiúsculas e os caracteres #$ é considerada difícil.");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Certo")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Certo")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
        }  
        
        }while(!acertou);
        
        return acertou;
  }
  
  public static boolean pergunta8(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus."); //resposta correta
        alternativas.add("O vírus de computador consegue viver sozinho, não sendo \n"
                + "necessário nenhum programa hospedeiro."); 
        alternativas.add("Para que um vírus comece a atuar no computador da vítima,\n"
                + " não é necessário que seja executado."); 
        alternativas.add("Vírus de computador nunca utilizam arquivos executáveis \n"
                + "como hospedeiro, utilizam-se somente de arquivos no formato docx."); 
        
        alternativas.add("O sistema operacional Windows 10 é imune a vírus de \n"
                + "computador, não sendo necessária a utilização de antivírus."); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("Vírus é um programa ou parte de um programa de computador,\n"
            + " normalmente malicioso, que se propaga inserindo cópias de si mesmo.\n"
            + " Sobre vírus, assinale a alternativa correta.");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        System.out.println("5 -" + alternativas.get(3));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
            case 5:
         if(alternativas.get(3).equals("Para que se torne ativo e dê continuidade ao processo de \n"
                + "infecção, o vírus depende da execução do programa ou arquivo \n"
                + "hospedeiro, ou seja, para que o computador seja infectado, é \n"
                + "preciso que um programa já infectado seja executado. Pen-drives \n"
                + "e e-mails são meios de propagação de vírus.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
               }
        }while(!acertou);
        
        return acertou;
  }
  
  public static boolean pergunta9(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Requisitos informacionais de segurança."); 
        alternativas.add("Vulnerabilidade de ativos informacionais."); 
        alternativas.add("Engenharia social."); //resposta correta
        alternativas.add("Ataque do tipo exploitation.");
        alternativas.add("Engenharia reversa.");
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("O conjunto de procedimentos e ações que são utilizados para\n"
            + " adquirir informações de uma organização ou de uma pessoa por meio de\n"
            + " contatos falsos sem o uso da força, do arrombamento físico ou de \n"
            + "qualquer brutalidade é denominado");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
        System.out.println("3 -" + alternativas.get(2));
        System.out.println("4 -" + alternativas.get(3));
        System.out.println("5 -" + alternativas.get(4));
        
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Engenharia social.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Engenharia social.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 3:
         if(alternativas.get(2).equals("Engenharia social.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
            case 4:
         if(alternativas.get(3).equals("Engenharia social.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
            case 5:
         if(alternativas.get(3).equals("Engenharia social.")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
               }
        }while(!acertou);
        
        
        return acertou;
  }
  
  public static boolean pergunta10(){ 
    Scanner entrada = new Scanner (System.in);
    boolean acertou = false;
    
        List alternativas = new ArrayList();
        
        alternativas.add("Certo"); //resposta correta
        alternativas.add("Errado"); 
        
        Collections.shuffle(alternativas);
        
        do{
        
        System.out.println();
        
    System.out.println("As tentativas de engenharia social podem ser evitadas por meio de\n"
            + " medidas simples, como, por exemplo, não fornecer quaisquer informações \n"
            + "consideradas como confidenciais a pessoas desconhecidas");
    
        System.out.println();
    
        System.out.println("1 -" + alternativas.get(0));
        System.out.println("2 -" + alternativas.get(1));
                
            int opcao = entrada.nextInt();
         
        switch (opcao){
            case 1:
         if(alternativas.get(0).equals("Certo")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
          }
                break;
            case 2:
         if(alternativas.get(1).equals("Certo")){
         System.out.println("Resposta correta");
         acertou=true;
         } else {
         System.out.println("Resposta incorreta");
         }
                break;
        }
        
        }while(!acertou);
        
        return acertou;
  }    
 
    

  
          
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int vida =100;
    int perda=25;
    int[] habilidade = new int[5];
    int retornar=0;
    int confirma = 0;
    int decisao=0;
    
    do{
      int opcao = menu();

      switch (opcao) {
        case 1:
          System.out.println("Vamos Criar o Seu personagem: ");
          System.out.println();
          System.out.println("Como vai se chamar seu personagem?");
          String nomePersonagem = entrada.next();

          do {
            habilidade();
            for (int i = 0; i < 5; i++) {
              habilidade[i] = entrada.nextInt();
            }
            System.out.println(nomePersonagem+ " Voce escolheu as seguintes habilidades: ");
            for (int i = 0; i < habilidade.length; i++) {
              switch (habilidade[i]) {
                case 1:
                  System.out.println("Habilidade[" + (i + 1) + "]: Pular");
                  break;
                case 2:
                  System.out.println("Habilidade[" + (i + 1) + "]: Sorte");
                  break;
                case 3:
                  System.out.println("Habilidade[" + (i + 1) + "]: Tente Novamente");
                  break;
                case 4:
                  System.out.println("Habilidade[" + (i + 1) + "]: Bonus por acerto");
                  break;
                case 5:
                  System.out.println("Habilidade[" + (i + 1) + "]: Ajuda dos universitários");
                  break;
                case 6:
                  System.out.println("Habilidade[" + (i + 1) + "]: Visão alem do alcance");
                  break;
              }
            }
            System.out.println("Você confirma as habilidade:\n1-Sim\n2-Não");
            confirma = entrada.nextInt();
            
            if(confirma ==2){
              System.out.println("Qual habilidade você deseja trocar?");
              int troca = entrada.nextInt();
            }
          } while (confirma != 1);
          
          int escolhas = inicioJogo();

          switch(escolhas){
            case 1:
              decisao = primeiraEscolha();
              if(decisao == 1){
                decisao1Escolha1();
                System.out.println("");
              }else if(decisao ==2){
                decisao1Alternatica2();
                System.out.println("");
              }
              break;
            case 2:
              decisao = decisao2();
              if(decisao == 1){
                  decisao2Escolha1();
              }else if(decisao ==2){
                decisao2Escolha2();
              }
              decisao2Final();
              break;
            case 3:
              decisao = decisao3();
              if(decisao == 1){
                 decisao3Escolha1();
              } else if (decisao == 2){
                  decisao3Escolha2();
              }
              break;
            case 4:
               decisao = decisao4();
              if(decisao == 1){
                 decisao4Escolha1();
              } else if (decisao == 2){
                  decisao4Escolha2();
              }
              break;
              
          }
          decisao = inicioQuiz();
          
          if(decisao == 1){
          } 
            if(pergunta1() == true){
            }
            if(pergunta2() == true){
               }
            if(pergunta3() == true){
               }
            if(pergunta4() == true){
               }
            if(pergunta5() == true){
               }
            if(pergunta6() == true){
               }
            if(pergunta7() == true){
               }
            if(pergunta8() == true){
               }
            if(pergunta9() == true){
               }
            if(pergunta10() == true){
               }
           

          

          break;
        case 5:
          System.out.println("               Instruções: ");

          System.out.println("Digite o número 0 para retornar ao menu");
          System.out.println("Digite o número 4 para sair do jogo");
          decisao = entrada.nextInt();

          break;
        case 6:

      }
    }while(decisao != 0 && vida > 0 ); 
    System.out.println("Fim de jogo!"
            + " Seus dados foram expostos na internet e toda sua vida esta comprometida por conta disso");
  }  
}
