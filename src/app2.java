package src;

import src.model.Camareira;
import src.model.Cliente;
import src.model.Recepionista;

public class app2 {
    public static void main(String[] args) {
        System.out.println("Hotel java");
        System.out.println();

        Cliente cliente1 = new Cliente("Amelia", "(81) 99999-9999", "112.232.466.09");
        Recepionista recepicionista1 = new Recepionista("Jaqueline", "(81) 99999-9987", "222.232.566.09");

    
        recepicionista1.atendeOTelefone();
        recepicionista1.falaIngles();
        
        Camareira camareira1 = new Camareira("Catarina", "(81) 99349-9999", "912.982.466.09");
    }
}
