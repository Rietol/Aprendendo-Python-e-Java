package aula07;
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private enum Faixas {
        Invalido, Leve, Medio, Pesado
    }
    private Faixas categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos
    public void apresentar() {
        System.out.println("--------------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + "anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Com " + this.getVitorias() + " vitórias, " + this.getDerrotas() + 
                " derrotas e " + this.getEmpates() + " empates!");
    }
    
    public void status() {
        System.out.println("--------------------------------------");
        System.out.println(this.getNome());
        System.out.println("é um peso" + this.getCategoria());
        System.out.println(this.getVitorias() + "vitórias");
        System.out.println(this.getDerrotas() + "derroas");
        System.out.println(this.getEmpates() + "empates");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
//Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public Faixas getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 55.2) {
            this.categoria = Faixas.Invalido;
        } else if (peso <= 70.3) {
            this.categoria = Faixas.Leve;
        } else if (peso <= 83.9) {
            this.categoria = Faixas.Medio;
        } else if (peso <= 120.2) {
            this.categoria = Faixas.Pesado;
        } else {
            this.categoria = Faixas.Invalido;
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    
}
    