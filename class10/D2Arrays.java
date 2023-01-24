package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};
        String[][] thompsonTrain=new String[3][];
        // this is how your attaching cabins to train
        thompsonTrain[0]=cabin0;
        thompsonTrain[1]=cabin1;
        thompsonTrain[2]=cabin2;

        System.out.println(thompsonTrain[1][2]);
      //  System.out.println(Arrays.toString(thompsonTrain[0])); will print entire cabin 0



    }
}
