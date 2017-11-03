package comp102x.project.task;

import comp102x.project.model.GameRecord;

public class RecordManager {

    public GameRecord[] updateGameRecords(GameRecord[] oldRecords, GameRecord newRecord) {
        
        boolean sameRecord = false;
        int numOfLevel = 0;
        int minIndex = 0;
        GameRecord[] updateRecords;
        for (int i =0; i < oldRecords.length; i++) {
            if (oldRecords[i].getLevel() == newRecord.getLevel()) {
                numOfLevel++;
                minIndex = i;
                if (oldRecords[i].getName().equals(newRecord.getName())) {
                     if (oldRecords[i].getScore() < newRecord.getScore()) {
                        oldRecords[i].setScore(newRecord.getScore());
                        sort(oldRecords);
                     }
                sameRecord = true;
                break;
               }
            }
        }
       if (sameRecord) { return oldRecords;}
       else if (numOfLevel < 10) {
           updateRecords = new GameRecord[oldRecords.length + 1];
           for (int j =0; j < oldRecords.length; j++) {
               updateRecords[j] = oldRecords[j];
            }
            updateRecords[oldRecords.length] = newRecord;
            sort(updateRecords);
            return updateRecords;
        }
        else {
            if (oldRecords[minIndex].getScore() >= newRecord.getScore()) {
                return oldRecords;
            }
            else {
            oldRecords[minIndex].setScore(newRecord.getScore());
            sort(oldRecords);
            return oldRecords;
        }
        }
        
            
         // This line should be modified or removed upon finishing the implementation of this method.
    }

    private void sort(GameRecord[] records) {
        
        Util.sort(records);
    }
}
