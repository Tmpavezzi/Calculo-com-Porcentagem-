import java.util.Scanner;


public class AtividadeEmSala {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Nome do vendedor");
        String nome = entrada.next().strip();
        System.out.println("Salario");
        float n1 = entrada.nextFloat();
        System.out.println ("Venda feitas");
        float n2 = entrada.nextFloat();
        float Por = 15 / 100;
       
        float Soma1 = (Por * n2)+n2;
        
        float Soma2= Soma1 + n1;
        
        
        System.out.print("Resultado" + Soma2);
       
        
        
    }
    
}
