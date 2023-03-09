public class FirstA {
    static int letrasEnPalabra(String x, char y){
        int acc=0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.toUpperCase(x.charAt(i)) == Character.toUpperCase(y) ) {
              acc++;
            }
        }
        if (acc == 0) {
            System.out.println("\u001B[35mNo se encontrarón coincidencias del caracter dentro de la palabra\u001B[0m");
        }else {
            System.out.println("Se encontrarón \u001B[32m"+ acc + "\u001B[0m coincidencias \u001B[36m(sin distinción de mayusculas)\u001B[0m de \u001B[32m\"" + y + "\"\u001B[0m en: \u001B[33m\"" + x+"\"\u001B[0m");
        }

    return acc;
    }
    public static void main(String[] args) {
        //probando el metodo de contador de incidencias del chart en el string
        System.out.println(letrasEnPalabra("BElen", 'e'));

        System.out.println(letrasEnPalabra("murcielago", 'f'));

        System.out.println(letrasEnPalabra("abrAcadAbra", 'a'));

    }
}