package Task2.Proxy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CompanyInfo director = new Director();
        System.out.println(" When director view Profit -->  Company Profit: " + director.getProfit());

        CompanyInfo employeeProxy = new DirectorProxy();
        BigDecimal employeeProfit = employeeProxy.getProfit();
        System.out.println(" When employee view Profit --> Company Profit: " + employeeProfit);
    }
}
