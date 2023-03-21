package superkeyword;
class TestParent{
	void test() {
		System.out.println("This is a parent class");
	}
}

public class Testchild extends TestParent {
	void test() {
		System.out.println("This is a child class test");
}
void display() {
	test();
super.test();
}

}
