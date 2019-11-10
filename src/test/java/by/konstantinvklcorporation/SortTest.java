package by.konstantinvklcorporation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static by.konstantinvklcorporation.Sort.handbook;
import static by.konstantinvklcorporation.Sort.listK3;
import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void groups() {
        String[] k1 = {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2"};
        String[] k2 = {"K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};

        List<String> testing1 = new ArrayList();
        List<String> testing2 = new ArrayList();

        for (int i = 0; i < k1.length; i++) {
            testing1.add(k1[i]);
        }
        for (int i = 0; i < k2.length; i++) {
            testing2.add(k2[i]);
        }

        List<List> expected = Sort.groups(handbook);

        List<List> actual = new ArrayList();
        actual.add(testing1);
        actual.add(testing2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addition(){
        String[] k1 = {"K1","K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2"};
        String[] k2 = {"K2","K2\\SK1", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};

        List<String> testing1 = new ArrayList();
        List<String> testing2 = new ArrayList();
        List<List> testing3 = new ArrayList();

        for (int i = 0; i < k1.length; i++) {
            testing1.add(k1[i]);
        }
        for (int i = 0; i < k2.length; i++) {
            testing2.add(k2[i]);
        }
        testing3.add(testing1);
        testing3.add(testing2);

        List<List> expected = Sort.addition(listK3);

        Assert.assertEquals(expected, testing3);

    }

    @Test
    public void decrease(){
        String[] k1 = {"K1","K1\\SK2", "K1\\SK1", "K1\\SK1\\SSK2", "K1\\SK1\\SSK1"};
        String[] k2 = {"K2","K2\\SK1", "K2\\SK1\\SSK2", "K2\\SK1\\SSK1"};

        List<String> testing1 = new ArrayList();
        List<String> testing2 = new ArrayList();
        List<List> testing3 = new ArrayList();

        for (int i = 0; i < k1.length; i++) {
            testing1.add(k1[i]);
        }
        for (int i = 0; i < k2.length; i++) {
            testing2.add(k2[i]);
        }
        testing3.add(testing2);
        testing3.add(testing1);

        List<List> expected = Sort.decrease(listK3);

        Assert.assertEquals(expected, testing3);

    }


}