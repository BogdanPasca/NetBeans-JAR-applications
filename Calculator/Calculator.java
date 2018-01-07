/**
 * Un program care citeste 2 numereintroduse de utlizatorsi in functie de operatiaaleasa de acesta (- , + , / , % , *)
 * face respectivulcalcul cu celedouanumere.
 * @author PaşcaBogdan;
 * @paramnr1 :primulnumarintrodus de utilizator de la tastatura;
 * @paramnr2 : al doileanumarintrodus de utilizator de la tastatura;
 * @paramprimulNumar : variabila in care estesalvatprimulnumarintrodus de utilizator de la tastatura;
 * @paramalDoileaNumar : variabila in care estesalvat al doileanumarintrodus de utilizator de la tastatura;
 */

package com.bogdan;
import java.util.Scanner;


public class Main {

public static void main(String[] args) {
        Scanner nr1 = new Scanner(System.in);
System.out.println("Introducetiprimulnumar: ");
intprimulNumar = Integer.parseInt(nr1.nextLine());

Scanner nr2 = new Scanner(System.in);
System.out.println("Introduceti al doileanumar: ");
intalDoileaNumar = Integer.parseInt(nr1.nextLine());

Scanner semn = new Scanner(System.in);
System.out.println("Introducetioperatiadorita: ( - , + , / , %, *) : ");
String operatie = semn.nextLine();

        switch (operatie) {
case "+":
System.out.println("Suma numereloreste:" + (primulNumar + alDoileaNumar));
                break;
            case "-":
System.out.println("Diferentanumereloreste: " + (primulNumar - alDoileaNumar));
                break;
            case "/":
if (alDoileaNumar == 0) {
System.out.println("varugamintroduceti un al doileanumardiferit de 0");
} else {
System.out.println("Catulnumereloreste: " + (float) ((float) primulNumar / (float) alDoileaNumar));
}
break;
            case "%":
if (alDoileaNumar == 0) {
System.out.println("varugamintroduceti un al doileanumardiferit de 0");
} else {
System.out.println("Restulnumereloreste: " + (primulNumar % alDoileaNumar));
}
break;
            case "*":
System.out.println("Produsulnumereloreste:" + (primulNumar * alDoileaNumar));
                break;
            default:
System.out.println("Introducetidoarunul din semnele urmatoare: -, +, /, %, * ");

}

    }
}
