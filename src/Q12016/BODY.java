package Q12016;

import java.util.ArrayList;

/**
 * Created by wilsonator on 16/05/17.
 */
public class BODY extends Tag {

    public BODY(Object data) {
        super("Tags", data);
    }

    @Override
    public void render() {
        ArrayList<Tag> tags;
        tags = (ArrayList<Tag>) data;
        for(Tag t :tags)
            t.render();
    }
}
