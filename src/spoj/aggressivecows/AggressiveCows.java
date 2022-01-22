package spoj.aggressivecows;


import java.util.*;

public class AggressiveCows {
    int[] stallLoc = {1, 2, 8, 16, 9};
    int cows = 3;
    List<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        CoreRunner cr = new CoreRunner();
        Arrays.sort(cr.stallLoc);
        int low = cr.stallLoc[0], high = cr.stallLoc[cr.stallLoc.length -1 ];
        cr.cowChecker(low, high);
        System.out.println(cr.result);
        System.out.println(Collections.max(cr.result));
    }
    public void cowChecker(int low, int high) {
        if(low <= high) {
            int mid = (int) Math.floor((low + high) / 2);
            System.out.println("mid = " + mid);
            int i = 0, count = 0;
            for(int j = i + 1; j < stallLoc.length;) {
                if(stallLoc[j] - stallLoc[i] >= mid) {
                    count++;
                    i = j;
                    j = j + 1;
                }
                else j = j + 1;
            }
            if(count >= cows - 1) {
                result.add(mid);
                cowChecker(mid + 1, high);
            }
            else {
                cowChecker(low, mid - 1);
            }
        }
    }
}




//SOLUTION WITH DIFFERENCE VALUE AND THE POSTIONS ALSO.
class CoreRunner {
    //THE POSITIONS AT WHICH WE HAVE STALLS.
    int[] stallLoc = {1, 2, 8, 16, 9, 12, 17};
    //NUMBER OF COWS.
    int cows = 3;
    //THIS WILL CONTAIN ALL THE DIFFERENCES/MID VALUES WHICH WILL
    //FIT ALL THE COWS. WE WILL SELECT THE MAX.
    List<Integer> result = new ArrayList<Integer>();
    //THIS IS TO FETCH THE LOCTIONS ALONG WITH THE DIFFERENCE/MID VALUE.
    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

    public static void main(String[] args) {
        CoreRunner cr = new CoreRunner();
        //FIRST WE SORT THE LOCATIONS ARRAY.
        Arrays.sort(cr.stallLoc);
        //GET LOW AND HIGH OF BINARY SEARCH.
        int low = cr.stallLoc[0], high = cr.stallLoc[cr.stallLoc.length -1 ];
        cr.cowChecker(low, high);
        //THIS WILL SHOW ALL POSSIBLE DIFFERENCES WHICH WILL FIT THE COWS.
        System.out.println(cr.result);
        //MAX OF THOSE DIFFERENCES.
        int key = Collections.max(cr.result);
        System.out.println(key);
        //NOW WE SEARCH THE MAP WITH THE KEY AND GET THE LIST WITH THE
        //LOCATIONS. NOTE THAT THE LIST CONTAINS THE LOCATIONS/INDEXES
        //IN THE ARRAY. SO IT WILL GIVE OUT ARRAY POSITIONS, FOR STALL
        //LOCATIONS WE NEED TO GET VALUES AT THOSE INDEXES WHICH IS EASY.
        System.out.println(cr.map.get(key));
    }
    public void cowChecker(int low, int high) {
        if(low <= high) {
            //WHICHEVER LOCATIONS ARE APPLICABLE FOR A GIVEN MID WILL
            //BE ADDED TO THE LOCATIONS LIST AND THIS WILL FINALLY
            //BE ADDED TO THE MAP. THIS IS NEEDED ONLY WHEN WE WANT
            //LOCATIONS ALONG WITH THE MID/DIFFERENCE VALUE.
            List<Integer> locations = new ArrayList<Integer>();
            int mid = (int) Math.floor((low + high) / 2);
            System.out.println("mid = " + mid);
            int i = 0, count = 0;
            //FOR EACH VALUE OF MID, WE ITERATE THIS LOOP ONLY ONCE.
            for(int j = i + 1; j < stallLoc.length;) {
                if(stallLoc[j] - stallLoc[i] >= mid) {
                    count++;
                    i = j;
                    locations.add(j);
                    j = j + 1;

                }
                else j = j + 1;
            }
            if(count >= cows - 1) {
                result.add(mid);
                cowChecker(mid + 1, high);
                map.put(mid, locations);
            }
            else {
                cowChecker(low, mid - 1);
            }
        }
    }
}


/*
OUTPUT:
        mid = 9
        mid = 4
        mid = 6
        mid = 7
        mid = 8
        [4, 6, 7, 8]
        8
        [3, 6]
*/
