package dm.dev.notebook;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Note{
    long id;
    String title = "";
    String text = "";

    @Override
    public String toString(){
        return String.format("Note[ID='%l',title='%s',text='%s']");
    }
}