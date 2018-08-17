package ecorp;

import com.google.common.base.Function;

public class CreditCardHandler {

    public static int calculatefakeCards(final Integer day) {
        Integer result = new Function<Integer, Integer>() {
            @Override
            public Integer apply(final Integer n) {
                return n == 0 ? 1 : n * apply(n - 1);
            }
        }.apply(day);

        return day * result;
    }
}
