package entities;

import java.util.ArrayList;
import java.util.List;

public class SheetKeeper {
    Sheet sheet;

    public SheetKeeper() {}

    List<Sheet> sheetList= new ArrayList<>();

    public void addSheet(Sheet sheet){
        sheetList.add(sheet);
    }

    public void addSheet(int i, Sheet sheet){
        sheetList.add(i, sheet);
    }

    public void removeSheet(Sheet sheet){
        sheetList.remove(sheet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sheet shts : sheetList) {
            sb.append("\n" + shts + "\n");
        }

        return sb.toString();
    }
}
