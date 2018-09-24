
package heroModel.objects;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("heroes")
    @Expose
    public List<Hero> heroes = null;
    @SerializedName("status")
    @Expose
    public Long status;
    @SerializedName("count")
    @Expose
    public Long count;

}
