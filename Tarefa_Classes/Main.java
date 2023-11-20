/*
* @author pmpedrolima@gmail.com
 */

public class Main {
    public static void main(String[] args) {
        //Chamada de class
        Computador computador = new Computador();

        // Setter´s das classes
        computador.setName("Lenovo Ideapad 3i");
        computador.setId(1);
        computador.setHd(256);
        computador.setRam(8);
        computador.setLink("https://www.lenovo.com/br/pt/laptops/ideapad/serie-300/IdeaPad-3-15ITL6/p/82MD000JBR?cid=br:sem|se|google|j-b2c-devices-convers-google-performancemax-intelccf|||pt_BR82MD000JBR|17858803823|||pmax||consumer&gad_source=1&gclid=CjwKCAiAgeeqBhBAEiwAoDDhn7AdkpcALAQOe3FW8z8vvVCnfsvGYDfGbWcqjkzWbBMaFeUVmO7wXRoC-u0QAvD_BwE");
        computador.setMarca("Lenovo");
        computador.setProcessador("Processador Intel® Core™ i5-1135G7 de 11ᵃ geração (2,40 GHz até 4,20 GHz)");
        computador.setSistemaOperacional("Windows 11 Home");

        //Printando no console a ficha tecnica
        System.out.println("Ficha técnica: " + computador.getName());
        System.out.println("id: " + computador.getId());
        System.out.println("Memoria SSD: " + computador.getHd());
        System.out.println("Memoria RAM: " + computador.getRam());
        System.out.println("Link para compra: " + computador.getLink());
        System.out.println(" Marca do computador: " + computador.getMarca());
        System.out.println(" Processador: " + computador.getProcessador());
        System.out.println(" Sistema operacional: " + computador.getSistemaOperacional());

    }
}
