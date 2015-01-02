package assigment1;

/**
 * Created by adrian.badarau on 31-Dec-14.
 */
public class Answer {
    public static boolean contains(int[] arr, int val){
        for (int elem: arr){
            if (elem==val) return true;
        }
        return false;
    }
    public static int[] addElem(int[] arr, int elem){
        int [] newArr= new int[arr.length + 1];
        for (int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        newArr[newArr.length - 1] = elem;
//        arr = null;
        return newArr;
    }
    public static void main(String[] args){
        int[] array = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int[] positive = new int[0];
        int[] negative = new int[0];
        int dup = 0;
        for (int i=0;i<array.length;i++){
            if(array[i]>=0){
                if(contains(positive,array[i])) {dup++;}
                positive=addElem(positive,array[i]);

            }else {
                if(contains(negative,array[i])) {dup++;}
                negative=addElem(negative,array[i]);
            }
        }
        System.out.print("Valorile negative sunt: "+java.util.Arrays.toString(negative));
        System.out.println();
        System.out.print("Valorile pozitive sunt: "+java.util.Arrays.toString(positive));
        System.out.println();
        System.out.println("Lista initiala: "+java.util.Arrays.toString(array)+" contine "+dup+" duplicate");
    }
}
