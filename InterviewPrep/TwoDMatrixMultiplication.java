package InterviewPrep;

import java.util.Scanner;

public class TwoDMatrixMultiplication {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        //yahan pe  first matrix ke rows aur columns ko define kia

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        //yahan values pass karaai
        int [] [] first=new int[r1][c1];

        //loop chalaya taaki values iterate ho sake

        for(int i=0;i<first.length;i++){
            for(int j=0;j<first[0].length;j++){

                //saare inputs le liye

                first[i][j]=scn.nextInt();


            }
        }

        //yahan dusre matrix ka row aur column lia hai

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        //yahan values pass karaai
        int [] [] second=new int[r2][c2];

        //loop chalaya taaki values iterate ho sake

        for(int i=0;i<second.length;i++){
            for(int j=0;j<second[0].length;j++){

                //saare inputs le liye

                second[i][j]=scn.nextInt();

            }
        }


        //agar column 1 dusre k rows k equal nahi hai to

        if(c1!=r2){

            System.out.println("Invalid input");

            return;
        }


        //otherwise hum ek result matrix bnayenge jisme first ki rows aur second ki columns
        int[][]result=new int[r1][c2];

        //ab result k uper loop chlaenge
        for(int i=0;i<result.length;i++){

            //ab result k har point ko visit krenge to fill values
            for(int j=0;j<result[0].length;j++){

                for(int k=0;k<c1;k++){

                    result[i][j]+=first[i][k]*second[j][k];


                }


            }
        }

        for(int i=0;i<result.length;i++){

            for(int j=0;j<result[0].length;j++){

                System.out.println(result[i][j]+ "");
            }

            System.out.println();
        }


    }

}
