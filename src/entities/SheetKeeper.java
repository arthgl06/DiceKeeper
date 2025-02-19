package entities;

import java.util.ArrayList;
import java.util.List;

public class SheetKeeper {
    Sheet sheet;

    public SheetKeeper() {}

    List<Sheet> sheetList= new ArrayList<>();

    public Sheet getSheet() {
        return sheet;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    public void addSheet(Sheet sheet){
        sheetList.add(sheet);
    }

    public void removeSheet(Sheet sheet){
        sheetList.remove(sheet);
    }

}
