package inflearn;

import java.util.Scanner;

// 문자 찾기
public class CharAt {
    public static class Main{
        public int solution(String str, char t){
            int answer = 0;
            str = str.toUpperCase();
            t = Character.toUpperCase(t);
            for(char x : str.toCharArray()){
                if(x==t)
                    answer++;
            }
            return answer;
        }
        public static void main(String[] args) {
            Main T = new Main();
            Scanner kb = new Scanner(System.in);
            String str = kb.next();
//        String str = "cocoball";
            char c = kb.next().charAt(0);

            System.out.println(T.solution(str, c));
        }
    }

}
