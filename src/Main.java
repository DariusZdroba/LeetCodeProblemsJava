import java.util.*;

public class Main {
    public static void main(String[] args) {
    int[] position = {0,2,4};
    int[] speed = {4,2,1};
    System.out.println(carFleet(100, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        if(position.length < 1) return 0;
        int fleet = 1;
        Tuple[] tuples = new Tuple[position.length];

        for(int i=0; i<position.length;i++)
        {
            tuples[i] = new Tuple(position[i], speed[i]);
        }
        Arrays.sort(tuples, Comparator.comparingInt(tuple -> tuple.position));
        Stack<Float> stack = new Stack<Float>();
        float time;
        for(int i = position.length-1; i>=0; i--)
        {
            if(stack.size() >= 2 && stack.peek() >= (float)((target - tuples[i].position) / tuples[i].speed))
            {
                stack.pop();
            }
            stack.add((float)((target - tuples[i].position) / tuples[i].speed));
        }
        return stack.size();
    }
}