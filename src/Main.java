import ordenacao.BubbleSort;
import ordenacao.Decrescente;
import ordenacao.InsertionSort;
import ordenacao.MergeSort;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
    	
    	// importando o random para os valores do array
    	Random r = new Random();
    	
        int low = 10;
        int high = 100000;
    	
        // Gerando aleatoriamente o tamanho do array
    	int tamanhoarray = r.nextInt(high - low) + low;
    	
    	// Criando os 3 arrays para guardar o Score 
    	long[] BubbleScore = new long[6];
    	long[] InsertScore= new long[6];
    	long[] MergeScore = new long[6];
    	//long[] DecrescenteScore = new long[6];
    	
    	//
    	long TotalSumBu=0;
    	long TotalSumIn=0;
    	long TotalSumMe=0;
    	//long TotalSumComp=0;
    	//int cont= 0;
    	
    	//System.out.println(tamanhoarray);
        int[] A = new int[tamanhoarray];

        InsertionSort is;
        MergeSort ms;
        BubbleSort bs;
        Decrescente dc;
        
        for (int j = 0; j <= 5; j++) {
			
            for (int i = 1; i < A.length; i++) {
                A[i] = r.nextInt(high - low) + low;
            }
            dc = new Decrescente(A.clone());
            is = new InsertionSort(A.clone());
            ms = new MergeSort(A.clone());
            bs = new BubbleSort(A.clone());
            
            long startTime = System.currentTimeMillis();
            

                // Ordenando de forma decrescente antes de passar pelos metodos 
                dc.decrescente();  
			
	            //Ordenando de forma decrescente antes de passar pelos metodos 
             	// Merge sort escolhido pois é o com melhor tempo 
//				 ms.sort(0, (A.length - 1));


            // Insertion
             startTime = System.currentTimeMillis();
            is.sort();
            InsertScore[j] = (System.currentTimeMillis() - startTime);

            // Mergesort
            startTime = System.currentTimeMillis();
            ms.sort(0, (A.length - 1));
            MergeScore[j] = (System.currentTimeMillis() - startTime);

            //BubbleSort
            startTime = System.currentTimeMillis();
            bs.sort();
            BubbleScore[j] = (System.currentTimeMillis() - startTime);
            
            //cont++;
            
		}
        
        for (int k = 0; k < InsertScore.length; k++) {
            TotalSumIn = TotalSumIn+InsertScore[k];

		}
        for (int k = 0; k < MergeScore.length; k++) {
        	TotalSumMe = TotalSumMe+MergeScore[k];
			
		}
        for (int k = 0; k < BubbleScore.length; k++) {
        	TotalSumBu = TotalSumBu+BubbleScore[k];
		}

        System.out.println("A media em MiliSegundos para o Insetion Sort é : "+ (long)(TotalSumIn/InsertScore.length));
        System.out.println("A media em MiliSegundos para o MergeScore Sort é : "+ (long)(TotalSumMe/MergeScore.length));
        System.out.println("A media em MiliSegundos para o BubbleScore Sort é : "+ (long)(TotalSumBu/BubbleScore.length));

    }
}