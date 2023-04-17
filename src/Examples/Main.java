package Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        int wordCount = 0;
        int lineCount = 0;
        FileReader myReader = new FileReader("test.txt");  // dosya bulundu

        BufferedReader br = new BufferedReader(myReader); //
        String str;

        while ((str = br.readLine()) != null)
        {
            lineCount++;
            for (int i = 0; i < str.length(); i++)
            {
                char c = str.charAt(i);
                str = str.toLowerCase();

                if (c == ' ')
                {
                    wordCount++;
                }
            }
        }

        myReader.close();

        // Satır sonlarındaki kelimeler boşluk olmadığı için arada kaynamasın.
        wordCount += lineCount;

        System.out.println("Kelime sayisi : " + wordCount);
    }
}
