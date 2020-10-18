package com.codewars;
//Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
//F(n) * F(n+1) = prod.
//
//Your function productFib takes an integer (prod) and returns an array:
//
//[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
//depending on the language if F(n) * F(n+1) = prod.

import java.util.ArrayList;

    public class ProdFib {
        public static long[] productFib(long prod) {

            long a = 0;
            long b = 1;
            long k = a * b;

            while (k  < prod) {
                long temp = b;
                b += a;
                a = temp;
                k = a * b;
            }

            return new long[] { a, b, k == prod ? 1 : 0 };

        }
    }
