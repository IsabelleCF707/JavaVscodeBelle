public class Comandos_Saida{
    public static void main(String [] args){
        System.out.println("Exibindo a mensagem no console");
        //system.out é um comando de saida no console
        System.out.print("testando outra opção");
        System.out.print("Usando print sem ln");
    //a diferença entre o println e o print é que o println pula para a proxima linha, e o print fica tudo na mesma linha
        System.out.println("\n1° linha \n2° linha \n3° linha");
        //\n vai pular para a linha de baixo
        System.out.println("\n1° linha \tnome \tendereco \ttelefone"+
                           "\n2° linha \tnome \tendereco \ttelefone"+
                           "\n3° linha \tnome \tendereco \ttelefone");
        //\t vai tabular, como se estivesse dando um tab. o que estiver depois dele fica um pouco mais pro lado
    }
}