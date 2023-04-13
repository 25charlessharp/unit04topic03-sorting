import java.util.ArrayList;

public class StringListSort {

    public static void selectionSort(ArrayList<String> unordered) {
        for(int i = 0; i < unordered.size(); i ++){
            int index = i;
            String smallestString = unordered.get(i);
            for(int k = i + 1; k < unordered.size(); k ++){
                if(unordered.get(i).compareTo(unordered.get(k)) > 0){
                    index = k;
                    smallestString = unordered.get(k);
                }
            }
            String holder = unordered.get(i);
            unordered.set(i, smallestString);
            unordered.set(index, holder);
            
            
        }
        
    }

    public static void insertionSort(ArrayList<String> unordered){
        for(int i = 1; i < unordered.size(); i ++){
            int index = i - 1;
            int k = i;
            while(k >= 0 && unordered.get(i).compareTo(unordered.get(index)) < 0){
                String holder = unordered.get(i);
                unordered.set(i, unordered.get(index));
                unordered.set(index, holder);
                k --;
            }

        }
    }
    
    public static void main(String[] args) {
        
    }
}