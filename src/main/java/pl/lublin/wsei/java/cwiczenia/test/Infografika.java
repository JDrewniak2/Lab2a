package pl.lublin.wsei.java.cwiczenia.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Infografika {
    public Infografika(String tekst) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        String tytul;
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "asd";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        String adresStrony;
        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";


        pat = Pattern.compile("width=\"(.*)\"\\s*height");
        m = pat.matcher(tekst);
        String szerokosc;
        if (m.find())
            szerokosc = m.group(1);
        else
            szerokosc = "0";

    }
}
