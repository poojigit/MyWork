package LiskovSubsitution.example4;

public interface EditableDocuments extends NonEditableDocuments{

    public void save();

    public void edit(String content);
}
