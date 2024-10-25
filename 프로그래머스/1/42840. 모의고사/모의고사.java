import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];

        List<Integer> list1 = new ArrayList<>();
        for (int i=0; i<answers.length/5+1; i++){
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);
        }
        for (int i=0; i< answers.length; i++){
            if (list1.get(i)==answers[i]){
                scores[0]++;
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i=0; i<answers.length/8+1; i++){
            list2.add(2);
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(2);
            list2.add(4);
            list2.add(2);
            list2.add(5);
        }
        for (int i=0; i< answers.length; i++){
            if (list2.get(i)==answers[i]){
                scores[1]++;
            }
        }

        List<Integer> list3 = new ArrayList<>();
        for (int i=0; i<answers.length/10+1; i++){
            list3.add(3);
            list3.add(3);
            list3.add(1);
            list3.add(1);
            list3.add(2);
            list3.add(2);
            list3.add(4);
            list3.add(4);
            list3.add(5);
            list3.add(5);
        }
        for (int i=0; i< answers.length; i++){
            if (list3.get(i)==answers[i]){
                scores[2]++;
            }
        }

        int max = Arrays.stream(scores).max().orElse(0);
        List<Integer> students = new ArrayList<>();
        for(int i=0; i<scores.length; i++){
            if(scores[i]==max){
                students.add(i+1);
            }
        }

        return students.stream().mapToInt(Integer::intValue).toArray();
    }
}