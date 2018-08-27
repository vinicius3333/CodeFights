package CodeFights.Intro.Eruption_of_Light;

/*** 
---Pergunta/ Question---
An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an "@" symbol, then a 
domain part ("example.com"). The domain name part of an email address may only consist of letters, digits, hyphens and dots. 
The local part, however, also allows a lot of different special characters. Here you can look at several examples of correct
and incorrect email addresses. Given a valid email address, find its domain part.

Um endereço de e-mail como "John.Smith@example.com" é composto de uma parte local ("John.Smith"), um símbolo "@", depois um
parte do domínio ("example.com"). A parte do nome de domínio de um endereço de e-mail pode consistir apenas em
letras, dígitos, hífens e pontos. A parte local, no entanto, também permite muitos caracteres especiais diferentes. Aqui você pode
ver vários exemplos de endereços de email incorretos. Dado um endereço de e-mail válido, encontre sua parte de domínio.
---Comentários/ Comments---
Make an algorithm to return the part of the email after the "@".

Faça um algoritmo para retornar a parte do email depois do "@".
***/

public class Find_Email_Domain {
    public static void main(String[] args) {
        System.out.println(findEmailDomain("<>[]:,;@\\\"!#$%&*+-/=?^_{}| ~.a\\\"@example.org"));
    }

    static String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@")+1, address.length());
    }
}
