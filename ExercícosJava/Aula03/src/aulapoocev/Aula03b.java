package aulapoocev;
public class Aula03b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; //é protegido, porém faz parte da classe Caneta portanto podemos utilizar-lo
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }   
    
}
