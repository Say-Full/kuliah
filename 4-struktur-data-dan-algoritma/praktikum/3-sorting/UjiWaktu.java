public class UjiWaktu
{   
    public static void main(String[] args)
    {
        BubbleSort BS = new BubbleSort();
        SelectionSort SeS = new SelectionSort();
        InsertionSort IS = new InsertionSort();
        ExchangeSort ES = new ExchangeSort();
        HeapSort HS = new HeapSort();
        ShellSort SS = new ShellSort();
        TimeInterval time = new TimeInterval();

        // Membuat array yang isinya angka random
        int ukuran = 100000; // 100, 1000, 10000, 100000
        int[] arr = new int[ukuran];

        for(int i = 0; i < ukuran; i++) {
            arr[i] = (int) (Math.random() * ukuran);
        }

        // Mencetak interval waktu masing-masing algoritma sorting
        System.out.println("\n ======= Waktu yang dibutuhkan untuk mengurutkan " + ukuran + " data =======\n");

        // Menghitung interval waktu Bubble Sort
        time.startTiming();
        BS.sort(arr);
        time.endTiming();
        System.out.println("Bubble Sort    : " + time.getElapsedTime() + " second");

        // Menghitung interval waktu Selection Sort
        time.startTiming();
        SeS.sort(arr);
        time.endTiming();
        System.out.println("Selection Sort : " + time.getElapsedTime() + " second");

        // Menghitung interval waktu Insertion Sort
        time.startTiming();
        IS.sort(arr);
        time.endTiming();
        System.out.println("Insertion Sort : " + time.getElapsedTime() + " second");

        // Menghitung interval waktu Exchange Sort
        time.startTiming();
        ES.sort(arr);
        time.endTiming();
        System.out.println("Exchange Sort  : " + time.getElapsedTime() + " second");
        
        // Menghitung interval waktu Heap Sort
        time.startTiming();
        HS.sort(arr);
        time.endTiming();
        System.out.println("Heap Sort      : " + time.getElapsedTime() + " second");
        
        // Menghitung interval waktu Shell Sort
        time.startTiming();
        SS.sort(arr);
        time.endTiming();
        System.out.println("Shell Sort     : " + time.getElapsedTime() + " second");

        System.out.println();
    }
}
