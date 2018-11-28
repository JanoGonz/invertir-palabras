class Actividad0438 {
    public String invertirPalabrasDe4Letras(String palabra) {
        String palabraInvertida  = "";
        if (palabra.length() == 4) {
            palabraInvertida = palabra.charAt(3) + "" + palabra.charAt(2) + "" + palabra.charAt(1) + "" + palabra.charAt(0);
        }
        return palabraInvertida;
    }
}