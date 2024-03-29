//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        // Завдання 1
        int array[]= new int[50];
        for (int i = 1, j = 0; i<=99 & j< array.length; i=i+2, j++){
            array[j]  = i;
        }
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");





        System.out.println();
        System.out.println("Завдання 2");
        //Завдання 2
        int array0[] = new int[20];
        for(int i=0; i<20; i++){
            array0[i] = (int)Math.round(Math.random() * 9);
        }
        for(int i=0; i<20; i++) {
            System.out.print(array0[i] + " ");
        }

        for(int i=1; i<20; i++) {
            if (i % 2 != 0) {
                array0[i] = 0;
            }
        }
        System.out.println();
        for(int i=0; i<20; i++) {
            System.out.print(array0[i] + " ");
        }





        System.out.println();
        System.out.println("Завдання 3");
        //Завдання 3
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double mid1 = 0, mid2 = 0, mid3 = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + array3[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);
        if (mid1 < mid2 & mid3<mid2)
            System.out.println(" mid2 ");
        else if (mid1 > mid2 & mid1 > mid3)
            System.out.println(" mid1 ");
        else if (mid3 > mid1 & mid3 > mid2)
            System.out.println(" mid3 ");
        else if(mid1 == mid2 & mid2 == mid3)
            System.out.println("mid1=mid2=mid3");






        System.out.println();
        System.out.println("Завдання 4");
        //Завдання 4
        int array10[] = new int[10];
        int array20[] = new int[10];
        int array30[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array10[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array10[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array20[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array20[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            array30[i] = array10[i] + array20[i];
            System.out.print(array30[i] + " ");
        }





        System.out.println();
        System.out.println("Завдання 5");
        //Завдання 5
        int b = 0;
        int array100[] = new int[15];
        for (int i = 0; i < 16; i++) {
            array100[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array100[i] + " ");
            if (array100[i] % 2 == 0)
                b++;
        }
        System.out.println();
        System.out.println(b);






        System.out.println();
        System.out.println("Завдання 6");
        //Завдання 6
        int[][] array12 = new int[15][];
        array12 [0] = new int [5];
        array12 [1] = new int [5];
        array12 [2] = new int [5];
        array12 [3] = new int [5];
        array12 [4] = new int [8];
        array12 [5] = new int [8];
        array12 [6] = new int [8];
        array12 [7] = new int [8];
        array12 [8] = new int [3];
        array12 [9] = new int [3];
        array12 [10] = new int [3];
        array12 [11] = new int [3];
        array12 [12] = new int [9];
        array12 [13] = new int [9];
        array12 [14] = new int [9];
        for(int i=0;i<array12.length;i++){//i рядок j стовпець
            for(int j=0;j<array12[i].length;j++){
                array12[i][j]=(int)(Math.random()*15);
                System.out.print(array12[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}