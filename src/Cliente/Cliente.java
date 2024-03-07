package Cliente;

import Banco.Banco;

public class Cliente implements Banco {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(){
    }

    public Cliente(String numC, String numAg, String n, float s){
        this.setNumeroConta(numC);
        this.setNumeroAgencia(numAg);
        this.setNome(n);
        this.setSaldo(s);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(this.numeroConta.length() == 8 && this.numeroConta.charAt(6) == '-')
            this.numeroConta = numeroConta;
        else
            System.out.println("Número de conta inválido!");
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(this.numeroAgencia.length() == 6 && this.numeroAgencia.charAt(4) == '-')
            this.numeroAgencia = numeroAgencia;
        else
            System.out.println("Número da agência inválido!");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(this.nome.length() <= 30)
            this.nome = nome;
        else
            System.out.println("Nome inválido!");
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo >= 0)
            this.saldo = saldo;
        else
            System.out.println("Saldo não pode ficar negativo");
    }


    @Override
    public void realizarDeposito(float din) {
        if(din >= 0)
            this.setSaldo(this.getSaldo() + din);
    }

    @Override
    public void realizarSaque(float din) {
        if(din >= 0) {
            if (this.getSaldo() >= din)
                this.setSaldo(this.getSaldo() - din);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
