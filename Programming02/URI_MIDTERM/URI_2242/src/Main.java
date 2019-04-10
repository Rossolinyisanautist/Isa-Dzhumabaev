
// BULLSHIT Main2 IS BETTER
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = "aeiou".toCharArray();              // 5
        String input = sc.next();                           // сам инпут
        char[] newList = new char[input.length()];          // новый массив, в котором далее будут удалены все согласные
        int newWordLength = 0;                              // длинна финального массива, без согласных
        for(int i = 0; i < input.length(); i++){            // избавиться от всех согласных
            for(int j = 0; j < vowels.length; j++){         //
                if(input.charAt(i) == vowels[j]){           // если буква гласная то добавить её в newList
                    newList[i] = input.charAt(i);
                    newWordLength++;
                    break;
                }
                else{
                    newList[i] = ' ';                       // если же согласная то добавить ' '  в newList вместо этой буквы
                }
            }
        }
        char[] newWord = new char[newWordLength];           // финальный массив
        for(int i = 0, j = 0; i < newList.length; i++){     //
            if(newList[i] != ' '){                          // проверка символов из newList. Проверить буква это или пробел
                newWord[j] = newList[i];                    // если буква то положить её в newWord
                j++;                                        // индекс следующей ячейки newWord. Увеличивается только если найдена буква
            }
        }
        boolean isPalindrom = true;
        for(int i = 0, j = newWord.length - 1; i < j; i++, j--){    // проверка финального массива newWord на палиндромность
            if(newWord[i] != newWord[j]){                           //
                isPalindrom = false;                                // если найдено хотя бы одно не совпадение то это не палиндром
                break;
            }
        }
        System.out.println(isPalindrom ? "S" : "N");
    }
}/*
hahaha
riajkjdhhihhjak
a
huaauhahhuahau
    */