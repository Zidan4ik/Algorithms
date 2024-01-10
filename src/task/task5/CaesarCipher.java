package task.task5;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть строку для оброблення: ");
        String term = scanner.nextLine();
        while(true){
            System.out.println("Введіть цифру для обробки: 1 - зашифрувати, 2 - розшифрувати, 3 - закінчити роботу");
            int var = scanner.nextInt();
            if(var==1){
                encryptOrDecrypt(term,true);
            }else if(var==2){
                encryptOrDecrypt(term,false);
            }else if(var==3){
                break;
            }
        }
        scanner.close();
    }

    public static void encryptOrDecrypt(String term, boolean handle) {
        String i = term;
        int shift = 1;
        StringBuilder result = new StringBuilder();
        if (handle) {
            for (char ch : i.toCharArray()) {
                if (Character.isLetter(ch)) { //перевірка, чи є поточний символ літерою за допомогою
                    char shiftedChar = (char) (((ch -'a'+ (shift) )%26)+'a');
                    result.append(shiftedChar);
                } else {
                    result.append(ch);
                }
            }

        } else {
            for (char ch : i.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char shiftedChar = (char) (((ch - 'a' + (26-shift) ) % 26) + 'a');
// Вираз ch - 'a' визначає числовий індекс літери у внутрішньому представленні алфавіту.
// + 'a' - відновлює необхідний код ASCII для відображення літери
                    result.append(shiftedChar);
                }
                else {result.append(ch);}
            }
        }
        System.out.println(result.toString());

    }
}
