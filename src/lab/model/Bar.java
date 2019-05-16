package lab.model;


import org.aspectj.lang.annotation.Around;

public interface Bar {
    @Around("execution(* sellSquishee(..))")
    Squishee sellSquishee(Customer customer);
}

