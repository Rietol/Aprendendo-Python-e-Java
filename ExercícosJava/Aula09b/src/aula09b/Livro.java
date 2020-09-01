package aula09b;
public class Livro implements Publicação{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos
    public void detalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getTotPaginas());
        System.out.println("O marcador está na página " + this.getPagAtual());
        System.out.println("O livro " + (this.isAberto() ? "está" : "não está") + " aberto.");
        System.out.println(this.getLeitor().getNome() + " está lendo este livro");
    }
    
    //Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //Métodos Abstratos
   
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas() && 0 <= p) {
            this.setPagAtual(p);
        } else {
            System.out.println("Esta página não existe!");
        }
    }

    @Override
    public void avançarPag() {
        if (this.getPagAtual() == this.getTotPaginas()) {
            System.out.println("Você chegou ao fim!");
        } else {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() == 0) {
            System.out.println("Você já está no começo!");
        } else {
            this.setPagAtual(this.getPagAtual() -1);
        }
    }
    
    
    
}
