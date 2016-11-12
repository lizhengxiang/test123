package crimefragment.shejiao520.com.crimefragment;

import java.util.UUID;

/**
 * Created by Huoyunren on 2016/11/12.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime(){
        mId = UUID.randomUUID();
    }
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
