package interviewbit.level2.arrays.valuesranges.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * Example 1:
 * <p>
 * Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
 * <p>
 * Example 2:
 * <p>
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
 * <p>
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * <p>
 * Make sure the returned intervals are also sorted.
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        if (intervals == null)
            return result;
        intervals.add(newInterval);
        // First sort the intervals list
        // Order of sorting is on tha basis of 'start' if the start attribute is not same
        // If they are same then use 'end' attribute for sorting
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });

        Interval prev = intervals.get(0);
        for (int i = 0; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start > prev.end) {
                result.add(prev);
                prev = current;
            } else {
                Interval merged = new Interval(prev.start, Math.max(prev.end, current.end));
                prev = merged;
            }
        }
        result.add(prev);
        return result;
    }

    public static class Interval {
        public int start;
        public int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Interval interval = (Interval) o;

            if (start != interval.start) return false;
            return end == interval.end;
        }

        @Override
        public int hashCode() {
            int result = start;
            result = 31 * result + end;
            return result;
        }
    }
}
