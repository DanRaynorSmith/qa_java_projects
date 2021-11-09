public class Taxes {
    public static void main(String[] args) {

        System.out.println(taxCalculation(30000));

    }

    public static double percentageTax(double salary) {
        if (salary < 0) {
            return -1;
        }
        if (salary > 0 && salary < 14999) {
            return 0;
        }
        if (salary > 14999 && salary <= 19999) {
            return 0.1;
        }
        if (salary > 19999 && salary <= 29999) {
            return 0.15;
        }
        if (salary > 29999 && salary < 45000) {
            return 0.2;
        }

        return 0.25;

    }

    public static double taxCalculation(double salary) {
         return (salary * (percentageTax(salary)));
    }

}
