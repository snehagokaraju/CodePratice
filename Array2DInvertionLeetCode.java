class Array2DInvertionLeetCode {
    public int[][] flipAndInvertImage(int[][] array) {
        // Logic for reveresed
         for (int i = 0 ; i < array.length ; i++) {       //row
            int[] reversed = new int[array[i].length];    // temporary array to hold the reversed elements
            for(int j = 0 ; j < array[i].length ; j++) {    // column 
                reversed[reversed.length - 1 - j] = array[i][j]; // current elements are inserted at the mirrored positions of the temporary array
            }
            array[i] = reversed; // use the temporary array as a new row
        }   
        //Logic for inverted
        for (int i = 0 ; i < array.length ; i++) {   //row
          int[] invereted = new int[array[i].length];  // temporary array to hold the inverted elements
            for(int j = 0 ; j < array[i].length ; j++) {  // column
                int temp = 0; // Creating a temporary variable to hold current value
                if(array[i][j] == 0){                     
                    temp =1; // inverting the temporary variable based on current values
                }
                invereted[j] = temp; // addig the inverted value to the acutal array
            }
            array[i] = invereted; // assigning the inverted array to the original array
        }
         return array;
    }
}
