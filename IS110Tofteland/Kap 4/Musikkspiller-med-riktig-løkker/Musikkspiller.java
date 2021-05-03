import java.util.ArrayList;
import java.util.Iterator;

public class Musikkspiller
{
    // Liste for musikk
    private ArrayList<String> files;
    private ArrayList<String> tracks;

    /**
     * Lage en musikkspiller
     */
    public Musikkspiller()
    {
        files = new ArrayList<>();
        tracks = new ArrayList<String>();
        tracks.add("Track1");
    }

    /**
     * Legg til fil
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Finne størrelse
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * Finne en fil
     */
    public void listFile(int index)
    {
        if (index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Fjerne en fil
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Vise en liste av alle filene i kolleksjonen med for-each løkke
     */
    public void listAllMedForEach() 
    {
        for(String filename : files) {
            System.out.println(filename);
        }
    }

    /**
     * Vise en liste av alle filene i kolleksjonen med while-løkke
     */
    public void listAllMedWhile()
    {
        int index = 0;
        while(index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
            index++;
        }
    }

    /** 
     * Vise en liste av alle filene i kolleksjonen med iterator
     */
    public void listAllMedIterator()
    {
        Iterator<String> it = files.iterator();
        while(it.hasNext()) {
            String t = it.next();
            System.out.println(t);
        }
    }
}
