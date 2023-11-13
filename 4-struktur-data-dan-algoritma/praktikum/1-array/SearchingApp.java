public class SearchingApp
{
    public static void main(String[] args)
    {
        /*
        int maxSize = 20;
        ArrayTerurut arr = new ArrayTerurut(maxSize);
        ArrayTakTerurut arrt = new ArrayTakTerurut(maxSize);
        int k = 1;

        for(int i=0; i<5; i++) {
            arr.insert(k);
            k++;
        }
        arr.display();

        for(int i=0; i<100000; i++) {
            int x = 1 + (int) (Math.random() * 10);
            arrt.insert(x);
        }
        arrt.display();

        arr.delete(15.0);
        arr.display();
        arrt.delete(15.0);
        arrt.display();
        */

        int maxSize = 100;
        double nilaiDicari = 13.0;
        int posisi = 0;
        ArrayTerurut arr = new ArrayTerurut(maxSize);
        ArrayTakTerurut arrt = new ArrayTakTerurut(maxSize);
        TimeInterval ti = new TimeInterval();
        int k = 1;

        for(int i=0; i<maxSize; i++) {
            arr.insert(k);
            k++;
        }
        //arr.display();

        for(int i=0; i<maxSize; i++) {
            int x = 1 + (int) (Math.random() * 10);
            arrt.insert(x);
        }
        //arrt.display();

        ti.startTiming();
        posisi = arrt.sequentSearch(nilaiDicari);
        ti.endTiming();
        
        System.out.println("Posisi " + nilaiDicari + " di posisi " + posisi);
        System.out.println("Waktu yang diperlukan oleh sequential search: " +ti.getElapsedTime());

        ti.startTiming();
        posisi = arr.binarySearch(nilaiDicari);
        ti.endTiming();
        System.out.println("Posisi " +nilaiDicari+ " di posisi " +posisi);
        System.out.println("Waktu yang diperlukan oleh binary search: " +ti.getElapsedTime()); 
    }
}