package dsa.ds.stack;

public class TwoStacksInOneArray {
    // 1.20pm
    int[] stacks = new int[20];
    // tos will point to empty location
    // while return tos value, decrement and return
    int tos1 = 0;
    int tos2 = stacks.length-1;

    public static void main(String[] args) {
        TwoStacksInOneArray stacks = new TwoStacksInOneArray();
        stacks.pop1();
        stacks.pop2();
        stacks.push2(4);
        stacks.push2(3);
        stacks.pop2();

        System.out.println("stacks.getTos1() = " + stacks.getTos1());
        System.out.println("stacks.getTos2() = " + stacks.getTos2());

    }

    public void push1(int value) {
        if(tos1 == tos2) {
            System.out.println("Array full");
            // increase size
        }else {
            stacks[tos1] = value;
            tos1++;
        }

    }

    public void push2(int value) {
        if(tos2 == tos1) {
            System.out.println("Array full");
            // increase size
        }else {
            stacks[tos2] = value;
            tos2--;
        }
    }

    public int pop1() {
        if(tos1 == 0) {
            System.out.println("Stack1 is empty");
            return -1;
        } else {
            return stacks[--tos1];
        }
    }

    public int pop2() {
        if(tos2 == stacks.length-1) {
            System.out.println("Stack2 is empty");
            return -1;
        } else {
            return stacks[++tos2];
        }
    }

    public int getTos1() {
        if(tos1 == 0) {
            System.out.println("Stack1 is empty");
            return -1;
        }
        return stacks[tos1-1];
    }

    public int getTos2() {
        if(tos2 == stacks.length-1) {
            System.out.println("Stack2 is empty");
        }
        return stacks[tos2+1];
    }
    //1.34 pm
}
