class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
     int count = 0;
        int capacityARefill = capacityA;
        int capacityBRefill = capacityB;
        int i = plants.length-1;
        for (int k = 0; k < plants.length; k++) {

            if (k == i) {
                if (capacityA == capacityB || capacityA>capacityB) {
                    if (plants[i] <= capacityA) {
                        capacityA -= plants[i];
                    } else {
                        capacityA = capacityARefill;
                        capacityA -= plants[i];
                        count++;
                    }
                }
                else{
                    if (plants[i] <= capacityB) {
                        capacityB -= plants[i];
                    } else {
                        capacityB = capacityBRefill;
                        capacityB -= plants[i];
                        count++;
                    }

                }
                break;
            }
            if (plants[k] <= capacityA) {
                capacityA -= plants[k];
            } else {
                capacityA = capacityARefill;
                capacityA -= plants[k];
                count++;
            }


                if (plants[i] <= capacityB) {
                    capacityB -= plants[i];
                } else {
                    capacityB = capacityBRefill;
                    capacityB -= plants[i];
                    count++;
                }

            i--;
            if (k==i)
                break;
        }
        return(count);   
    }
}
