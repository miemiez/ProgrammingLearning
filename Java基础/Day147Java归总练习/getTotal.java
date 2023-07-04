package Day0610;

import java.util.ArrayList;

class Total {
    public static int getTotal(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        } else {
            int firstElement = arr.get(0);
            ArrayList<Integer> remainingElements = new ArrayList<>(arr.subList(1, arr.size()));
            return firstElement + getTotal(remainingElements);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
        myArrayLs.add(3);
        myArrayLs.add(5);
        myArrayLs.add(6);
        myArrayLs.add(9);

        int total = getTotal(myArrayLs);
        System.out.println(total);
    }
}

