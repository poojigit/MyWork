package LiskovSubsitution.example4;

public class TextDocument implements EditableDocuments{

    private String content;

    @Override
    public void open() {
        System.out.println("Document is permitted to open");
    }

    @Override
    public void save() {
        System.out.println("Document is saved:" +content);
    }

    @Override
    public void edit(String content) {
        this.content=content;
        System.out.println("Document name is:" +content);
    }
}
