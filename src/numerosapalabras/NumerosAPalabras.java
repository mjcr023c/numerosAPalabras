package numerosapalabras;

/**
 *
 * @author Martin Corrales
 * @version 1.0
 */

public class NumerosAPalabras {
    /**
     * Funcion que convierte los numeros enteros en su equivalente en palabras
     * 
     * @param int i valor entero que se desea convertir a palabras
     *
     * @return Retorna la frase completa del numero entero en palabras
     *
     */
    public String convertNumbertoWords(int i) {
        String resultado = "";
        if (i < 0) {
            resultado = "menos";
            i = (i * (-1));
        }
        if (0 <= i && i <= 30) {
            resultado += numerosaPalabras(i);
        }
        if (31 <= i && i <= 99) {
            int segundoDigito = i % 10;
            int primerDigito = i - segundoDigito;
            resultado += numerosaPalabras(primerDigito);
            if (segundoDigito != 0) {
                resultado += " y " + numerosaPalabras(segundoDigito);
            }
        }
        if (100 <= i && i <= 999) {
            int tercerDigito = i % 10;
            int segundoDigito = (i % 100);
            int primerDigito = i - (i % 100);
            resultado += numerosaPalabras(primerDigito);
            if (segundoDigito == 0 && tercerDigito == 0) {

            } else {
                if (primerDigito == 100) {
                    resultado += "to ";
                }
                resultado += " " + convertNumbertoWords(segundoDigito);
            }

        }
        if (1000 <= i && i <= 999999) {
            int principio = i - (i % 1000);
            int fin = i - principio;
            if (principio == 1000) {
                resultado += "mil ";
            } else {
                resultado += convertNumbertoWords(principio / 1000) + " mil ";
            }
            if (fin != 0) {
                resultado += convertNumbertoWords(fin);
            }
        }
        if (1000000 <= i && i <= 999999999) {
            int principio = i - (i % 1000000);
            int fin = i - principio;
            if (principio == 1000000) {
                resultado += "un millon ";
            } else {
                resultado += convertNumbertoWords(principio / 1000000) + " millones ";
            }
            if (fin != 0) {
                resultado += convertNumbertoWords(fin);
            }
        }

        return resultado;
    }

    /**
     * Funcion que retorna el valor de un numero en palabras
     * 
     * @param int n es un numero que se buscara en la seleccion multiple
     *
     * @return Retorna la palabra asociada al numero pasado por parametro
     *
     */
    public String numerosaPalabras(int n) {
        String numero = " ";
        switch (n) {
            case 0:
                numero = "cero";
                break;
            case 1:
                numero = "uno";
                break;
            case 2:
                numero = "dos";
                break;
            case 3:
                numero = "tres";
                break;
            case 4:
                numero = "cuatro";
                break;
            case 5:
                numero = "cinco";
                break;
            case 6:
                numero = "seis";
                break;
            case 7:
                numero = "siete";
                break;
            case 8:
                numero = "ocho";
                break;
            case 9:
                numero = "nueve";
                break;
            case 10:
                numero = "diez";
                break;
            case 11:
                numero = "once";
                break;
            case 12:
                numero = "doce";
                break;
            case 13:
                numero = "trece";
                break;
            case 14:
                numero = "catorce";
                break;
            case 15:
                numero = "quince";
                break;
            case 16:
                numero = "dieciseis";
                break;
            case 17:
                numero = "diecisiete";
                break;
            case 18:
                numero = "dieciocho";
                break;
            case 19:
                numero = "diecinueve";
                break;
            case 20:
                numero = "veinte";
                break;
            case 30:
                numero = "treinta";
                break;
            case 40:
                numero = "cuarenta";
                break;
            case 50:
                numero = "cincuenta";
                break;
            case 60:
                numero = "sesenta";
                break;
            case 70:
                numero = "setenta";
                break;
            case 80:
                numero = "ochenta";
                break;
            case 90:
                numero = "noventa";
                break;
            case 100:
                numero = "cien";
                break;
            case 200:
                numero = "doscientos";
                break;
            case 300:
                numero = "trescientos";
                break;
            case 400:
                numero = "cuatrocientos";
                break;
            case 500:
                numero = "quinientos";
                break;
            case 600:
                numero = "seicientos";
                break;
            case 700:
                numero = "setecientos";
                break;
            case 800:
                numero = "ochocientos";
                break;
            case 900:
                numero = "novecientos";
                break;
            case 1000:
                numero = "mil";
                break;
            case 21:
                numero = "ventiuno";
                break;
            case 22:
                numero = "ventidos";
                break;
            case 23:
                numero = "ventitres";
                break;
            case 24:
                numero = "venticuatro";
                break;
            case 25:
                numero = "venticinco";
                break;
            case 26:
                numero = "ventiseis";
                break;
            case 27:
                numero = "ventisiete";
                break;
            case 28:
                numero = "ventiocho";
                break;
            case 29:
                numero = "ventinueve";
                break;
        }
        return numero;
    }
}
