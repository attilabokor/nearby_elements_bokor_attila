import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        nearby(8, 6, 0);
        nearby(3, 6, 0);
        nearby(8, 6, 0);




    }


    public static ArrayList<Integer> nearby (Integer startElement, Integer rangeOfSearch, Integer listNumber) {


        int[][] multi = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16},
                {11, 12, 1, 3, 14, 15}
        };

        ArrayList<Integer> result = new ArrayList<>();


        if ((startElement - rangeOfSearch) > 0 && (startElement + rangeOfSearch) < multi[listNumber].length) {
            for (int i = (startElement) - rangeOfSearch; i < (startElement) + rangeOfSearch; i++)
                if (multi[listNumber][startElement] != multi[listNumber][i]) {
                    result.add(multi[listNumber][i]);
                }

        } else if ((startElement - rangeOfSearch) < 0 && (startElement + rangeOfSearch) < multi[listNumber].length) {
            for (int t = 0; t <= startElement + rangeOfSearch; t++)
                if (multi[listNumber][startElement] != multi[listNumber][t]) {
                    result.add(multi[listNumber][t]);
                }
        } else if ((startElement - rangeOfSearch) < 0 && (startElement + rangeOfSearch) > multi[listNumber].length) {
            for (int r = 0; r < startElement + (multi[listNumber].length - startElement); r++)
                if (multi[listNumber][startElement] != multi[listNumber][r]) {
                    result.add(multi[listNumber][r]);
                }
        } else if ((startElement - rangeOfSearch) > 0 && (startElement + rangeOfSearch) > multi[listNumber].length)
            for (int y = (startElement - rangeOfSearch); y < startElement + (multi[listNumber].length - startElement); y++)
                if (multi[listNumber][startElement] != multi[listNumber][y]) {
                    result.add(multi[listNumber][y]);
                }


        System.out.println(result);

        return (result);
    }

}





