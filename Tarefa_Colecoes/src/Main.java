/*
* @author pmpedrolima@gmail.com
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    @Override
    public String toString() {
        return name;
    }
    public String name;
    public String name2;
    public String name3;
    public String name4;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome com -m o -f para identificar o seu sexo: ");
        String name = scan.nextLine();

        System.out.println("Digite seu nome com -m o -f para identificar o seu sexo: ");
        String name2 = scan.nextLine();

        System.out.println("Digite seu nome com -m o -f para identificar o seu sexo: ");
        String name3 = scan.nextLine();

        System.out.println("Digite seu nome com -m o -f para identificar o seu sexo: ");
        String name4 = scan.nextLine();

        ArrayList<String> nameList = new ArrayList(10);
        nameList.add(name3);
        nameList.add(name);
        nameList.add(name2);
        nameList.add(name4);
        Collections.sort(nameList);

        if(name.contains("f")) {
            System.out.println(name +": Feminino");
        } else if (name.contains("m")) {
            System.out.println(name + ": Masculino");
        }

        if(name2.contains("f")) {
            System.out.println(name2 + ": Feminino");
        } else if (name2.contains("m")) {
            System.out.println(name2 + ": Masculino");
        }

        if(name3.contains("f")) {
            System.out.println(name3 + ": Feminino");
        } else if (name3.contains("m")) {
            System.out.println(name3 +": Masculino");
        }

        if(name4.contains("f")) {
            System.out.println(name4 + ": Feminino");
        } else if (name4.contains("m")) {
            System.out.println(name4 + ": Masculino");
        }
        System.out.println(nameList);
    }
}