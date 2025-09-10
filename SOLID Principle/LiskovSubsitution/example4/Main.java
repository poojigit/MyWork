package LiskovSubsitution.example4;

public class Main {



    public static void main(String[] args) {

        NonEditableDocuments text=new TextDocument();
        NonEditableDocuments spreadsheet=new SpreadSheetDocument();
        NonEditableDocuments readonly=new ReadOnlyDocument();

        text.open();
        spreadsheet.open();
        readonly.open();


        EditableDocuments editableTextDocument=(EditableDocuments) text;
        editableTextDocument.edit("MyBook");
        editableTextDocument.save();

        EditableDocuments editableSpreadSheet=(EditableDocuments) text;
        editableSpreadSheet.edit("MyBook");
        editableSpreadSheet.save();



    }
}
