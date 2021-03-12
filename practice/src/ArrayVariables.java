public class ArrayVariables {
    // method 1
    public void list() {
        int[] numarray = new int [4];

        numarray[0] = 1;
        numarray[1] = 2;
        numarray[2] = 3;
        numarray[3] = 4;

        int [] numarray2 = {1,2,3,4};

        for (int i=0; i<numarray.length; i++) {
            System.out.println(numarray[i]);
        }

        String[] todoList = new String[4];

        todoList[0] = "study";
        todoList[1] = "cook";
        todoList[2] = "chillOut";
        todoList[3] = "sleep";

        String[] todoList2 = {"study", "cook", "chillOut", "sleep"};

        for (int i=0; i<todoList.length; i++) {
            System.out.println(todoList[i]);

            int array[] = new int[7];
            for (int count=0;count<7;count++){
                array[count]=count+1;
            }
            for (int count=0;count<7;count++){
                System.out.println("array["+count+"] = "+array[count]);
            }

            // Create 2-dimensional array.
            int[][] twoD = new int[4][4];

            // Assign three elements in it.
            twoD[0][0] = 1;
            twoD[1][1] = 2;
            twoD[3][2] = 3;
            System.out.print(twoD[0][0] + " ");
            String example = 1 + "";

        }


    }
}
