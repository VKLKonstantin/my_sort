package by.konstantinvklcorporation;

import static by.konstantinvklcorporation.Sort.handbook;
import static by.konstantinvklcorporation.Sort.listK1;
import static org.junit.Assert.*;

public class SortTest {

    @org.junit.Test
    public void groups() {
        Sort sort = new Sort();
        String [] s1 ={"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2"};
        for (int i = 0; i < s1.length&&i<listK1.size(); i++) {
if(sort.listK1.get(i)==s1[i]) {
    System.out.print("TRUE " );
}
    else {
    System.out.print("FALSE ");
    }


        }
    }
   /* @org.junit.Test
    public void addition() {
    }

    @org.junit.Test
    public void decrease() {
    }*/
}