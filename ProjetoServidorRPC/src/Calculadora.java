public class Calculadora {

    public double areaQuadrado(double x) {
        return x * x;
    }

    public double areaTrianguloRetangulo(double x, double y) {
        return (x * y)/2;
    }
	
    public double areaCircunferencia(double x) {
        return (x * x) * 3.14;
    }
	
    public double areaEsfera(double x) {
        return 4 * 3.14 * (x * x);
    }

    public double volumeEsfera(double x) {
        return 4/3 * 3.14 * Math.pow(x, 3);
    }

    public double areaCilindro(double x, double y) {
        return 2 * 3.14 * x * (x + y);
    }

    public double volumeCilindro(double x, double y) {
        return Math.pow(x, 2) * 3.14 * y;
    }

    public double areaCubo(double x) {
        return 6 * Math.pow(x, 2);
    }

    public double volumeCubo(double x) {
        return Math.pow(x, 3);
    }
}