package interviewbit.level2.arrays.arrangement.rotatearray;

import java.util.ArrayList;

/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]


Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]

 */
public class Solution {
    /**
     * Solution can be obtained in below two steps
     * 1.Find transpose of matrix.
     * Transpose of the matrix is the matrix which is obtained by converting all rows to columns
     * 2.Reverse rows of the transpose.
     * Since we require to rotate elements 90 degrees in clock wise direction hence reverse the rows elements
     * Had there been a requirement to rotate elements 90 degrees in anti-clockwise direction then we would have needed to reverse columns of transposed matrix
     *
     * @param a
     */


    public void rotate(ArrayList<ArrayList<Integer>> a) {
        if (a == null || a.size() == 0) {
            return;
        }
        //First get the transpose of the matrix
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.get(0).size(); j++) {
                Integer temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i)); //a[i][j]=a[j][i]
                a.get(j).set(i, temp);
            }
        }
        //Reverse each and every element inside row of matrix
        for (int row = 0; row < a.size(); row++) {
            for (int i = 0, j = a.size() - 1; i <= j; i++, j--) {
                Integer temp = a.get(row).get(i);
                a.get(row).set(i, a.get(row).get(j));
                a.get(row).set(j, temp);
            }
        }

    }
}
