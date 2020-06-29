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
        status = false;
        saldo = 0;
    }
    
    public void abrirConta(tipoConta t){
        setStatus(true);
        if (t == (tipoConta.CC)) {
            this.setSaldo(50);
        } else{
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            setStatus(false);
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
                    + "agora ela tem o saldo de:" + saldo + "R$");
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



