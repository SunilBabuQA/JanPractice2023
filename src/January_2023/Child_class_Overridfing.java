package January_2023;

public class Child_class_Overridfing  extends Parent_Class_Overriding{
	
	public void printzerotonine(int a)
	{
		int i=0;
		while(i<9)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("from child class");
	}

	public static void main(String[] args) {
		
		Child_class_Overridfing obj=new Child_class_Overridfing();
		obj.printzerotonine(2);
		
		Parent_Class_Overriding obj1=new Parent_Class_Overriding();
		obj1.printzerotonine(2);
		
	}

}
