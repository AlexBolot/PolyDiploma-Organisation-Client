package fr.polytech.polydiploma.interceptor;

import fr.polytech.polydiploma.Expected;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ExpectedVerifier {

    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {
        Expected expected = (Expected) ctx.getParameters()[1];

        if (expected.getMail().equals("")) {
            throw new RuntimeException("Error ");
        }

        return ctx.proceed();
    }
}
