import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;
import static java.lang.System.in;


public class Main {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Triangle triangle;
        Circle circle;
        Square square;

        String propiedad;
        String figura;
        double medida;

        out.println("Propiedad a calcular:");
        do {
            out.println("Selecciona \n 1 = Area \n 2 = Perimetro");
            propiedad = reader.readLine();
        }while ((propiedad.equals("1") || propiedad.equals("2"))?false:true );
        out.println("Figura:");
        do {
            out.println("Selecciona \n 1 = Circulo \n 2 = Cuadrado \n 3 = Triangulo");
            figura = reader.readLine();
        }while ((figura.equals("1") || figura.equals("2") || figura.equals("3"))?false:true );

        do {
            out.println("Cual es la medida para la figura?");
            medida = Double.parseDouble(reader.readLine());
        }while ((figura.equals("1") || figura.equals("2") || figura.equals("3"))?false:true );
        out.println("El resultado es: ");
        switch (figura){
            case "1": circle = new Circle(medida);
                if (propiedad.equals("1")){
                    out.println("Area = " + circle.area());
                }else {
                    out.println("Perimetro = " + circle.perimeter());
                }
                break;
            case "2": square = new Square(medida);
                if (propiedad.equals("1")){
                    out.println("Area = " + square.area());
                }else {
                    out.println("Perimetro = " + square.perimeter());
                }
                break;
            case "3": triangle = new Triangle(medida);
                if (propiedad.equals("1")){
                    out.println("Area = " + triangle.area());
                }else {
                    out.println("Perimetro = " + triangle.perimeter());
                }
                break;
        }
    }
}