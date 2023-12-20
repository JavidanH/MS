package Task2.Proxy;

import java.math.BigDecimal;

public class DirectorProxy implements CompanyInfo {

    private boolean isDirector;
    private Director director;

    public DirectorProxy() {
        this.isDirector = isDirector;
        this.director = director;
    }

    @Override
    public BigDecimal getProfit() {
        if (isDirector) {
            return director.getProfit();
        } else {
            System.out.println("You are not director You haven't access");
            return BigDecimal.ZERO;
        }
    }
}
