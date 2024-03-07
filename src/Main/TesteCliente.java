package Main;

import Cliente.Cliente;


public class TesteCliente {
    public static void main(String[] args){
        Cliente c1 = new Cliente("133713-7","0000-1", "Vitor", 784.55f);

        c1.realizarDeposito(2000);
        c1.realizarSaque(100);

        System.out.println(c1.toString());
    }
}
