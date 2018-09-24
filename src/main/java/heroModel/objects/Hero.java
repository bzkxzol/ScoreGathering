
package heroModel.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hero {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("localized_name")
    @Expose
    public String localizedName;

}
