public class ejercicioCapicua{ //Este es un ejemplo práctico que utiliza arrays, LinkedList y pilas en Java.
                //El objetivo de este programa es invertir una cadena de texto utilizando una pila.
                // Para ello, el programa debe leer una cadena de texto, almacenarla en una lista de
                // tipo LinkedList y luego utilizar una pila para invertirla, la palabra a invertir es "La vida es bella"
    private void invertirPalabras (String palabras){
        String [] array = palabras.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length; i >0 ; i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);
    }
    public static void main (String [] args) {
        ejercicioCapicua ejercicioCapicua = new ejercicioCapicua();
        ejercicioCapicua.invertirPalabras("La vida es bella");
    }

}
