import java.awt.*;
import java.io.*;
class ReadStudentFile extends Frame
{TextField  number,name,marks;
    Button Done,next;
    Label numlabel,namelabel,marklabel;
    DataInputStream dis;
    boolean moreRecords=true;


    public ReadStudentFile()
    {
        super("create student file");
    }

    public void setup()
    {
        resize(400,200);
        setLayout(new GridLayout(4,2));
        number  =new TextField(25);
        
        numlabel=new Label("Roll number");

        name=new TextField(25);
        namelabel=new Label("Student Name");

        marks=new TextField(25);
        marklabel=new Label("Marks");
        next =new Button("NEXT");
        Done =new Button("DONE");

add(numlabel);
add(number);
add(namelabel);
add(name);
add(marklabel);
add(marks);
add(next);
add(Done);

show();
try
{
    dis=new DataInputStream(new FileinputStream("student.dat"));
    
}
catch(Exception e)
{
    System.err.println(e.toString());
    System.exit(1);
}


    }
 
}