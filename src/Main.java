import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {

        String FILENAME = "md5decryptor-uk.txt";
        DetectCharacter d= new DetectCharacter();
        BufferedReader br = null;
        FileReader fr = null;
        int[] results =  new int[10000000];

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                results=d.getSpecialCharacterCount(sCurrentLine,
                        results
                );
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
        System.out.println(" \\newline Powyższa baza zawiera");
        System.out.println(" \\newline Wszystkich haseł: "+ results[29]);
        System.out.println(" \\newline Liczba haseł ze:");
        System.out.println(" \\newline Specjalnymi znakami: "+ results[0]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[0]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Małymi literami: "+ results[1]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[1]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Dużymi literami: "+ results[2]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[2]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Liczbami: "+ results[3]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[3]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Liczbami tylko na początku: "+ results[4]+" Procentowo haseł z liczbami: "+  Math.round(((double)results[4]/results[3]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Liczbami tylko na końcu: "+ results[5]+" Procentowo haseł z liczbami: "+  Math.round(((double)results[5]/results[3]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Specjalnymi znakami tylko na początku: "+ results[22]+" Procentowo haseł ze specjalnymi znakami: "+  Math.round(((double)results[22]/results[0]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Specjalnymi znakami tylko na końcu: "+ results[23]+" Procentowo haseł ze specjalnymi znakami: "+  Math.round(((double)results[23]/results[0]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małymi literami, dużymi literami, cyframi oraz znakami specjalnymi: "+ results[6]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[6]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małymi literami, dużymi literami, cyframi bez znaków specjalnych: "+ results[7]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[7]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł bez małych liter, z dużymi literami, cyframi oraz znakami specjalnymi: "+ results[8]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[8]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko z dużych Liter i cyfr: "+ results[9]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[9]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małymi literami, bez dużych liter, cyframi oraz znakami specjalnymi: "+ results[10]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[10]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko z małych Liter i cyfr: "+ results[11]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[11]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko ze znaków specjalnych i cyfr: "+ results[12]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[12]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko z cyfr: "+ results[13]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[13]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małymi literami, dużymi literami,bez cyfr oraz ze znakami specjalnymi: "+ results[14]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[14]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małymi literami, dużymi literami, bez  cyfr i bez znaków specjalnych: "+ results[15]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[15]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych z dużych literami,oraz znaków specjalnych: "+ results[16]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[16]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko z dużych Liter: "+ results[17]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[17]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł z małych liter oraz znaków specjalnych: "+ results[18]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[18]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko z małych Liter: "+ results[19]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[19]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Haseł złożonych tylko ze znaków specjalnych: "+ results[20]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[20]/results[29]*100) * 100.0) / 100.0+ "%");
        //System.out.println(" \\newline To powinno być puste: "+ results[21]+" Procentowo wszystkich haseł: "+  Math.round(((double)results[21]/results[29]*100) * 100.0) / 100.0+ "%");
        System.out.println(" \\newline Poniżej rozkład długości haseł");
        for(int i =1; i<20;i++){
            System.out.println(" \\newline Liczba haseł z długością: "+i+": "+ results[i+30] +" Procentowo wszystkich haseł: "+  Math.round(((double)results[i+30]/results[29]*100) * 100.0) / 100.0+ "%");
        }
        System.out.println(" \\newline Długością większą od 20: "+ results[50] +" Procentowo wszystkich haseł: "+  Math.round(((double)results[50]/results[29]*100) * 100.0) / 100.0+ "%");

        for(int i =1; i<6;i++){
            System.out.println(" \\newline Liczb na poczatku: "+i+": "+ results[i+60] +" Procentowo wszystkich z liczbami na poczatku: "+  Math.round(((double)results[i+60]/results[4]*100) * 100.0) / 100.0+ "%");
        }
        System.out.println(" \\newline Liczb na poczatku 6 i wiecej: "+": "+ results[66] +" Procentowo wszystkich z liczbami na poczatku: "+  Math.round(((double)results[66]/results[4]*100) * 100.0) / 100.0+ "%");

        for(int i =1; i<6;i++){
            System.out.println(" \\newline Liczb na koncu: "+i+": "+ results[i+70] +" Procentowo wszystkich z liczbami na koncu: "+  Math.round(((double)results[i+70]/results[5]*100) * 100.0) / 100.0+ "%");
        }
        System.out.println(" \\newline Liczb na koncu 6 i wiecej: "+": "+ results[76] +" Procentowo wszystkich z liczbami na koncu: "+  Math.round(((double)results[76]/results[5]*100) * 100.0) / 100.0+ "%");

        for(int i =1; i<6;i++){
            System.out.println(" \\newline Znaków specjalnych na poczatku: "+i+": "+ results[i+80] +" Procentowo wszystkich z Znaków specjalnychami na poczatku: "+  Math.round(((double)results[i+80]/results[22]*100) * 100.0) / 100.0+ "%");
        }
        System.out.println(" \\newline Znaków specjalnych na poczatku 6 i wiecej: "+": "+ results[86] +" Procentowo wszystkich z Znaków specjalnychami na poczatku: "+  Math.round(((double)results[86]/results[22]*100) * 100.0) / 100.0+ "%");

        for(int i =1; i<6;i++){
            System.out.println(" \\newline Znaków specjalnych na koncu: "+i+": "+ results[i+90] +" Procentowo wszystkich z Znaków specjalnychami na koncu: "+  Math.round(((double)results[i+90]/results[23]*100) * 100.0) / 100.0+ "%");
        }
        System.out.println(" \\newline Znaków specjalnych na koncu 6 i wiecej: "+": "+ results[96] +" Procentowo wszystkich z Znaków specjalnychami na koncu: "+  Math.round(((double)results[96]/results[23]*100) * 100.0) / 100.0+ "%");

        System.out.println(Math.round(((double)results[0]/results[29]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[1]/results[29]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[2]/results[29]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[3]/results[29]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[4]/results[3]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[5]/results[3]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[22]/results[0]*100) * 100.0) / 100.0);
        System.out.println(Math.round(((double)results[23]/results[0]*100) * 100.0) / 100.0);
        for(int i =1; i<16;i++){
            System.out.println(Math.round(((double)results[5+i]/results[29]*100) * 100.0) / 100.0);
        }
        System.out.println();
        for(int i =1; i<21;i++){
            System.out.println(Math.round(((double)results[i+30]/results[29]*100) * 100.0) / 100.0);
        }
        System.out.println();
        for(int i =1; i<7;i++){
            System.out.println(Math.round(((double)results[i+60]/results[4]*100) * 100.0) / 100.0);
        }
        for(int i =1; i<7;i++){
            System.out.println(Math.round(((double)results[i+70]/results[5]*100) * 100.0) / 100.0);
        }
        for(int i =1; i<7;i++){
            System.out.println(Math.round(((double)results[i+80]/results[22]*100) * 100.0) / 100.0);
        }
        for(int i =1; i<7;i++){
            System.out.println(Math.round(((double)results[i+90]/results[23]*100) * 100.0) / 100.0);
        }


    }

}
