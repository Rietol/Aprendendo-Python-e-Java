package aula05;

public class ContaBanco {
    public int numConta;
    protected enum tipoConta {
        CC, CP
    };
    protected tipoConta tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    public void estadoAtual() {
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + (this.isStatus() ? "Aberta" : "Fechada"));
    }   
    
    public void abrirConta(tipoConta t){
        this.setStatus(true);
        this.setTipo(t);
        if (t == (tipoConta.CC)) {
            this.setSaldo(50);
        } else if(t == (tipoConta.CP)) {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("A sua conta foi fechada!");
        } else if (this.getSaldo() < 0){
            System.out.println("Sua conta está devendo, por favor quite suas dívidas");
        } else{
            System.out.println("Sua conta tem saldo restante nela"
                    + "Por favor retire todo o saldo dela");
        }
    }
        
    public void depositar(double valor){
        if (this.isStatus() != true){
            System.out.println("ERRO! Crie uma conta antes de tentar depositar!");
        }else if(valor <= 0){ 
            System.out.println("Insira um valor válido!");
        }else{
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Foi depositado " + valor + "R$ à sua conta" 
                    + "agora ela tem o saldo de:" + this.getSaldo() + "R$");
        }
    }
    
    public void sacar(double valor) {
        if (this.isStatus() != true){
            System.out.println("ERRO! Crie uma conta antes de tentar sacar!");
        }else if (valor > this.getSaldo()){
            System.out.println("Esse valor excede o seu saldo!");
        }else if(valor < 0) {
            System.out.println("Insira um valor válido para essa transação!");
        }else {
            this.setSaldo(this.getSaldo() - valor);
        }   
    }
    
    public void pagarMensal() {
        if (this.getTipo() == tipoConta.CC) {
            this.setSaldo(this.getSaldo() - 12);
        }else{
            this.setSaldo(this.getSaldo() - 20);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setTipo(tipoConta t) {
        this.tipo = t;
    }

    public tipoConta getTipo() {
        return tipo;
    }
}



