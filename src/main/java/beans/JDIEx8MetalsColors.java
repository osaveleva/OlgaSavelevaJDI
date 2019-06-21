
package beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class JDIEx8MetalsColors {

    @SerializedName("summary")
    @Expose
    public List<Integer> summary = new ArrayList<>();
    @SerializedName("elements")
    @Expose
    public List<String> elements = new ArrayList<>();
    @SerializedName("color")
    @Expose
    public String color;
    @SerializedName("metals")
    @Expose
    public String metals;
    @SerializedName("vegetables")
    @Expose
    public List<String> vegetables = new ArrayList<>();

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("summary", summary).append("elements", elements).append("color", color).append("metals", metals).append("vegetables", vegetables).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(metals).append(color).append(vegetables).append(elements).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JDIEx8MetalsColors)) {
            return false;
        }
        JDIEx8MetalsColors rhs = ((JDIEx8MetalsColors) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(metals, rhs.metals).append(color, rhs.color).append(vegetables, rhs.vegetables).append(elements, rhs.elements).isEquals();
    }

}
