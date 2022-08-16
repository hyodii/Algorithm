package inflearn;

import java.util.Scanner;

// 한 문장에서 가장 긴 단어 출력하기
public class LongestWord {
    public String solution(String str){
        String[] words = str.split(" ");
        int max = 0;
        int index = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() > max){    // 단어가 더 길면 max가 바뀜
                max = words[i].length();
                index = i;
            }
        }
//        System.out.println("결과-->" + words[index]);
        return "가장 긴 단어는? => " + words[index];
    }

    public static void main(String[] args) {
        LongestWord T = new LongestWord();
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        String input = "it is time to study dksfjleifslkdfjsdlkd ksfjleifslkdfjsdlkdksfjleifslkdfjsdlk";
        System.out.println(T.solution(input));
    }
}
/*
* 가장 긴 단어는? => ksfjleifslkdfjsdlkdksfjleifslkdfjsdlk
* */