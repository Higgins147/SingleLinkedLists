
public class ConstructingSLL {

	protected String element;
	protected ConstructingSLL succ;
	

	public constructingSLL (String s) {
		constructingSLL sList1 = new constructingSLL(s);
	}
	
	public ConstructingSLL (String elem) {
		this(elem, null);
	}
	
	public ConstructingSLL (String elem, ConstructingSLL succ) {
		this.element = elem;
		this.succ = succ;
	}
}
