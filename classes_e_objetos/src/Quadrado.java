

public class Quadrado {
    //Atributos
    private double lado;

    //Construtor para inicializar atributos
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método para mudar o valor do lado
    public void setLado(double novoLado) {
        this.lado = novoLado;
    }

    // Método para retornar o valor do lado
    public double getLado() {
        return lado;
    }


// Método para calcular a área do quadrado

    public double calcularArea() {
        return lado * lado;

    }

    public static void main(String[] args) {
        // Exemplo de uso
        Quadrado meuQuadrado = new Quadrado(5.0);
        System.out.println("Lado do quadrado: " + meuQuadrado.getLado());
        System.out.println("Área do quadrado: " + meuQuadrado.calcularArea());


    }

}