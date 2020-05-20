import java.util.Scanner;

public class Chambers_Assignment2
{
    public static class Employee {
        private String firstName;
        private String lastName;
        private String socialSecurityNumber;

        public Employee(String firstName, String lastName, String socialSecurityNumber)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;

        }
        public String getFirstName() {return firstName;}
        public String getLastName() {return lastName;}
        public String getSocialSecurityNumber() {return socialSecurityNumber;}

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSocialSecurityNumber(String socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
        }

        public String toString()
        {
            return String.format("%s: %s %s%n%s: %s", "commission employee", firstName, lastName,
                    "social security number", socialSecurityNumber);
        }
    }

    public static class CommissionEmployee extends Employee {

        private double grossSales;
        private double commissionRate;

        public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
            super(firstName, lastName, socialSecurityNumber);
            if (grossSales < 0.0) throw new IllegalArgumentException( "Gross sales must be >= 0.0");
            if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");

            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        }


        public void setGrossSales(double grossSales) {
            if (grossSales < 0.0) throw new IllegalArgumentException( "Gross sales must be >= 0.0");
            this.grossSales = grossSales;
        }
        public double getGrossSales() {return grossSales;}
        public void setCommissionRate(double commissionRate) {
            if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");
            this.commissionRate = commissionRate;
        }
        public double getCommissionRate() {return commissionRate;}
        public double earnings() {return commissionRate * grossSales;}

        @Override
        public String toString() {
            return super.toString() + String.format("%n%s: %.2f%n%s: %.2f",
                    "gross sales", grossSales,
                    "commission rate", commissionRate);
        }
    }

    public static void driverProgram()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.print("Enter social security number:");
        String socialSecurityNumber = scanner.nextLine();
        System.out.print("Enter gross sales:");
        double grossSales = scanner.nextDouble();
        System.out.print("Enter commission rate:");
        double commissionRate = scanner.nextDouble();


        CommissionEmployee newEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        System.out.println(newEmployee.toString());

    }

    public static void main(String[] args)
    {
        driverProgram();
    }
}