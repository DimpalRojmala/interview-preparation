package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoList {

    public static void mergeTwoLists(LinkedList list1, LinkedList list2) {

        int i=0;
        int j=0;
        //int k=0;

        int lengthOfnewList=list1.size()+list2.size();

        int ansList[]=new int[lengthOfnewList];

        for(int k=0;k<lengthOfnewList;k++)
        {

            if(i<list1.size()) {
                if ((int) list1.get(i) < (int) list2.get(j)) {
                    ansList[k] = (int) list1.get(i);
                    i++;
                } else if ((int) list2.get(j) < (int) list1.get(i)) {
                    ansList[k] = (int) list2.get(j);
                    j++;
                } else {
                    ansList[k] = (int) list1.get(i);
                    ansList[k + 1] = (int) list1.get(i);
                    i++;
                    j++;
                    k++;
                }
            }


        }
        System.out.println(ansList);
        for (int key:ansList
             ) {
            System.out.println(key);
        }


    }

    public static void main(String[] args) {
        LinkedList list1=new LinkedList<>();
        list1.add(1);
       list1.add(2);
       list1.add(4);
        LinkedList list2=new LinkedList<>();
        list2.add(0);
        list2.add(3);
        list2.add(4);

        mergeTwoLists(list1,list2);
    }
}
