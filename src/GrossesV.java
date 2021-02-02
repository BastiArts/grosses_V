import java.util.Scanner;

/**
 * grosses_V
 *
 * @author: Sebastian Schiefermayr
 * Date: 02.02.2021
 * Time: 08:30
 * =====================================
 * Website: https://bastiarts.com
 * Email: basti@bastiarts.com
 * Github: https://github.com/BastiArts
 * =====================================
 */
public class GrossesV {
    private static final String SEPARATOR = "_";
    private static final String CHARACTER = "V";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Bitte gib eine ungerade Zahl ein: ");
            input = sc.nextInt();
        } while (input % 2 == 0);
        buildV(input);
    }

    /**
     * @param input - Eingegebene Zahl als float -> benötigt für die Division auf Zeile 35
     * */
    private static void buildV(final float input) {
        int characters = 0, separators = 0;
        // Anzahl der Reihen
        for (int i = 0; i < Math.round(input / 2); i++) {
            // ...jedes Zeichen in der Reihe prüfen, ob es ein Trennzeichen oder ein "V" ist.
            for (int j = 0; j < input; j++) {
                // Eine Subtraktion von Position und Reihe ergibt die Einrückung
                if(j-i == 0 || j+i == input-1){
                    System.out.print(CHARACTER);
                    characters++;
                }else{
                    System.out.print(SEPARATOR);
                    separators++;
                }
            }
            System.out.println();
        }
        System.out.println("============");
        System.out.println("Characters total: " + (characters + separators));
        System.out.println("Characters: " + characters);
        System.out.println("Separators: " + separators);
        System.out.println("============");
    }
}
