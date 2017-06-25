package summoner.game;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileReaderModule {
    private String path;
    private int numberOfLines;
    private int startingLine;
    
    //This constructor takes the specified filepath 
    //and the number of lines it needs to read depending of which type of file
    public FileReaderModule(String filePath, int numberOfLines, int section)
    {
        path = filePath;
        this.numberOfLines = numberOfLines;
        startingLine = section*4;
    }
    
    public String[] OpenFile() throws IOException {
    
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        String[] textData = new String[numberOfLines];
        
        for (int i=0; i<numberOfLines; i++){
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        
        return textData;
    }
}
