package findShape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static class Coordinate{
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object other){
            if(other==null || !(other instanceof Coordinate))
                return false;

            Coordinate o = (Coordinate)other;
            return o.x ==this.x && o.y ==this.y;
        }

        @Override
        public int hashCode(){
            return x*13+y;
        }
    }

    private Map<Coordinate, Coordinate> parent = new HashMap<>();

    private void union(Coordinate f, Coordinate s){
        Coordinate fp = find(f);
        Coordinate sp = find(s);
        parent.put(fp, sp);
    }

    private Coordinate find(Coordinate c) {
        Coordinate p = parent.get(c);
        if(p==null){
            parent.put(c, c);
            return c;
        } else if(! p.equals(c)){
            p = find(p);
            parent.put(c, p);
        }

        return p;
    }

    Collection<List<Coordinate>> findShapes(boolean[][] matrix){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]){
                     find(new Coordinate(i,j));
                    if(i>0 && matrix[i-1][j]){
                        union(new Coordinate(i-1,j), new Coordinate(i,j));
                    }

                    if(j>0 && matrix[i][j-1]){
                        union(new Coordinate(i,j-1), new Coordinate(i,j));
                    }
                }
            }
        }

        return getSets().values();
    }

    private Map<Coordinate, List<Coordinate>> getSets() {
        Map<Coordinate, List<Coordinate>> sets = new HashMap<>();
        for(Coordinate c: parent.keySet()){
            Coordinate parent = find(c);
            sets.computeIfAbsent(parent, k -> new ArrayList<>()).add(c);
        }

        return sets;
    }
}
