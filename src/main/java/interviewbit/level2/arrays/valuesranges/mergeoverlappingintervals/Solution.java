package interviewbit.level2.arrays.valuesranges.mergeoverlappingintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Given a collection of intervals, merge all overlapping intervals.

For example:

Given [1,3],[2,6],[8,10],[15,18],

return [1,6],[8,10],[15,18].

Make sure the returned intervals are sorted.
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<Interval>();
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
