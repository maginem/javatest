import java.util.Random;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(3);
        System.out.println(i);
        System.out.println("ポケモンタイプ相性問題！");
        String q1 = "タイプの弱点は次のうちどれ？番号を入力してください";
        String q = null;
        String a1 = "1.草 2.炎 3.水";
        String answer = null;

        switch(i){
            case 0:
                String q = "草";
                String correct = "2";
            break;
            case 1:
                String q = "炎";
                String correct = "3";
            break;            
            case 2:
                String q = "水";
                String correct = "1";
        }
        System.out.println(q + q1);
        System.out.println(a1);
        for (int x = 0; x < 1; x = 0 ) {
            answer = sc.next();
            if (answer.equals("1") || answer.equals("2") || answer.equals("3")) {
                break;
            } else {
                System.out.println("正しく入力してください");
            }
        }
        if (answer.equals(correct)) {
                System.out.println("正解！！");
        } else {
            System.out.println("不正解");
        }
        sc.close();
    }
} 
