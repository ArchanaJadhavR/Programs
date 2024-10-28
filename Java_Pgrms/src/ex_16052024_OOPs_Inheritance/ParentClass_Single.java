package ex_16052024_OOPs_Inheritance;
//ParentClass_Single Class with the main Method:
//This is the entry point of the program with the main method.

public class ParentClass_Single {

	public static void main(String[] args) 
{
 {
//Parent_Single P: An instance of Parent_Single is created, and its parentmethod is called.
	 //which prints "This is a Parent method".

				Parent_Single P = new Parent_Single();
			       P.parentmethod();
			    
//Child_Single C: An instance of Child_Single is created, and its childmethod is called.
  //which prints "This is a child method".
			       
			    Child_Single C = new Child_Single();
			      C.childmethod();
			      
			        
			}
		

	}

}

//if we want override comment the parent object 