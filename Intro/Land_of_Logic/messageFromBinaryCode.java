package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue, you've
found a binary code written on the wall behind a vase, and realized that it must be an encrypted message. After some 
thought, your first guess is that each consecutive 8 bits of the code stand for the character with the corresponding extended 
ASCII code. Assuming that your hunch is correct, decode the message.

Você está participando de um desafio do Escape Room projetado especificamente para programadores. Em seus esforços para
encontrar uma pista, você encontra um código binário escrito na parede atrás de um vaso e percebe que ele deve ser uma 
mensagem criptografada. Após alguns pensamentos, seu primeiro palpite é que cada 8 bits consecutivos do código representam o 
caractere com a extensão estendida correspondente. Código ASCII. Supondo que seu palpite esteja correto, decodifique a mensagem.
---Comentários/ Comments---
Make an algorithm that takes the binary codes and transforms them into characters through the ASCII table.

Faça um algoritmo que pegue os códigos binários e transforme-os em caracteres através da tabela ASCII.
***/

public class messageFromBinaryCode {
    public static void main(String[] args) {

    }

    static String messageFromBinaryCode(String code) {
        int bin, div = code.length() / 8, test = 8, test2 = 0;
        StringBuilder s = new StringBuilder();

        while(div-- > 0){
            bin = Integer.valueOf(code.substring(test2,test), 2);
            System.out.println(bin);

            s.append(Character.toChars(bin));

            test += 8;
            test2 += 8;
        }

        return s.toString();
    }

}
