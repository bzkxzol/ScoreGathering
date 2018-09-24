
package heroModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import heroModel.objects.Result;

public class HerosModel {

    @SerializedName("result")
    @Expose
    public Result result;

}
