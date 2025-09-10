package LiskovSubsitution.example4;

public class SpreadSheetDocument implements EditableDocuments {
    @Override
    public void open() {
        System.out.println("Document is permitted to open");
    }

    @Override
    public void save() {
        System.out.println("Document is saved");
    }

    @Override
    public void edit(String content) {
        System.out.println("Dcoument name is:" + content);
    }


}
