package inflearn;

import java.util.Scanner;

// 대문자를 소문자로, 소문자를 대문자로
// 알파멧 아스키 코드 -> A-65 Z-90 a-97 z-122
// 65<=char<=90 이면 대문자, 97<=char<=122 이면 소문자
// 'A'<=char<='Z' , 'a'<=char<='z' 이렇게 해도 됨
// 1. 소문자에서 대문자로 바꾼다 -> 각문자마다 -32를 하면 됨
// 2. 대문자를 소문자로 바꾼다 -> 각 문자마다 +32를 하면 됨
public class UpperLower {
    public String solution(String str){
        String answer = "inWed";
        for(char x: str.toCharArray()){
            if(x>=97 && x<=122)
                answer+=(char)(x-32);   // 형변환을 해주지않으면 char + int = int 이므로 문자가 아니라 숫자가 출력됨
            else
                answer+=(char)(x+32);
        }
        return answer;
    }
    public static void main(String[] args) {
        UpperLower T = new UpperLower();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }
}