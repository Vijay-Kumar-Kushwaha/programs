package com.encapsulation;
/* No, the methods like setAccNo(), getAccNo(), setBal(), and getBal() are not stored in the heap segment. Instead, they are stored in a separate part of the JVM memory called the method area (or metaspace in more recent versions of Java). Here's a more detailed explanation:
 * 
 *	Where Methods Are Stored:
 *	Method Area / Metaspace:
 *	This is a part of the JVM memory where class-level information is stored, such as:
 *	Method definitions (including setAccNo(), getAccNo(), setBal(), getBal()).
 *	Bytecode for the methods.
 *	Static variables (if any).
 *	Constructor definitions.
 *	Information about the class structure itself.
 *	When a class is loaded into the JVM (e.g., Bank1), its methods are stored in the method area.
 *	This area is shared across all instances of the class, meaning that no matter how many Bank1 objects you create, there is only one copy of the method code in the method area.
 *	What Is Stored in the Heap:
 *	Heap Memory:
 *	Stores objects created using the new keyword.
 *	Stores instance variables (also called fields) for these objects.
 *	For example, when you do Bank1 b = new Bank1();, a Bank1 object is created in the heap, and it has space for its instance variables:
 *	bal (initialized to 0 by default).
 *	accNo (initialized to 0 by default).
 *	How Methods Interact with the Heap:
 *	While the methods are stored in the method area, they operate on the data stored in the heap.
 *	When you call b.setAccNo(1023823);:
 *	The setAccNo() method (stored in the method area) is executed.
 *	It takes 1023823 as an argument and modifies the accNo field of the Bank1 object referenced by b in the heap.
 *	Similarly, when you call b.getBal(), the getBal() method (stored in the method area) reads the bal value from the Bank1 object in the heap and returns it.
 *	Summary:
 *	Methods like setAccNo(), getAccNo(), setBal(), getBal() are stored in the method area, not in the heap.
 *	The heap stores the Bank1 object and its instance variables like bal and accNo.
 *	The method area stores the code for the methods and other class-level information.
 *	In this way, the method area and the heap work together during the execution of Java programs, with the method area holding the code and the heap holding the objects and their data.
*/

// READ THE INFORMATION ABOUT THE METHOD CREATION
// WHICH IS RELATED WITH METHOD AND HEAP SEGMENT.


/*   What Is Not in the Heap:
 *  Methods (setBal(), getBal(), setAccNo(), getAccNo()): 
 *  These are stored in the method area, not in the heap.
 *  Reference Variable b: This is stored in the stack memory
 *  since it is a local variable in the main method. 
 *  The reference b points to the Bank1 object in the heap.
*/
class Bank1{
	private int bal;
	private int accNo;
	
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
}
public class BankSetterGetter {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.setBal(1_00_000);
		b.setAccNo(1023823);
		System.out.println(b.getBal());
		System.out.println(b.getAccNo());		
	}

}
