package thread;
public class evenOddModify { 
    int counter = 1; 
    static int N;  
    public void printOddNumber() { // Function to print odd numbers
        synchronized (this) { 
            while (counter < N) { // Print number till the N 
                while (counter % 2 == 0) { // If count is even then print
                    try { 
                        wait(); 
                    } 
                    catch (InterruptedException e) { 
                        e.printStackTrace(); 
                    } 
                }  
                System.out.print(counter + " "); 
                counter++; 
                notify(); // Notify to second thread 
            } 
        } 
    }
    public void printEvenNumber() { // Function to print even numbers
        synchronized (this) { 
            while (counter < N) { // Print number till the N 
                while (counter % 2 == 1) { // If count is odd then print 
                    // Exception handle 
                    try { 
                        wait(); 
                    } 
                    catch (InterruptedException e) { 
                        e.printStackTrace(); 
                    } 
                }
                System.out.print(counter + " ");  // Print the number 
                counter++; // Increment counter 
                notify(); // Notify to 2nd thread 
            } 
        } 
    } 
    public static void main(String[] args){  // Driver Code  
        N = 20; //##### n er man joto dibo toto porjnto print korbe######
        evenOddModify mt = new evenOddModify(); // Create an object of class 
        Thread t1 = new Thread(new Runnable() { // Create thread t1
            public void run() { 
                mt.printEvenNumber(); 
            } 
        }); // Create thread t2 below
        Thread t2 = new Thread(new Runnable() { 
            public void run() { 
                mt.printOddNumber(); 
            } 
        });
        t1.start(); 
        t2.start(); 
    } 
} 
