/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceDaemon;

/**
 *
 * @author masfajar
 */
public class LambdaExpressionSample01 {
    
    /* interface dengan 1 metode */
    public interface A {
        public void run();
    }
    
    /* Contoh penggunaan pada constructor di kelas lain */
    public class B  {
        public B(A a) {}
    }
    
    /* Pengujian */
    public void test() {
        /* Support JDK sebelumnya */
        new B(new A() {
            @Override
            public void run() {
                System.out.println("Cara lama dengan anotasi");
            }
        });
        
        /* Hanya di support oleh JDK 8 */
        /* Dengan syarat si interface hanya terdiri 1 metode tanpa badan */
        new B(() -> System.out.println("Cara baru dengan lambda expression"));
        
    }
    public static void main(String[] args) {
        LambdaExpressionSample01 o = new LambdaExpressionSample01();
        o.test();
    }
}
