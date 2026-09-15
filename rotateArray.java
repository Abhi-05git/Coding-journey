class rotateArray{
     static void rotateArr(int[] Arr , int D){
        int n = Arr.length;

        for(int i = 0 ; i < D ; i++){

            int first = Arr[0];
            for(int j = 0 ; j < n - 1 ; j++){
                Arr[j] = Arr[j + 1];
            }
            Arr[n - 1] = first;

        }
    }
    public static void main(String[] args){
        int[] Arr = {1, 2, 3, 4, 5, 6};
        int D = 2;

        rotateArr(Arr,D);

        for(int i = 0 ; i < Arr.length ; i++){
            System.out.print(Arr[i] + " ");
        }

    }

    
}
