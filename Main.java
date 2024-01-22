public class Main{

    /*
    *
    *    Idea could be to make a star out of asterisks
    *    For example:
    *
    *                   *
    *                *  *  *
                        *
    *
    *
    *                   *
    *               *  ***  *
    *                 *****
    *               **     **
    *
    *
    * */


    public static void main(String[] args){


        //make_a_v(1,20);

        int[] slopes = {3,7};
        regularLine(slopes, 20);



    }



    public static void make_a_v(int slope, int length) {
        StringBuffer spaces_f = new StringBuffer();
        StringBuffer spaces_b = new StringBuffer();
        StringBuffer endPoint = new StringBuffer();
        int len = length - 1;
        for(int i = 1; i <= len; i++) {

            spaces_b.delete(0,spaces_b.length());
            for(int k = 0; k < 2*(length - i) - 1; k++) {

                spaces_b.append(" ");

            }
            if (i == length) {
                endPoint.delete(0,1);
            }
            else {
                endPoint.delete(0,1);
                endPoint.append("O");

            }
            //System.out.print(2*(length - i) - 1);
            System.out.println(spaces_f + "O" + spaces_b + "O");

            for(int j = 0; j < slope; j++) {
                spaces_f.append(" ");
            }
        }
        System.out.println(spaces_f + endPoint.toString());
    }




    public static void regularLine(int[] slope, int length) {
        String x = "O";
        boolean[] vals = new boolean[slope[1]];
        boolean[] set = new boolean[slope[0]];
        String space = " ";
        String spaces = "";
        int counter = 0;

        int lower_bound = slope[1] / slope[0];
        int upper_bound = lower_bound + 1;
        int mod = slope[1] % slope[0];

        String lower = x.repeat(lower_bound);
        String upper = x.repeat(upper_bound);



        if (mod%2==0) {
            for (int i = 0; i < vals.length; i++) {

            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(spaces + switcher(vals[counter],lower,upper));
            spaces = space.repeat((spaces + switcher(vals[counter],lower,upper)).length());
            if (counter == slope[1])
                counter=0;
            else
                counter++;


        }

    }


    public static String switcher(boolean b, String s1, String s2) {
        if (b)
            return s2;
        else
            return s1;
    }











    }




