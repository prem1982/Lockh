package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;


public class StdItemOptionCompositePK  implements Serializable{
	protected String std_Item;
	protected String option_Code;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((option_Code == null) ? 0 : option_Code.hashCode());
		result = prime * result + ((std_Item == null) ? 0 : std_Item.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StdItemOptionCompositePK other = (StdItemOptionCompositePK) obj;
		if (option_Code == null) {
			if (other.option_Code != null)
				return false;
		} else if (!option_Code.equals(other.option_Code))
			return false;
		if (std_Item == null) {
			if (other.std_Item != null)
				return false;
		} else if (!std_Item.equals(other.std_Item))
			return false;
		return true;
	}
	
}
