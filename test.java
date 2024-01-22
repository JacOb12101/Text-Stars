public class test {

    public static void main(String[] args) {


        boolean[] bools = chunky(50,14);
        for (boolean b : bools) {
            if (b)
                System.out.print("X");
            else
                System.out.print("O");

        }


    }


    public static boolean[] chunky (int length, int num) {
        // length is length of array
        // num is how many true vals you want to spread
        boolean[] arr = new boolean[length];
        int mod = length%num;
        int lower = length/num;
        int upper = lower+1;
        boolean resolved = false;


        //initialize chunks array
        boolean[] chunks = new boolean[num];
        for (int i = 0; i < mod; i++) {
            chunks[i] = true;
        }

        if ((mod==0||mod==1||mod==length-1)) {
            resolved = true;

        }
        //conditions to optimize chunks
        if (!resolved) {

            chunks = chunky(num, mod);

        }

        int arrpos = 0;
        for (boolean c : chunks) {
            arr[arrpos] = true;
            if (c) {
                arrpos += upper;
            }
            else {
                arrpos += lower;
            }
        }

        return arr;
    }










}