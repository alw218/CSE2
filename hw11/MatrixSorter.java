//Amber Wallace
//hw11-MatrixSorter

public class MatrixSorter {
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    //create method
    public static int[][][] buildMat3d() {
        //create new array
        int[][][] array = new int[3][][];
        //loop through slabs
        for (int slab = 0; slab < 3; slab++) {
            //create arrays within slabs
            array[slab] = new int[3 + 2 * slab][];
            //loop through rows
            for (int rows = 0; rows < 3 + 2 * slab; rows++) {
                //create arrays within rows
                array[slab][rows] = new int[slab + rows + 1];
                //loop through columns
                for (int columns = 0; columns < slab + rows + 1; columns++) {
                    //assign random numbers between 1-100 to each member
                    array[slab][rows][columns] = (int)(Math.random() * 100) + 1;
                }
            }
        }
        return array;
    }
    //create new method
    public static void show(int[][][] array) {
        //loop through slabs
        for (int slab = 0; slab < 3; slab++) {
            //print message
            System.out.println("--------------------- Slab " + (slab + 1));
            //loop through rows
            for (int rows = 0; rows < array[slab].length; rows++) {
                //loop though columns
                for (int columns = 0; columns < array[slab][rows].length; columns++) {
                    //print numbers
                    System.out.print(array[slab][rows][columns] + " ");
                }
                //split up rows with line break
                System.out.println();
            }
        }
    }
    //new method
    public static int findMin(int[][][] array) {
        //set min to highest possible value
        int min = 100;
        //loop through slabs
        for (int slab = 0; slab < 3; slab++) {
            //loop through rows
            for (int rows = 0; rows < 3 + 2 * slab; rows++) {
                //loop through columns
                for (int columns = 0; columns < slab + rows + 1; columns++) {
                    if (array[slab][rows][columns] < min) {
                        //reset min to new minimum
                        min = array[slab][rows][columns];
                    }
                }
            }
        }
        return min;
    }
    public static void sort(int[][] array) {
        //for each individual array within the array
        for (int i = 0; i < array.length; i++) {
            sort(array[i]); //sort array
        }
        //create vars
        int[] tempArray, minArray;
        int min;
        //loop through
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            min = array[i][0]; //set min to current value
            minArray = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j][0] < min) { //check for new min
                    min = array[j][0]; //save new min
                    minArray = array[j]; //save array for new min
                    pos = j; //save position of new min
                }
            }
            tempArray = array[i]; //store old array
            array[i] = minArray; //replace with new min array
            array[pos] = tempArray; //switch positions with old array
        }
    }
    public static void sort(int[] array) {
        int tempValue, min; //create vars
        //loop through
        for (int i = 0; i < array.length; i++) {
            int pos = i; //save initial position
            min = array[i]; //save current value as min
            //loop through
            for (int j = i; j < array.length; j++) { 
                if (array[j] < min) { //if new min
                    min = array[j]; //save min value
                    pos = j; //save position of min value
                }
            }
            tempValue = array[i]; //store current value
            array[i] = min; //replace with min
            array[pos] = tempValue; //switch places with old value
        }
    }
}
