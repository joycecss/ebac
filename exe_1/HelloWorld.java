package exe_1;

public class HelloWorld {
    public static void main(String[] args){
       String ambiente = args[0];
       if(ambiente.equalsIgnoreCase("DEV")){
           System.out.print("Executando em DEV");
       } else if (ambiente.equalsIgnoreCase("teste")) {
           System.out.print("Executando em Teste");
       } else {
           System.out.print(ambiente);
       }
    }
}