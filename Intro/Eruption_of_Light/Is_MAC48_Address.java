package CodeFights.Intro.Eruption_of_Light;

/*** 
---Pergunta/ Question---
A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical
network segment. The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal 
digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB). Your task is to check by given string inputString whether it 
corresponds to MAC-48 address or not.

Um endereço de controle de acesso à mídia (endereço MAC) é um identificador exclusivo atribuído a interfaces de rede para comunicações no 
ambiente físico. segmento de rede. O formato padrão (IEEE 802) para impressão de endereços MAC-48 em formato de uso humano é de seis grupos
de dois endereços hexadecimais. dígitos (0 a 9 ou A a F), separados por hífens (por exemplo, 01-23-45-67-89-AB). Sua tarefa é verificar
pela string fornecida inputString se corresponde ao endereço MAC-48 ou não.
---Comentários/ Comments---
Make an algorithm to check if a String is a MAC48.

Faça um algoritmo para verificar se uma String é um MAC48.
***/

public class Is_MAC48_Address {
    public static void main(String[] args) {
        System.out.println(isMAC48Address("00-1B-63-84-45-E6"));
    }

    static boolean isMAC48Address(String inputString) {
        String myRegex = "^[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}";
        return inputString.matches(myRegex);
    }
}
