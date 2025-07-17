package LiskovSubsitution.example4;

public class ReadOnlyDocument implements NonEditableDocuments{
    @Override
    public void open() {
        System.out.println("It is only allowed to read");
    }
}
