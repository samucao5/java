package avancando;

public class Poo2 {
    public static void main(String[] args) {
        //classe com final

        ContaBancaria conta = new ContaBancaria(255);

        System.out.println("saldo: R$" + conta.getSaldo());

        //classe final - não pode  ser herdada 
        // metodo final - não pode ser sobrescrito
    }
}
