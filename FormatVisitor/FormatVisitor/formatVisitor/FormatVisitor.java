package formatVisitor;

import formatVisitor.And.Or;

interface Bbinop{
	public void _switch(Conditions condition);
}
  interface Conditions{
	  public void _case(And x);
	  public void _case(Or x);
  }
 class And implements Bbinop{

	@Override
	public void _switch(Conditions condition) {
		condition._case(this);
		
	}
	class Or implements Bbinop{

		@Override
		public void _switch(Conditions condition) {
			condition._case(this);
			
		}
		
	}
}


public class FormatVisitor {

}
