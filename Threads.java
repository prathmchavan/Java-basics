class A extends Thread  {

    /*Important Notes
     * Schedulers 
     * run method for thread is required for working thread class
     * thread use start method to call the run method execute then the parallel working start 
     * We have to extend the class with Thread class
     * Thread is use to run the process parallel 
     */
    public void run ()
    {
        for (int i = 0; i < 10; i++) {
            
            System.out.println("running");

        }
    }

}

class  B extends  Thread{

    public void run()
    {
        for (int i = 0; i < 10; i++) {
            
            System.out.println("running in b");
             try {
                 Thread.sleep(10);
             } catch (Exception e) {
             }

             /*
              * We can optimize the thread we can't gaurantee of  it will run on process completely
              */
        }
    }
}


public  class Threads{
    public static void main(String[] args) {
     
        A obj = new A();
        B obj1 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        /*
         * We can use setpriority method to set the priority for execution we suggesting the scheduler that set the priority for this process is high
         * we can use 0 - 10 number the low the number least the priority high the number high the priority
         * schduler won't gaurantee the priority we are just saying or asking the schduler to do it will check the low time of execution of process if it will get execute in low time it will run it or run the other process.
         * it depend on the algorithm of schduler.
         */
        obj.start();
        obj1.start();



    }
}