package Task2.Proxy;

import java.math.BigDecimal;

public class Director implements CompanyInfo{
    @Override
    public BigDecimal getProfit() {
        return BigDecimal.valueOf(1000000);
    }
}
