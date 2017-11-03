package comp102x.project.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import comp102x.project.model.GameRecord;

public class SaveLoader {
	
	public void saveGameRecords(GameRecord[] records, String filename) throws FileNotFoundException {
		
		// Please write your code after this line
		PrintWriter pwriter = new PrintWriter(new File(filename));
        for (int i = 0; i < records.length; i++) {
            pwriter.println(records[i].getName() + '\t' + records[i].getLevel() + '\t' + records[i].getScore());
        }
        pwriter.close();
	}
	
	public GameRecord[] loadGameRecords(String filename) throws FileNotFoundException {
		
		// Please write your code after this line
		int num = 0;
        Scanner input = new Scanner(new File(filename));
        GameRecord[] records = new GameRecord[30];
        GameRecord[] finalRecords;
        Scanner line;
        String name;
        int level;
        int score;
        for (int i = 0; input.hasNextLine(); i++) {
            String oneline = input.nextLine();
            line = new Scanner(oneline).useDelimiter("\t");
            name = line.next();
            level = line.nextInt();
            score = line.nextInt();
            if (i >= 30) {
                break;
            }
            records[i] = new GameRecord(name, level, score);
            num++;
         
        }
        input.close();
        finalRecords = new GameRecord[num];
        for (int j = 0; j < num; j++) {
            finalRecords[j] = records[j];
        }
            
        return finalRecords; // This line should be modified or removed after finising the implementation of this method.
	}

}
