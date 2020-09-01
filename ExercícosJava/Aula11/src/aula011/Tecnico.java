package aula011;
public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar() {
        System.out.println(this.getNome() + "praticou no turno vespertino.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
}
