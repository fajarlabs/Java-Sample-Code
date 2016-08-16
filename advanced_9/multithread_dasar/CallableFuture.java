package advanced_9.multithread_dasar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class CallableFuture implements Callable<String> {
 
    @Override
    public String call() throws Exception {
    	
    	/* Batas sleep 1000 miliseconds */
    	Thread.sleep(1000);
        
        /* Mengembalikan nama thread ketika eksekusi */
        return Thread.currentThread().getName();
    }
     
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
    public static void main(String args[]){
    	
        /* Dapatkan ExecutorService dari Executors utility class, 
         * thread pool dengan ukuran 5. Angka 5 dimaksudkan adalah 
         * ketika mulai eksekusi data tersebut dicacah per 5 */
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        /* Buat sebuah list untuk menahan Future object associated dengan Callable */
        List<Future<String>> list = new ArrayList<Future<String>>();
        
        /* Buat instansiasi CallableFuture */
        Callable<String> callable = new CallableFuture();
        
        /* Berikan 25 tugas yang akan di eksekusi */
        for(int i=0; i< 25; i++){
        	
            /* submit Callable tasks to be executed by thread pool */
            Future<String> future = executor.submit(callable);
            
            /* add Future to the list, we can get return value using Future */
            list.add(future);
        }
        
        /* Data disini sudah dicacah konkurensi per 10 */
        for(Future<String> fut : list){
            try {
                /* print the return value of Future, notice the output delay in console
                because Future.get() waits for task to get completed */
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch(ExecutionException e) {
            	e.printStackTrace();
            }
        }
        
        /* Matikan eksekutor setelah selesai */
        executor.shutdown();
    }
 
}
