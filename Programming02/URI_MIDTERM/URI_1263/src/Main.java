import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String[] input = sc.nextLine().toLowerCase().split(" ");         // Сплит весь иинпут сразу во время ввода
            char[] firstLetters = new char[input.length];                           // char массив будет состоять только из первых букв
            int alliterations = 0;                                                  // счетчик

            for(int i = 0; i < input.length; i++){                                  //
                firstLetters[i] = input[i].charAt(0);                               // Заполнить массив только первыми буквами инпута
            }                                                                       //

            for(int i = 0, j = i + 1; j < firstLetters.length; i++, j++){
                if(firstLetters[i] == firstLetters[j]){                     // Если найден пара одинаковых,
                    alliterations++;                                        // то счетчик увеличивается на 1.
                    int n = j;                                              // Теперь надо найти букву отличную от нынешней пары, n - вторая буква пары.
                    int k = j + 1;                                          // Сразу берем следующую букву после найденной пары.
                    while(k < firstLetters.length){
                        if(firstLetters[n] != firstLetters[k]){// Если вторая буква не равна следующей то отличная от пары буква
                            i = n;                             // найдена и мы выходим из цикла.
                            j = k;                             // Сохранить кол-во шагов до нахождения новой буквы, чтобы во внешнем
                                                               // цикле не проверять уже проверенные в этом цикле буквы.
                            break;                             // Нужно выйти из цикла, так как тепрь нужно увеличить счётчик во внешнем цикле.
                        }
                        i = n;                                 // Во время каждой итерации и i и j
                        j = k;                                 // увеличиваются вместе с n и k.
                        n++;                                   // n и k увеличиваются после каждой итерации, чтобы в каждой
                        k++;                                   // новой итерации сравнивать следующие две буквы.
                    }                                          // (Шаг должен быть в одну букву, а не в одну пару, чтобы проверить всё возможные пары)
                }
            }
            System.out.println(alliterations);
        } while (sc.hasNext());
    }
}/*
He has four fanatic fantastic fans
h h f f f f
There may be no alliteration in a sequence
t m b n a i a s
Round the rugged rock the ragged rascal ran
r t r r t r r r
area artic Soul Silly subway ant artic none
a a s s s a a n

2
0
2
3
*/