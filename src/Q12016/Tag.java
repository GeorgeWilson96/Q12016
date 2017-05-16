package Q12016;

import java.util.ArrayList;

/**
 * Created by wilsonator on 16/05/17.
 */

public abstract class Tag {
    protected String name = "";
    protected ArrayList<Tag> tags = new ArrayList<Tag>();
    protected Object data;
    protected String dataType = "";
    public Tag(String dataType, Object data){

    }
    public abstract void render();
}
