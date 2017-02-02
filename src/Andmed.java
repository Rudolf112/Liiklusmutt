/**
 * Created by rudolf on 31.01.2017.
 */
class Andmed {
    static int kesklinn;
    static int tabasalu;
    static int paldiski;
    static int mustamäe;

    Andmed(int count){
        kesklinn = count;
        tabasalu = count;
        paldiski = count;
        mustamäe = count;
    }

    static void lisaTabasalu(){
        tabasalu++;
    }
    static void lisaKesklinn(){
        kesklinn++;
    }
    static void lisaPaldiski(){
        paldiski++;
    }
    static void lisaMustamäe(){
        mustamäe++;
    }

    static String autodKokku(){
        String kokku = Integer.toString(paldiski+kesklinn+tabasalu+mustamäe);
        return kokku;
    }

    static String populaarseimSuund(){
        if (kesklinn > mustamäe && kesklinn > paldiski && kesklinn > tabasalu)
        {
        String vastus = "Kesklinn";
            return vastus;
        }
        if (tabasalu > mustamäe && tabasalu > paldiski && tabasalu > kesklinn)
        {
            String vastus = "Tabasalu";
            return vastus;
        }
        if (mustamäe > kesklinn && mustamäe > paldiski && mustamäe > tabasalu)
        {
            String vastus = "Mustamäe";
            return vastus;
        }
        if (paldiski > mustamäe && paldiski > kesklinn && paldiski > tabasalu)
        {
            String vastus = "Paldiski";
            return vastus;
        }
        else {
            String vastus = "Hetkel on mitu suunda sama populaarsed...";
            return vastus;
        }
        }
    }

