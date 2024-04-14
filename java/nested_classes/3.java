import java.util.Scanner;

class MathUtils{
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realPart = a.Re + b.Re;
        double imaginaryPart = a.Im + b.Im;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.Re * b.Re - a.Im * b.Im;
        double imaginaryPart = a.Re * b.Im + a.Im * b.Re;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber conjugate(ComplexNumber a) {
        return new ComplexNumber(a.Re, -a.Im);
    }
    static class ComplexNumber{
        private double Re;
        private double Im;


        public ComplexNumber(double re, double im) {
            Re = re;
            Im = im;
        }

        public void setRe(int re) {
            Re = re;
        }

        public void setIm(int im) {
            Im = im;
        }

        public double getRe() {
            return Re;
        }

        public double getIm() {
            return Im;
        }
    }
}

class Executor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            String[] parts = line.split("/");

            if (parts.length < 2 || parts.length > 3) {
                System.out.println("Invalid input format");
                return;
            }

            String cmd = parts[0];
            String[] complexNumbers = parts[1].split(";");

            if (complexNumbers.length != 2 && !cmd.equals("conjugate")) {
                System.out.println("Invalid input format");
                return;
            }

            double real1 = Double.parseDouble(complexNumbers[0]);
            double imaginary1 = Double.parseDouble(complexNumbers[1]);

            MathUtils.ComplexNumber complex1 = new MathUtils.ComplexNumber(real1, imaginary1);

            switch (cmd) {
                case "add":
                    if (parts.length != 3) {
                        System.out.println("Invalid input format");
                        return;
                    }
                    String[] secondComplexNumbers = parts[2].split(";");
                    if (secondComplexNumbers.length != 2) {
                        System.out.println("Invalid input format");
                        return;
                    }
                    double real2 = Double.parseDouble(secondComplexNumbers[0]);
                    double imaginary2 = Double.parseDouble(secondComplexNumbers[1]);
                    MathUtils.ComplexNumber complex2 = new MathUtils.ComplexNumber(real2, imaginary2);
                    MathUtils.ComplexNumber sum = MathUtils.add(complex1, complex2);
                    System.out.println(sum.getRe() + ";" + sum.getIm());
                    break;
                case "multiply":
                    if (parts.length != 3) {
                        System.out.println("Invalid input format");
                        return;
                    }
                    String[] secondComplexNumbersMultiply = parts[2].split(";");
                    if (secondComplexNumbersMultiply.length != 2) {
                        System.out.println("Invalid input format");
                        return;
                    }
                    double real2Multiply = Double.parseDouble(secondComplexNumbersMultiply[0]);
                    double imaginary2Multiply = Double.parseDouble(secondComplexNumbersMultiply[1]);
                    MathUtils.ComplexNumber complex2Multiply = new MathUtils.ComplexNumber(real2Multiply, imaginary2Multiply);
                    MathUtils.ComplexNumber product = MathUtils.multiply(complex1, complex2Multiply);
                    System.out.println(product.getRe() + ";" + product.getIm());
                    break;
                case "conjugate":
                    MathUtils.ComplexNumber conjugate = MathUtils.conjugate(complex1);
                    System.out.println(conjugate.getRe() + ";" + conjugate.getIm());
                    break;
                default:
                    System.out.println("Invalid command");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        }
    }
}