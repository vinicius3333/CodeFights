package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network
that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions 
of addresses. One of them is the IPv4 address.
IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255
inclusive, separated by dots, e.g., 172.16.254.1.
Given a string, find out if it satisfies the IPv4 address naming rules.

Um endereço IP é um rótulo numérico atribuído a cada dispositivo (por exemplo, computador, impressora) que participa de uma rede de computadores
que usa o protocolo de Internet para comunicação. Existem duas versões do protocolo da Internet e, portanto, duas versões
de endereços. Um deles é o endereço IPv4.
Endereços IPv4 são representados em notação ponto-decimal, que consiste em quatro números decimais, cada um variando de 0 a 255
inclusive, separados por pontos, por exemplo, 172.16.254.1.
Dada uma string, descubra se ela satisfaz as regras de nomenclatura do endereço IPv4.
---Comentários/ Comments---
Make an algorithm that returns if a String is a valid ip number

Faça um algoritmo que retorne se uma String é um número de ip válido
***/

public class isIPv4Adress {
    public static void main(String[] args){
        System.out.println(isIPv4Adress(".16.254.1"));
    }

    static boolean isIPv4Adress(String inputString){
        String IPV4_REGEX = "\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";
        return inputString.matches(IPV4_REGEX);
        //return inputString.matches("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");
        /**
         * Expressão regular IPv4;
         */
    }
}
