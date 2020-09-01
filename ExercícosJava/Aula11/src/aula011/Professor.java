package aula011;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    private void receberAumento(float aum) {
        System.out.println(this.getNome() + "recebeu um aumento de " + aum + "R$");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
